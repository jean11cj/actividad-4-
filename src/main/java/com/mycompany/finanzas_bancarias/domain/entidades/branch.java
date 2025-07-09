/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finanzas_bancarias.domain.entidades;

/**
 *
 * @author User
 */
public class branch {
    private String numero;
    private String direccion;
    private String codigo_postal;
    private String ciudad;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public branch(String numero, String direccion, String codigo_postal, String ciudad) {
        this.numero = numero;
        this.direccion = direccion;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
    }
}
