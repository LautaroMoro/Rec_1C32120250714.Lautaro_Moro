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
public class Camion extends Vehiculo{
    private int capacidadCarga;

    public Camion(String patente, String marca, int anioFabricacion, int capacidadCarga) {
        super(patente, marca, anioFabricacion);
        this.capacidadCarga = capacidadCarga;
        
    }

   public int getCapacidadCarga(){
       return capacidadCarga;
   }
    @Override
    public String toString(){
         return super.toString() + "|" + "Carga maxima: " + capacidadCarga + "Toneladas";
    }

    @Override
    public boolean puedeRecorrer() {
        return true;
    }
    
}   