/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utn.sistemagestiontransporte.app;

import java.util.Scanner;
import utn.sistemagestiontransporte.controlador.AgenciaTransporte;
import utn.sistemagestiontransporte.modelo.AutoInspeccion;
import utn.sistemagestiontransporte.modelo.Camion;
import utn.sistemagestiontransporte.modelo.Colectivo;
import utn.sistemagestiontransporte.modelo.TipoUso;
/**
 *
 * @author Lautaro
 */
public class Rec_1C32120250714Lautaro_Moro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgenciaTransporte agencia = new AgenciaTransporte();
        int opcion;
        do {
            System.out.println(" MENÚ AGENCIA ");
            System.out.println("1. Agregar Vehiculo");
            System.out.println("2. Mostrar Vehiculo");
            System.out.println("3. Iniciar recorrido");
            System.out.println("4. Mostrar marcas ordenadas");
            System.out.println("5. Mostrar vehiculos ordenados por año de fabricacion");
            System.out.println("6. Salir");
            System.out.println("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1: 
                    System.out.println("Tipo de vehiculo (1:Inspeccion, 2:Camion, 3:Colectivo): ");
                    int tipo = sc.nextInt(); 
                    sc.nextLine();
                    
                    String patente;
                    do{
                        System.out.println("patente: ");
                        patente = sc.nextLine();
                        if(patente.isEmpty()){
                            System.out.println("Es necesario una patente");
                        }
                    }while(patente.isEmpty());
                    
                    String marca;
                    do{
                        System.out.println("Marca: ");
                        marca = sc.nextLine();
                        if(marca.isEmpty()){
                            System.out.println("Es necesario una marca");
                        }
                    }while(marca.isEmpty());
                    
                   int anio;
                    do{
                        System.out.println("Año de fabricacion de vehiculo: ");
                        anio = sc.nextInt();
                        if(anio == 0){
                            System.out.println("Es necesario un año de fabricacion");
                        }
                    }while(anio == 0);
                   

                    switch (tipo) {
                        case 1:
                            System.out.print("Misión (1:MANTENIMIENTO, 2:SUPERVISION, 3:EMERGENCIA): ");
                            int m = sc.nextInt();
                            TipoUso tipoUso = switch (m) {
                                case 1 -> TipoUso.MANTENIMIENTO;
                                case 2 -> TipoUso.SUPERVISION;
                                case 3 -> TipoUso.EMERGENCIA;
                                default -> null;
                            };
                            if (tipoUso != null) {
                                agencia.agregarVehiculos(new AutoInspeccion(patente, marca, anio, tipoUso));
                            } else {
                                System.out.println("Tipo de uso inválido.");
                            }
                            break;

                        case 2:
                            int carga;
                            do{
                                System.out.print("Capacidad de carga (1-30): ");
                                carga = sc.nextInt();
                                if(carga >= 30 || carga < 1){
                                    System.out.println("No puede ingresar esa carga, intentelo de nuevo"); 
                                }
                            }while(carga >= 30 || carga < 1);
                            agencia.agregarVehiculos(new Camion(patente, marca, anio, carga));
                            break;

                        case 3:
                            int pasajeros;
                            do{
                                System.out.print("Pasajeros a bordo: ");
                                pasajeros = sc.nextInt();
                                if(pasajeros == 0 || pasajeros > 1500){
                                    System.out.println("No puede ingresar esa carga, intentelo de nuevo"); 
                                }
                            }while(pasajeros == 0 || pasajeros > 1500);
                            agencia.agregarVehiculos(new Colectivo(patente, marca, anio, pasajeros));
                            break;

                        default: 
                            System.out.println("Tipo inválido.");
                            break;
                }
                case 2:
                    agencia.mostrarVehiculos();
                    break;
                case 3:
                    agencia.iniciarRecorrido();
                    break;
                case 4: 
                    agencia.ordenarAlfabeticamente();
                    break;
                case 5:
                    agencia.ordenarPorAnio();
                    break;
                case 6:
                    System.out.println("saliendo!!!");
                    break;
                            
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }while (opcion != 6);
    }         
    
}
