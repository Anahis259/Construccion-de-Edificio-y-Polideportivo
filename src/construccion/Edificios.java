/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccion;

/**
 *
 * @author anahi
 */
public class Edificios {
    protected double ancho;
    protected double alto;
    protected double largo;
    
    
    public Edificios(){
        
    }

    public Edificios(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    public double calculoSuperficie(){
        double superficie = largo * ancho; 
        return superficie; 
    }
    
    public double calculoVolumen(){
      double volumen = alto*ancho*largo; 
      return volumen;
    }

    @Override
    public String toString() {
        return "Edificios{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
}
