package web.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.dto.MerchDto;
import web.exceptions.DataNotFoundException;
import web.exceptions.InvalidDataException;
import web.model.Merch;
import web.repository.MerchRepository;
import web.service.MerchService;

@Service
@RequiredArgsConstructor
public class MerchServiceImpl implements MerchService {

    private final MerchRepository merchRepository;

    @Override
    public Long saveMerch(String name, Long count) {
        return merchRepository.saveMerch(Merch.builder()
                .name(name)
                .count(count)
                .build());
    }

    @Override
    public boolean isAvailability(Long id) {
        Merch merch = merchRepository.findMerchById(id).orElseThrow(() ->
                new DataNotFoundException("Такого товара не существует."));

        if (merch.getCount() <= 0) {
            return false;
        }

        merch.setCount(merch.getCount() - 1);
        merchRepository.saveMerch(merch);
        return true;
    }

}
