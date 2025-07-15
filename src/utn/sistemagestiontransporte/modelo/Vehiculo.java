/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.sistemagestiontransporte.modelo;


/**
 *
 * @author Lautaro
 */
public abstract class Vehiculo implements Comparable<Vehiculo>  {
    protected String patente;
    protected String marca;
    protected int anioFabricacion;

    public Vehiculo(String patente, String marca, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
       
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    
    public boolean equals(Vehiculo otro) {
        return this.patente.equalsIgnoreCase(otro.patente) && this.anioFabricacion == otro.anioFabricacion;
    }
    
    /**
     * Devuelve las caracteristicas de la nave.
     */
    @Override
    public String toString(){
        return "Patente: " + patente + "-Marca: " + marca + "-Año de Fabricacion: " + anioFabricacion;
    }

    public abstract boolean puedeRecorrer();

    @Override
    public int compareTo(Vehiculo o) {
       return Integer.compare(o.getAnioFabricacion(), this.anioFabricacion);
    }
}

