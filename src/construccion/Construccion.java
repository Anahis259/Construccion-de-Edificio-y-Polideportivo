/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccion;

import construccion.entidades.EdificioDeOficinas;
import construccion.entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author anahi
 */
public class Construccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificios> edificio = new ArrayList();
        EdificioDeOficinas edificioCreado = new EdificioDeOficinas(); 
        Polideportivo polideportivo = new Polideportivo(); 
        System.out.println("Llenaremos los datos del EDIFICIO: ");
        for (int i = 0; i < 1; i++) {
            edificioCreado.crearEdificio();
            edificio.add(edificioCreado);
            edificioCreado = new EdificioDeOficinas(); 
             
        }
        System.out.println("Llenaremos los datos del POLIDEPORTIVO: ");
        for (int i = 0; i < 2; i++) {
            polideportivo.datosPolideportivo();
            edificio.add(polideportivo);
            polideportivo = new Polideportivo(); 
             
        }
        
        for (Edificios aux : edificio) {
            System.out.println("Detalle: "+ aux.toString());
            System.out.println("La Superficie es de:  "+aux.calculoSuperficie());
            System.out.println("El volumen es de: "+ aux.calculoVolumen());
            if ( aux instanceof EdificioDeOficinas ){
            System.out.println("Cantidad de personas que recibe el edificio es de: "+ ((EdificioDeOficinas) aux).cantidadPersonas());
            System.out.println("Cantidad de oficinas totales del edificio es de: "+ ((EdificioDeOficinas) aux).cantidadOficinas());
            }
            
        
        }   
        int techados=0; 
        int abiertos=0; 
        boolean band; 
        for (Edificios modelo : edificio) {
            if (modelo instanceof Polideportivo){
                if (((Polideportivo) modelo).getTipoInstalacion().equals("techado")){
                band = true; 
                techados++; 
            }else if(((Polideportivo) modelo).getTipoInstalacion().equals("abierto")){
                    band = false;
                    abiertos++;
                    }
            }
            
        }
        System.out.println("Cantidad de techados: "+techados);
        System.out.println("Cantidad de techados: "+abiertos);

//        for (int i = 0; i < edificio.size(); i++) {
//           if(edificio.get(i) instanceof Polideportivo ){
//               if (polideportivo.getTipoInstalacion().equals("techado")&& polideportivo.getTipoInstalacion().equals("TECHADO")){
//            System.out.println("La cantidad de polideportivos techados es de: "+ techados++);
//        }else if(polideportivo.getTipoInstalacion().equals("abierto")&& polideportivo.getTipoInstalacion().equals("ABIERTO")){
//            System.out.println("La cantidad de polideportivos abiertos es de: "+ abiertos++);
//        }else{
//            System.out.println("!El dato ingresado no es techado ni abierto!");
//        }
//               
//           } 
//        }
        
    }
    
}
