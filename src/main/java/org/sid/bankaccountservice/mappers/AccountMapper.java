package org.sid.bankaccountservice.mappers;
import org.sid.bankaccountservice.DTO.BankAccountResponseSTO;
import org.sid.bankaccountservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseSTO frombankAccount(BankAccount bankAccount)
    {
        BankAccountResponseSTO bankAccountResponseSTO = new BankAccountResponseSTO();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseSTO);
        return bankAccountResponseSTO;
    }
}
