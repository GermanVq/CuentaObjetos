/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package excepciones;

/**
 *
 * @author gvega2
 */
public class NoNegativoExcepcion extends Exception{
    public NoNegativoExcepcion(String msg){
        super (msg);
    }
}
