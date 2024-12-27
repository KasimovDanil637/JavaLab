package web.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.dto.ResponseDto;

@FeignClient("delivery-service")
@Component
public interface DeliverService {

    @GetMapping("/delivery/{id}")
    ResponseDto getDeliveryId(final @PathVariable Long id);
}
