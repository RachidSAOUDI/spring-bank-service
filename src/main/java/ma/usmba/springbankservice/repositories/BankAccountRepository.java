package ma.usmba.springbankservice.repositories;

import ma.usmba.springbankservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
