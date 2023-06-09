/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author Estudiante
 */
public class MiExepcionNumerica extends Exception{
    
    private final static String MESSAGE = ""
            + "Error de conversion numerica, "
            + "ingresa un texto que contemga un numero";

    public MiExepcionNumerica() {
        super(MESSAGE);
    }
    
}
