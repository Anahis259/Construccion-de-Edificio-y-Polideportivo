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
public class Polideportivo extends Edificios{
    private String nombre; 
    private String tipoInstalacion; //abierto o techado....

    public Polideportivo() {
    }
    
    
    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    public void datosPolideportivo(){
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese nombre del polideportivo: ");
        setNombre(leer.next());
        System.out.println("Ingrese la altura: ");
        alto = leer.nextDouble(); 
        System.out.println("Ingrese el ancho: ");
        ancho = leer.nextDouble();
        System.out.println("Ingrese el largo: ");
        largo = leer.nextDouble();
        do{
        System.out.println("Indique si es techado o abierto: ");
        setTipoInstalacion(leer.next());
        }while(getTipoInstalacion().equals("techado")&&getTipoInstalacion().equals("TECHADO")&&getTipoInstalacion().equals("ABIERTO")&&getTipoInstalacion().equals("abierto")) ;
    }
    @Override
    public double calculoSuperficie(){
        return super.calculoSuperficie();
    }
    @Override
    public double calculoVolumen(){
        return super.calculoVolumen();
    }

    @Override
    public String toString() {
        return super.toString()+"Nombre del polideportivo: "+ getNombre()+" Tipo de instalacion: "+getTipoInstalacion(); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
}
