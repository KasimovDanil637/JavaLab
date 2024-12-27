package web.repository.impl;

import org.springframework.stereotype.Repository;
import web.model.Delivery;
import web.repository.DeliveryRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class DeliveryRepositoryImpl implements DeliveryRepository {

    private final Map<Long, Delivery> dataBase = new HashMap<>();

    @Override
    public void save(Delivery delivery) {
        Long id = dataBase.keySet().stream()
                .max(Long::compare)
                .orElse(0L) + 1;

        delivery.setId(id);
        dataBase.put(id, delivery);
    }

    @Override
    public Optional<Delivery> findByMerchId(Long id) {
        return dataBase.values().stream()
                .filter(delivery -> delivery.getMerchId().equals(id))
                .findFirst();
    }

}
