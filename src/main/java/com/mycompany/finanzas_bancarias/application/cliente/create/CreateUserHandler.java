/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finanzas_bancarias.application.cliente.create;

import com.mycompany.finanzas_bancarias.domain.puertos.IClientRepository;


public class CreateUserHandler implements ICreateClient{
    
    private final IClientRepository repository;

    public CreateUserHandler(IClientRepository repository) {
        this.repository = repository;
    }

    
    @Override
    public void handle(CreateClientCommand clientCommand){ 
        this.repository.save(clientCommand.toClient());
    }
    
}
