package com.c06.services.impl;

import com.c06.constant.AccountStatus;
import com.c06.model.entities.Account;
import com.c06.model.payload.request.RequestCreateAccount;
import com.c06.model.payload.response.ResponseCreateAccount;
import com.c06.model.payload.response.ResponseLGetListAccount;
import com.c06.repositories.AccountRepository;
import com.c06.services.AccountService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public ResponseCreateAccount saveAccount(RequestCreateAccount data) {
        Account account = new Account();
        account.setUsername(data.getUserName());
        account.setPassword(data.getPassword());
        account.setStatus(AccountStatus.valueOf(data.getStatus())); // Assuming status is a string matching enum names

        account = accountRepository.save(account);

        return ResponseCreateAccount.builder()
                .userName(account.getUsername())
                .password(account.getPassword())
                .status(account.getStatus().name())
                .build();
    }

    public List<ResponseLGetListAccount> getAllAccounts() {
        return accountRepository.findAll().stream()
                .map(account -> ResponseLGetListAccount.builder()
                        .id(account.getId().toString())
                        .userName(account.getUsername())
                        .password(account.getPassword())
                        .status(account.getStatus().name())
                        .build())
                .collect(Collectors.toList());
    }
}
