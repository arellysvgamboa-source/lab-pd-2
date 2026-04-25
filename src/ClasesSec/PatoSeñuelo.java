/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesSec;

/**
 *
 * @author ARELLYS
 */
public class PatoSeñuelo extends Pato {
    
    public PatoSeñuelo(){
        cuaqueable = new CuaqueoMudo();
        volable = new NoVuela();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un Pato real");
    }

    
}
