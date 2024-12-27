package web.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.exception.DataNotFoundException;
import web.model.Delivery;
import web.repository.DeliveryRepository;
import web.service.DeliveryService;

@Service
@RequiredArgsConstructor
@Log4j2
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public void saveDelivery(Delivery delivery) {
        deliveryRepository.save(delivery);
        log.info("Заказ добавлен: {}", delivery);
    }

    @Override
    public Delivery findDeliveryById(Long id) {
        return deliveryRepository.findByMerchId(id).orElseThrow(() -> new DataNotFoundException("Заказ не найден."));
    }
}
