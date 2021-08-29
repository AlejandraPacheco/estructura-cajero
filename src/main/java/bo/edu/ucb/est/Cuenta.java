/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est;

import java.util.Scanner;

/**
 *
 * @author PACHECO
 */
public class Cuenta{
	private String c_cliente,moneda,tipo;
	private int num_cuenta;
	private double saldo;
	public Cuenta(String c_cliente, int num_cuenta, String moneda, String tipo, double saldo) {
		//super();
		this.c_cliente = c_cliente;
		this.num_cuenta = num_cuenta;
		this.moneda = moneda;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	public String getC_cliente() {
		return c_cliente;
	}
	public int getNum_cuenta() {
		return num_cuenta;
	}
	public String getMoneda() {
		return moneda;
	}
	public String getTipo() {
		return tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setC_cliente(String c_cliente) {
		this.c_cliente = c_cliente;
	}
	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void saldo() {
		System.out.println("\nNúmero de cuenta: "+getNum_cuenta()+"\nTipo de moneda: "+getMoneda()+
				"\nTipo de cuenta: "+getTipo()+"\nSaldo: "+getSaldo());
	}
	
    public void depositar(){
    	try{
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Saldo actual en la cuenta "+getNum_cuenta()+": "+getSaldo()+" "+getMoneda());
            System.out.print("Ingrese el monto a depositar en "+getMoneda()+": ");
            double monto=sc.nextDouble();
            double nuevo_saldo=getSaldo()+monto;
            setSaldo(nuevo_saldo);
     		System.out.println("Transacción exitosa\n");
         }
         catch (Exception e){
             System.out.println("Error en los datos ingresados");
         }
    }
	
    public void retirar(){
       try{
    	   int flag=0;
    	   while (flag==0) {
            	Scanner sc=new Scanner(System.in);
            	System.out.println("Saldo actual en la cuenta "+getNum_cuenta()+": "+getSaldo()+" "+getMoneda());
                System.out.print("Ingrese el monto a retirar en "+getMoneda()+": ");
                double monto=sc.nextDouble();
                double nuevo_saldo=getSaldo()-monto;
                if (monto<=0) {
                	System.out.println("El monto debe ser mayor a cero");
                }
	                else if(nuevo_saldo<0) {
	                	System.out.println("Error. Saldo insuficiente.");
	                	}
            	else {
            		setSaldo(nuevo_saldo);
            		System.out.println("Transacción exitosa\n");
            		flag=1;
            		}
                }
        }catch (Exception e){
        	System.out.println("Error en los datos ingresados");
        }
    }
}
