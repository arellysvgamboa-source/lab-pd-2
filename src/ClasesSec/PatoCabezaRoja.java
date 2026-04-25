/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesSec;

/**
 *
 * @author ARELLYS
 */
public class PatoCabezaRoja extends Pato{
    
    public PatoCabezaRoja(){
        cuaqueable = new Cuaqueo();
        volable = new VuelaConAlas();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un Pato de cabeza roja");
    }
}
