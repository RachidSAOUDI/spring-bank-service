package ma.usmba.springbankservice.web;

import ma.usmba.springbankservice.dto.BankAccountRequestDTO;
import ma.usmba.springbankservice.dto.BankAccountResponseDTO;
import ma.usmba.springbankservice.entities.BankAccount;
import ma.usmba.springbankservice.repositories.BankAccountRepository;
import ma.usmba.springbankservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountGraphQLController {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountService accountService;
    @QueryMapping
    public List<BankAccount> accountsList(){
        return bankAccountRepository.findAll();
    }
    @QueryMapping
    public BankAccount bankAccountById(@Argument String id){
        return bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }
    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount){
        return accountService.addAccount(bankAccount);
    }
}
/* pour version java >=14
record BankAccountDTO(Double balance, String type, String currency){
}
 */
