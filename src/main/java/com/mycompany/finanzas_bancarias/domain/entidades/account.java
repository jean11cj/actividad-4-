/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finanzas_bancarias.domain.entidades;

/**
 *
 * @author User
 */
public class account {
    
   private String ccc;
   private String saldo_actual;
   private String saldo_medio;
   private String tipo;
   private String tipo_amortizacion;
   private String cliente_id;

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public String getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(String saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public String getSaldo_medio() {
        return saldo_medio;
    }

    public void setSaldo_medio(String saldo_medio) {
        this.saldo_medio = saldo_medio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo_amortizacion() {
        return tipo_amortizacion;
    }

    public void setTipo_amortizacion(String tipo_amortizacion) {
        this.tipo_amortizacion = tipo_amortizacion;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public account(String ccc, double saldoActual, double saldoMedio, String saldo_actual, String saldo_medio, String tipo) {
        this.ccc = ccc;
        this.saldo_actual = saldo_actual;
        this.saldo_medio = saldo_medio;
        this.tipo = tipo;
        this.tipo_amortizacion = tipo_amortizacion;
        this.cliente_id = cliente_id;
    }
    
}
