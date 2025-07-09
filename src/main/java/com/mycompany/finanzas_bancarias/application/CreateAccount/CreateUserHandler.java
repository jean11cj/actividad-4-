/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finanzas_bancarias.application.CreateAccount;

import com.mycompany.finanzas_bancarias.domain.entidades.account;
import com.mycompany.finanzas_bancarias.domain.puertos.accountRepository;

/**
 *
 * @author User
 */
public class CreateUserHandler implements ICreateaccount {
    
    private final accountRepository repository;
    
    public  CreateUserHandler(accountRepository repository){
        this.repository = repository;
    }
   
public void handle (CreateAccountCommand accountcommand) { 
        this.repository.save((account) accountcommand.toAccount());
    
}


   }
    

