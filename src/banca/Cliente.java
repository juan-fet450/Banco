/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Juan Osorio
 * @since 8/25/2020
 */
//edicion por medio de git

public class Cliente {
    private String nombre;
    private String cedula;
    private String direccion;
    private String clave;
    private Set<Double> numCuenta = new HashSet<>();

    private Banco bank = new Banco();
    
    public Cliente(String nombre, String cedula, String direccion, String clave) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
//Metodo para abrir una cuenta
    public boolean abrirCuenta(String tipo){
        
        double aux, aux2;
        
        boolean var = false, generado = false;
        
        while (!generado) {
            
            aux2 = Math.random()*100;
            
            if (!this.numCuenta.contains(aux2)) {
            
                this.numCuenta.add(aux2);
                
                generado = true;
                
                if (tipo.equalsIgnoreCase("corriente")) {
                    
                    this.bank.crearCuentaCorriente(aux2, new Cliente(this.nombre,this.cedula,this.direccion,this.clave));
                    
                    var = true;
                    
                }
            
            }
        
        }
        
        return var;
          
    }
    public boolean pedirTarjeta(String tipo){
        
        
        
        return false;
    }
    public boolean pedirPrestamo(double cantidad){
        
        
        
        
        return false;
    }
    
}
