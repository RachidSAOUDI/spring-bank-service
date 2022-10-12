package ma.usmba.springbankservice.mappers;

import ma.usmba.springbankservice.dto.BankAccountResponseDTO;
import ma.usmba.springbankservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
