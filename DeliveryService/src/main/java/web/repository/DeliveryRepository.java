package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Delivery;

import java.util.Optional;

@Repository
public interface DeliveryRepository {

    void save(Delivery delivery);

    Optional<Delivery> findByMerchId(Long id);
}
