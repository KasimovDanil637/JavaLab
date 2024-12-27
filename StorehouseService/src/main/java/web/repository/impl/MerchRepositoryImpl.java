package web.repository.impl;

import org.springframework.stereotype.Repository;
import web.model.Merch;
import web.repository.MerchRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class MerchRepositoryImpl implements MerchRepository {

    private final Map<Long, Merch> dataBase = new HashMap<>();

    @Override
    public Optional<Merch> findMerchById(Long id) {
        return Optional.ofNullable(dataBase.get(id));
    }

    @Override
    public Long saveMerch(Merch merch) {
        Long id = dataBase.keySet().stream()
                .max(Long::compare)
                .orElse(0L) + 1;

        merch.setId(id);
        dataBase.put(merch.getId(), merch);
        return id;
    }
}
