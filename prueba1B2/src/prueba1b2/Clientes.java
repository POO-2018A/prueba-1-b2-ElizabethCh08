/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1b2;

/**
 *
 * @author ESFOT
 */
public class Clientes {

    private String nombreC;
    private String cedulaC;

    public Clientes(String nombreC, String cedulaC) {
        this.nombreC = nombreC;
        this.cedulaC = cedulaC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getCedulaC() {
        return cedulaC;
    }

    @Override
    public String toString() {
        return nombreC +"  " + cedulaC ;
    }

    public void setCedulaC(String cedulaC) {
        this.cedulaC = cedulaC;
    }
    
   
    
}
