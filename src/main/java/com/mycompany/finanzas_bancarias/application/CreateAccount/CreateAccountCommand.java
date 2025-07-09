/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finanzas_bancarias.application.CreateAccount;

import com.mycompany.finanzas_bancarias.domain.entidades.account;

/**
 *
 * @author User
 */
public class CreateAccountCommand {
    private String ccc;
    private double saldoActual;
    private double saldoMedio;
    private String tipo;
    private String tipoAmortizacion;
    private String clienteId;

    public CreateAccountCommand(String ccc, double saldoActual, double saldoMedio, String tipo, String tipoAmortizacion, String clienteId) {
        this.ccc = ccc;
        this.saldoActual = saldoActual;
        this.saldoMedio = saldoMedio;
        this.tipo = tipo;
        this.tipoAmortizacion = tipoAmortizacion;
        this.clienteId = clienteId;
        
        
         }
        public account toAccount() {
        return new account(ccc, saldoActual, saldoMedio, tipo, tipoAmortizacion, clienteId);
    }
   
    }

    