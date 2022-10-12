package ma.usmba.springbankservice.service;

import ma.usmba.springbankservice.dto.BankAccountRequestDTO;
import ma.usmba.springbankservice.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
