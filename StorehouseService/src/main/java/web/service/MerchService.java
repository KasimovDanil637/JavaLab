package web.service;

import org.springframework.stereotype.Service;
import web.dto.MerchDto;

@Service
public interface MerchService {

    Long saveMerch(String name, Long count);

    boolean isAvailability(Long id);
}
