package org.sid.bankaccountservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bankaccountservice.enums.AccountType;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankAccountResponseSTO {
    private String id;
    private Date createdAt ;
    private Double balance;
    private String currency;
    private AccountType type ;
}
