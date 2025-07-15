/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.sistemagestiontransporte.controlador;

import java.util.ArrayList;
import java.util.Collections;
import utn.sistemagestiontransporte.modelo.ComparadorPorNombre;
import utn.sistemagestiontransporte.modelo.Vehiculo;

/**
 *
 * @author Lautaro
 */
public class AgenciaTransporte {
    private ArrayList<Vehiculo> vehiculos;

    public AgenciaTransporte() {
        vehiculos = new ArrayList<>(); 
    }
    
    public void agregarVehiculos(Vehiculo nuevo){
        for(Vehiculo vn: vehiculos){
            if(vn.equals(nuevo)){
                System.out.println("El vehiculo que intenta agregar a la agencia, ya fue registrado!!");
                
            }
        }
        vehiculos.add(nuevo);
        System.out.println("Vehiculo agregado exitosamente!");
    }
    
    
    public void mostrarVehiculos(){
        if(vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados en la agencia");
            return;
        }else{
            for(Vehiculo v: vehiculos){
                System.out.println(v.toString());
            }
        }
    }
    
    public void iniciarRecorrido(){
        for(Vehiculo v: vehiculos){
            if(v.puedeRecorrer()){
                System.out.println("Iniciando recorrido");
            }else{
                System.out.println("No se puede realizar la exploracion");
            }
        }
    }
    public void ordenarAlfabeticamente(){
        Collections.sort(vehiculos, new ComparadorPorNombre());
        mostrarVehiculos();
    }
    public void ordenarPorAnio(){
        Collections.sort(vehiculos);
        mostrarVehiculos();
    }
    
}
