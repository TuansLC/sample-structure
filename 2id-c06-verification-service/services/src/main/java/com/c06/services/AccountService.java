package com.c06.services;

import com.c06.model.entities.Account;
import com.c06.model.payload.request.RequestCreateAccount;
import com.c06.model.payload.response.ResponseCreateAccount;
import com.c06.model.payload.response.ResponseLGetListAccount;

import java.util.List;

public interface AccountService {
    ResponseCreateAccount saveAccount(RequestCreateAccount data);

    List<ResponseLGetListAccount> getAllAccounts();
}
