package com.example.demo.domain;

import java.util.HashMap;

public class Concesionario {
    private HashMap<String, Coche> listaCoches = new HashMap<>();
    private HashMap<String, Propietario> listaPropietarios = new HashMap<>();
    private HashMap<String, Exposicion> listaExposicion = new HashMap<>();

    public Concesionario(HashMap<String, Coche> listaCoches, HashMap<String, Propietario> listaPropietarios, HashMap<String, Exposicion> listaExposicion) {
        this.listaCoches = listaCoches;
        this.listaPropietarios = listaPropietarios;
        this.listaExposicion = listaExposicion;
    }
    public Concesionario() {

    }

    public HashMap<String, Coche> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(HashMap<String, Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }

    public HashMap<String, Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(HashMap<String, Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public HashMap<String, Exposicion> getListaExposicion() {
        return listaExposicion;
    }

    public void setListaExposicion(HashMap<String, Exposicion> listaExposicion) {
        this.listaExposicion = listaExposicion;
    }
}