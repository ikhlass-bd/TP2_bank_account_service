package org.sid.bankaccountservice.services;
import org.sid.bankaccountservice.DTO.BankAccountRequestDTO;
import org.sid.bankaccountservice.DTO.BankAccountResponseSTO;
import org.sid.bankaccountservice.entities.BankAccount;
import org.sid.bankaccountservice.mappers.AccountMapper;
import org.sid.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.UUID;
@Service

public class BankServiceImp implements BankService {
    @Autowired
    BankAccountRepository bankAccountRepository;

    @Autowired
    AccountMapper accountMapper;

    @Override
    public BankAccountResponseSTO addAccount(BankAccountRequestDTO bankAccountRequestDTO) {
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(new Date())
                .currency(bankAccountRequestDTO.getCurrency())
                .type(bankAccountRequestDTO.getType())
                .balance(bankAccountRequestDTO.getBalance())
                .build();
        BankAccount saveAccount = bankAccountRepository.save(bankAccount);
        BankAccountResponseSTO bankAccountResponseSTO = accountMapper.frombankAccount(saveAccount);

        return bankAccountResponseSTO;
    }
}
