package com.example.demo.domain;

public class Coche {
    private int id;
    private String marca;
    private String modelo;
    private String matricula;
    private Propietario propietario;
    private Exposicion exposicion;

    public Coche(int id, String marca, String modelo, String matricula, Exposicion exposicion) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.exposicion = exposicion;
    }

    public Coche(int id, String marca, String modelo, String matricula, Propietario propietario, Exposicion exposicion) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.propietario = propietario;
        this.exposicion = exposicion;
    }

    public Coche() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Exposicion getExposicion() {
        return exposicion;
    }

    public void setExposicion(Exposicion exposicion) {
        this.exposicion = exposicion;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", propietario=" + propietario +
                ", exposicion=" + exposicion +
                '}';
    }
}
