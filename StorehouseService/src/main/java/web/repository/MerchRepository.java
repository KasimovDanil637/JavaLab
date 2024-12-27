package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Merch;

import java.util.Optional;

@Repository
public interface MerchRepository {

    Optional<Merch> findMerchById(Long id);

    Long saveMerch(Merch merch);
}
