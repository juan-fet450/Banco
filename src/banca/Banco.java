/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//cambiooo
package banca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juan Osorio
 * @since 8/25/2020
 * @author yeison lizcano
 */
public class Banco {
    
    private HashMap<Double,Cliente> cuentasAhorros = new HashMap();
    private HashMap<Double,Double> saldoAhorros = new HashMap();
    private HashMap<Double,Cliente> cuentasCorriente = new HashMap();
    private HashMap<Double,Double> saldoCorriente = new HashMap();
    private HashMap<Double,Cliente> tarjetaDebito = new HashMap();
    private HashMap<Double,Cliente> tarjetaCredito = new HashMap();
    private HashMap<Double,Cliente> prestamos = new HashMap();
    private ArrayList<Double> Fondos = new ArrayList();
    
    public void crearCuentaAhorros(double num, Cliente cliente){
        
        this.cuentasAhorros.put(num, cliente);
        
        this.Fondos.add(num);
        
    }
    public void crearCuentaCorriente(double num, Cliente cliente){
        
        this.cuentasCorriente.put(num, cliente);
        
        this.Fondos.add(num);
        
    }
    public void crearTarjetaDebito(double num, Cliente cliente){
        
        this.tarjetaDebito.put(num, cliente);
        
    }
    public void crearTarjetaCredito(double num, Cliente cliente){
        
        this.tarjetaCredito.put(num, cliente);
        
    }
    public double fondosTotales(){
        
        double ans = 0;
        
        for (Double Fondo : this.Fondos) {
            
           ans += Fondo; 
            
        }
        
        return ans;
        
    }
    public void crearPrestamo(double num, Cliente cliente){
        
        
        for (Map.Entry<Double, Cliente> entry : this.cuentasCorriente.entrySet()) {
            
            if(entry.getValue() == cliente){
                
                this.prestamos.put(num, cliente);
                
            }
            
        }
        
    }
    public boolean consignar(double numCuenta, double monto){
        
        double aux;
        
        boolean var = false;
        
        for (Map.Entry<Double, Cliente> entry : this.cuentasAhorros.entrySet()) {
            
            if(entry.getKey().equals(numCuenta)){
                
                for (Map.Entry<Double, Double> entry1 : this.saldoAhorros.entrySet()) {
                    
                    aux = entry1.getValue() + monto;
                    
                    this.saldoAhorros.replace(numCuenta, aux);
                    
                    var = true;
                }
                
            }else{
                
                var = false;
            
            }
            
        }
        
        return var;
    }
    
    public double retirarDinero(String clave, String id, double monto){
        
        double dinero = 0;
        
        for (Map.Entry<Double, Cliente> entry : this.cuentasAhorros.entrySet()) {
            
            if(entry.getValue().getCedula().equals(id)){
                
                if (entry.getValue().getClave().equals(clave)) {
                    
                    for (Map.Entry<Double, Double> entry1 : this.saldoAhorros.entrySet()) {
                        
                        if(entry.getKey().equals(entry1.getKey())){
                            
                            dinero = entry1.getValue() - monto;
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
        return dinero;
        
    }
    public double consultarSaldo(String clave, String id){
        
        double saldo = 0;
        
        for (Map.Entry<Double, Cliente> entry : this.cuentasAhorros.entrySet()) {
            
            if (entry.getValue().getCedula().equals(id)) {
                
                if(entry.getValue().getClave().equals(clave)){
                    
                    for (Map.Entry<Double, Double> entry1 : this.saldoAhorros.entrySet()) {
                        
                        if (entry.getKey().equals(entry1.getKey())) {
                            
                            saldo = entry1.getValue();
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
        return saldo;
    }
    public boolean realizarCompra(String clave, String id, double monto){
        
        boolean var = false;
        
        for (Map.Entry<Double, Cliente> entry : this.cuentasAhorros.entrySet()) {
            
            if(entry.getValue().getCedula().equals(id)){
                
                if (entry.getValue().getClave().equals(clave)) {
                    
                    for (Map.Entry<Double, Double> entry1 : this.saldoAhorros.entrySet()) {
                        
                        if(entry.getKey().equals(entry1.getKey())){
                            
                            this.saldoAhorros.replace(entry1.getKey(), entry1.getValue() - monto);
                            
                            var = true;
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
        return var;
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
