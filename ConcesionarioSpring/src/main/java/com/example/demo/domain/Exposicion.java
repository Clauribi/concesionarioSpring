package com.example.demo.domain;

import java.util.HashMap;

public class Exposicion {
    private int numero;
    private String direccion;
    private String telefono;

    public Exposicion(int numero, String direccion, String telefono) {
        this.numero = numero;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Exposicion() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Exposicion{" +
                "numero=" + numero +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
