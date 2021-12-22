/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccion.entidades;

import construccion.Edificios;
import java.util.Scanner;

/**
 *
 * @author anahi
 */
public class EdificioDeOficinas extends Edificios{
    private int nroOficinas = 1; 
    private int cantidadPersonas; //por oficina
    private int nroPisos; //del edificio

    public EdificioDeOficinas() {
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getCantidadPersonas() {
        
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }
    public void crearEdificio(){
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese cantidad de personas por oficina: ");
        setCantidadPersonas(leer.nextInt());
        System.out.println("Ingrese el numero de pisos que tiene el edificio: ");
        setNroPisos(leer.nextInt());
        System.out.println("Ingrese la altura: ");
        alto = leer.nextDouble(); 
        System.out.println("Ingrese el ancho: ");
        ancho = leer.nextDouble();
        System.out.println("Ingrese el largo: ");
        largo = leer.nextDouble();
    }
    
    @Override
   public double calculoSuperficie(){
       return super.calculoSuperficie();
   }         
    @Override
   public double calculoVolumen() {
       return super.calculoVolumen();
       
   }
   public int cantidadPersonas(){
      int totalPersonas = cantidadPersonas*nroPisos;
      return totalPersonas; 
   }
   public int cantidadOficinas(){
       int totalOficinas = nroOficinas * nroPisos; 
       return totalOficinas; 
   }

    @Override
    public String toString() {
        return super.toString()+"Oficinas por piso: "+getNroOficinas()+"Cantidad de personas por oficina: "+cantidadPersonas+ "Total de pisos del edificio: "+nroPisos; //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
