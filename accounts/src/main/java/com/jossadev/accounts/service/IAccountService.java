package com.jossadev.accounts.service;

import com.jossadev.accounts.dto.CustomerDto;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);
}
