/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import excepcionesPersonalizadas.MiExcepcionGenerica;
import excepcionesPersonalizadas.MiExepcionNumerica;

/**
 *
 * @author Estudiante
 */
public class Utilitario {
    
    public static int convertir(String numeroEnTexto) 
            throws 
            MiExepcionNumerica, 
            MiExcepcionGenerica{
        try{
            return Integer.parseInt(numeroEnTexto);
        }catch(NumberFormatException s){
            throw new MiExepcionNumerica();
        }catch(Exception ex){
            throw new MiExcepcionGenerica();
        }
    }
}
