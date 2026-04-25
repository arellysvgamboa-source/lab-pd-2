/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesSec;
import Interfaces.*;
/**
 *
 * @author ARELLYS
 */
public abstract class Pato {
    
    Volable volable;
    Cuaqueable cuaqueable;
    
    public abstract void mostrar();

    public Pato() {
    }
    
    public void realizarCuaqueo(){
        cuaqueable.cuaquear();
    }
    
    public void realizarVuelo(){
        volable.volar();
    }

    public void nadar(){
        System.out.println("Todos los patos nadan");
    }
    
}
