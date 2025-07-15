/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.sistemagestiontransporte.modelo;

import java.util.ArrayList;
import utn.sistemagestiontransporte.modelo.Vehiculo;

/**
 *
 * @author Lautaro
 */
public class AutoInspeccion  extends Vehiculo{
    private TipoUso tipoUso;

    public AutoInspeccion(String patente, String marca, int anioFabricacion, TipoUso tipoUso) {
        super(patente, marca, anioFabricacion);
        this.tipoUso = tipoUso;
    }

    
    /**
     * 
     * @return String del tipo de mision 
     */
    public TipoUso getTipoUso(){
        return tipoUso;
    }
    
    /**
     * 
     * @return String con descripción de la nave exploradora.
     */
    @Override
    public String toString(){
       return super.toString() + "Tipo de Mision: " + tipoUso ; 
    }

    @Override
    public boolean puedeRecorrer() {
        return false;
    }

}
