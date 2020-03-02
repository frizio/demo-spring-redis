package cloud.frizio.services.demospringredis.repository;

import org.springframework.data.repository.CrudRepository;
import cloud.frizio.services.demospringredis.model.Transaction;
import java.util.List;


public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    List<Transaction> findByFromAccountId(Long fromAccountId);
    List<Transaction> findByToAccountId(Long toAccountId);
}