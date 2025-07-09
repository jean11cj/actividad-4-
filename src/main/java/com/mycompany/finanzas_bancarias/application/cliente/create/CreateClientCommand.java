/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finanzas_bancarias.application.cliente.create;

import com.mycompany.finanzas_bancarias.domain.entidades.Client;

/**
 *
 * @author User
 */
public class CreateClientCommand {
    private String id;
    private String nombre;
    private String direccion;
    private String tipo;

    public CreateClientCommand(String id, String nombre, String direccion, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
        //agregar validaciones
    }

    public Client toClient (){
        return new Client(id,nombre,direccion,tipo);
    }
    
    
}
