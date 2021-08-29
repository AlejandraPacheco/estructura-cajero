/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est;

/**
 *
 * @author PACHECO
 */
public class Cliente {
    private String nombre,codigo;
    private int pin;
    public Cliente (String nombre,String codigo, int pin){
        this.nombre=nombre;
        this.codigo=codigo;
        this.pin=pin;
    }
    public String getNombre() {
            return nombre;
    }
    public String getCodigo() {
            return codigo;
    }
    public int getPin() {
            return pin;
    }
    public void setNombre(String nombre) {
            this.nombre = nombre;
    }
    public void setCodigo(String codigo) {
            this.codigo = codigo;
    }
    public void setPin(int pin) {
            this.pin = pin;
    }
}
