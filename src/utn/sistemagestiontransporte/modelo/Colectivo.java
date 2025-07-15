/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.sistemagestiontransporte.modelo;

import utn.sistemagestiontransporte.modelo.Vehiculo;

/**
 *
 * @author Lautaro
 */
public class Colectivo extends Vehiculo{
    private int cantidadPasajeros;
    public Colectivo(String patente, String marca, int anioFabricacion, int cantidadPasajeros) {
        super(patente, marca, anioFabricacion);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }
    
    /**
     * 
     * @return String con la descripcion de la nave
     */
   @Override 
   public String toString(){
    return super.toString() + "Pasajeros maximos: " +  cantidadPasajeros; 
   }  
    @Override
    public boolean puedeRecorrer() {
        return true;
    }

}
