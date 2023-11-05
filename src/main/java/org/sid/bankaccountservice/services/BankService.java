package org.sid.bankaccountservice.services;

import org.sid.bankaccountservice.DTO.BankAccountRequestDTO;
import org.sid.bankaccountservice.DTO.BankAccountResponseSTO;

public interface BankService  {
    public BankAccountResponseSTO addAccount(BankAccountRequestDTO bankAccountRequestDTO);
}
