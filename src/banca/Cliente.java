/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

/**
 *
 * @author Juan Osorio
 */
public class Cliente {
    private String nombre;
    private String cedula;
    private String direccion;
    private String clave;

    public Cliente(String nombre, String cedula, String direccion, String clave) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.clave = clave;
    }
    
    public boolean abrirCuenta(String tipo){
        return false;
    }
    public boolean pedirTarjeta(String tipo){
        return false;
    }
    public boolean pedirPrestamo(double cantidad){
        return false;
    }
    
}
