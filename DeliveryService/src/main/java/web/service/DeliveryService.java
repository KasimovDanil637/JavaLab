package web.service;

import org.springframework.stereotype.Service;
import web.model.Delivery;

@Service
public interface DeliveryService {

    void saveDelivery(Delivery delivery);

    Delivery findDeliveryById(Long id);
}
