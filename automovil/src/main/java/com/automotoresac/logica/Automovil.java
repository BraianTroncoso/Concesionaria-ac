package com.automotoresac.logica;

public class Automovil {
    private String marca, motor, color, patente, modelo;
    private int id, puertas;


    public int cantidadPuertas(int puertas){
     this.puertas = puertas;
     return puertas;
    }

    public Automovil(){
    }
    public Automovil(String marca, String motor, String color, String patente, int id, String modelo) {
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.patente = patente;
        this.id = id;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
