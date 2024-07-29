package com.c06.controller;

import com.c06.model.entities.Account;
import com.c06.model.payload.request.RequestCreateAccount;
import com.c06.model.payload.response.GenericResponse;
import com.c06.model.payload.response.ResponseCreateAccount;
import com.c06.model.payload.response.ResponseLGetListAccount;
import com.c06.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.c06.constant.AppConstant.SUCCESS_CODE;
import static com.c06.constant.AppConstant.SUCCESS_MESS;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {
    @Autowired
    AccountService accountService ;

    @PostMapping("/save")
    public GenericResponse<ResponseCreateAccount> saveAccount(@RequestBody RequestCreateAccount data) {
        ResponseCreateAccount response = accountService.saveAccount(data);
        return new GenericResponse<>(SUCCESS_CODE, SUCCESS_MESS, response);
    }

    @GetMapping("/all")
    public GenericResponse<List<ResponseLGetListAccount>> getAllAccounts() {
        List<ResponseLGetListAccount> list =  accountService.getAllAccounts();
        return new GenericResponse<>(SUCCESS_CODE, SUCCESS_MESS, list);
    }
}
