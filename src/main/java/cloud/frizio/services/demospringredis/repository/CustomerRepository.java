package cloud.frizio.services.demospringredis.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import cloud.frizio.services.demospringredis.model.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
  Customer findByExternalId(String externalId);
  List<Customer> findByAccountsId(Long id);
}
