/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

import java.util.HashMap;

/**
 *
 * @author Juan Osorio
 */
public class Banco {
    private HashMap<Double,Cliente> cuentasAhorros = new HashMap();
    private HashMap<Double,Cliente> cuentasCorriente = new HashMap();
    private HashMap<Double,Cliente> tarjetaDebito = new HashMap();
    private HashMap<Double,Cliente> tarjetaCredito = new HashMap();
    private HashMap<Double,Cliente> prestamos = new HashMap();
    
    public void crearCuentaAhorros(Cliente cliente){
        
    }
    public void crearCuentaCorriente(Cliente cliente){
        
    }
    public void crearTarjetaDebito(Cliente cliente){
        
    }
    public void crearTarjetaCredito(Cliente cliente){
        
    }
    public void crearPrestamo(Cliente cliente){
        
    }
    public boolean consignar(double numCuenta){
        return false;
    }
    
    public double retirarDinero(String clave){
        return 0;
    }
    public double consultarSaldo(String clave){
        return 0;
    }
    public boolean realizarCompra(String clave){
        return false;
    }
    public double consultarSaldoTarjeta(String clave){
        return 0;   
    }
    public double consultarGastoTarjeta(String clave){
        return 0;
    }
    public boolean pagarTarjeta(String numTarjeta){
        return false;
    }
}
