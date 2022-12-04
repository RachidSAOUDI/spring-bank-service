package ma.usmba.springbankservice.service;

import ma.usmba.springbankservice.dto.BankAccountRequestDTO;
import ma.usmba.springbankservice.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
