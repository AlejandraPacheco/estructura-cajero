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
public class Login {
    //String codigo;
	//int pin;
    Cliente cli1 = new Cliente ("Juan Perez","jperez",3333);
    Cliente cli2 = new Cliente ("Maria Gomez","mgomez",4444);
    Cliente cli3 = new Cliente ("Carlos Gomez","cgomez",5555);

    public static void main(String[] args) {
            //Cliente cli1=new Cliente("Juan Perez","jperez",3333);
    //Cliente cli2=new Cliente("Maria Gomez","mgomez",4444);
    //Cliente cli3=new Cliente("Pepe Torrez","ptorrez",5555);

    }

    public int leer() throws Exception{
        String codigo;
        int pin;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su codigo: ");
        codigo=sc.next(); 
        System.out.print("Ingrese su PIN: ");
        pin=sc.nextInt(); 
        int cliente=0;
        if (cli1.getCodigo().equals(codigo) && cli1.getPin()==pin) {
                cliente=1; //Ingresa al sistema el cliente 1
        }
                else if (cli2.getCodigo().equals(codigo) && cli2.getPin()==pin) {
                        cliente=2; //Ingresa al sistema el cliente 2
                }
                        else if (cli3.getCodigo().equals(codigo) && cli3.getPin()==pin) {
                                cliente=3; //Ingresa al sistema el cliente 3
                        }
        else
                System.out.println("Datos incorrectos, intente nuevamente");
        //sc.close();
        return cliente;
    }
}
