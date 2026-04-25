/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClasePrincipal;

import ClasesSec.PatitoDeGoma;
import ClasesSec.PatoCabezaRoja;
import ClasesSec.PatoReal;
import ClasesSec.PatoSeñuelo;

/**
 *
 * @author ARELLYS
 */
public class SimUPato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PatoReal preal = new PatoReal();
        PatoSeñuelo pse = new PatoSeñuelo();
        PatitoDeGoma patg = new PatitoDeGoma();
        PatoCabezaRoja pCroj = new PatoCabezaRoja();
        
        preal.mostrar();
        preal.realizarCuaqueo();
        preal.realizarVuelo();
        preal.nadar();
        System.out.println();
        pse.mostrar();
        pse.realizarCuaqueo();
        pse.realizarVuelo();
        pse.nadar();
        System.out.println();
        patg.mostrar();
        patg.realizarCuaqueo();
        patg.realizarVuelo();
        patg.nadar();
        System.out.println();
        pCroj.mostrar();
        pCroj.realizarCuaqueo();
        pCroj.realizarVuelo();
        pCroj.nadar();
        
    }
    
}
