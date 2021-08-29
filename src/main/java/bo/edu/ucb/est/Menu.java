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
public class Menu {
    int c;
    Cuenta c1,c2,c3;
    public Menu (Cuenta c1){ //Constructor para el cliente 2
        this.c1=c1;
       c=1; //cliente 2
    }
    public Menu (Cuenta c1, Cuenta c2){ //Constructor para el cliente 1
        this.c1=c1;
        this.c2=c2;
        c=2; //cliente 1
    }
    public Menu (Cuenta c1, Cuenta c2, Cuenta c3){ //Constructor para el cliente 3
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        c=3; //cliente 3
    }
    public void menu1(){ //Menu principal
       Scanner sc=new Scanner(System.in);
       boolean salir = false;
       int opcion;
       while (salir==false) {
    	   System.out.println("\n****************** Menú de opciones *******************");
    	   //System.out.println("*******************************************************");
	       System.out.println("1. Ver saldo\n2. Retirar dinero\n3. Depositar dinero\n4. Salir");
	       System.out.println("*******************************************************");
	       try {
	    	   System.out.print("Elija una opción: ");
	           opcion=sc.nextInt();
	           switch (opcion) {
	           		case 1:
	           			saldo();
	                    break;
	                case 2:
	                    retirar();
	                    break;
	                case 3:
	                    depositar();
	                    break;
	                case 4:
	                    Login log=new Login(); //Ingreso al sistema
	                    log.leer();
	                    break;
	                default:
	                    System.out.println("El número ingresado debe estar entre el 1 y 4");
	                }
	            } catch (Exception e) {
	                System.out.println("Error en el elemento ingresado.");
	            }
	        }
	    }
    public void saldo(){
    	Scanner sc = new Scanner(System.in);
	    int flag=0;
	    System.out.println("\n****** Cuentas disponibles ******");
	    System.out.println("=================================");
	    if (c==1){
	    	try {
	    		while (flag==0){
	    			System.out.println("1. "+c1.getNum_cuenta());
	    			System.out.println("=================================");
	            	System.out.print("Elija una cuenta: ");
	                int opcion=sc.nextInt();
	                switch (opcion) {
	                    case 1:
	                        c1.saldo();
	                        flag=1;
	                        break;
	                default:
	                     System.out.println("Únicamente se tiene una cuenta para este cliente");
	                	}
	            	}
	            } catch (Exception e) {
	                System.out.println("Error en el elemento ingresado.");
	            }
	        }
        if (c==2){
            try {
            	while (flag==0) {
            		System.out.println("1. "+c1.getNum_cuenta()+"\n2. "+c2.getNum_cuenta());
            		System.out.println("=================================");
            		System.out.print("Elija una cuenta: ");
            		int opcion=sc.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.saldo();
                            flag=1;
                            break;
                        case 2:
                            c2.saldo();
                            flag=1;
                            break;
                        default:
                            System.out.println("Únicamente se tienen dos cuentas para este cliente");
                    }
            	}
            } catch (Exception e) {
                System.out.println("Error en el elemento ingresado.");
            }
        }
        if (c==3){
            try {
            	while (flag==0) {
            		System.out.println("1. "+c1.getNum_cuenta()+"\n2. "+c2.getNum_cuenta()+"\n3. "+c3.getNum_cuenta());
            		System.out.println("=================================");
            		System.out.print("Elija una cuenta: ");
            		int opcion=sc.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.saldo();
                            flag=1;
                            break;
                        case 2:
                            c2.saldo();
                            flag=1;
                            break;
                        case 3:
                            c3.saldo();
                            flag=1;
                            break;
                        default:
                            System.out.println("Únicamente se tienen tres cuentas para este cliente");
                    }
            	}
            } catch (Exception e) {
                System.out.println("Error en el elemento ingresado.");
            }
        }
    }
    
	public void retirar(){
		Scanner sc = new Scanner(System.in);
		int flag=0;
		System.out.println("****** Cuentas disponibles ******");
		System.out.println("=================================");
	    if (c==1){
            try {
            	while (flag==0) {
            		System.out.println("1. "+c1.getNum_cuenta());
            		System.out.println("=================================");
            		System.out.print("Elija una cuenta: ");
                    int opcion=sc.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.retirar();
                            flag=1;
                            break;
                        default:
                            System.out.println("Únicamente se tiene una cuenta para este cliente");
                    }
            	}
            } catch (Exception e) {
                System.out.println("Error en el elemento ingresado.");
            }
        }
        if (c==2){
            try {
            	while (flag==0) {
            		System.out.println("1. "+c1.getNum_cuenta()+"\n2. "+c2.getNum_cuenta());
            		System.out.println("=================================");
            		System.out.print("Elija una cuenta: ");
            		int opcion=sc.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.retirar();
                            flag=1;
                            break;
                        case 2:
                            c2.retirar();
                            flag=1;
                            break;
                        default:
                            System.out.println("Únicamente se tienen dos cuentas para este cliente");
                    }
            	}  
            } catch (Exception e) {
                System.out.println("Error en el elemento ingresado.");
            }
        }
        if (c==3){
            try {
            	while (flag==0) {
            		System.out.println("1. "+c1.getNum_cuenta()+"\n2. "+c2.getNum_cuenta()+"\n3. "+c3.getNum_cuenta());
            		System.out.println("=================================");
            		System.out.print("Elija una cuenta: ");
            		int opcion=sc.nextInt();
	                switch (opcion) {
	                    case 1:
	                        c1.retirar();
	                        flag=1;
	                        break;
	                    case 2:
	                        c2.retirar();
	                        flag=1;
	                        break;
	                    case 3:
	                        c3.retirar();
	                        flag=1;
	                        break;
	                    default:
	                        System.out.println("Únicamente se tienen tres cuentas para este cliente");
	                }
            	}
            } catch (Exception e) {
                System.out.println("Error en el elemento ingresado.");
            }
        }
    }
    public void depositar(){
    	Scanner sc = new Scanner(System.in);
    	int flag=0;
    	System.out.println("****** Cuentas disponibles ******");
    	System.out.println("=================================");
        if (c==1){
            try {
            	while (flag==0) {
            		System.out.println("1. "+c1.getNum_cuenta());
            		System.out.println("=================================");
            		System.out.print("Elija una cuenta: ");
                    int opcion=sc.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.depositar();
                            flag=1;
                            break;
                        default:
                            System.out.println("Únicamente se tiene una cuenta para este cliente");
                    }
            	}
            } catch (Exception e) {
                System.out.println("Error en el elemento ingresado.");
            }
        }
        if (c==2){
            try {
            	while (flag==0) {
            		System.out.println("1. "+c1.getNum_cuenta()+"\n2. "+c2.getNum_cuenta());
            		System.out.println("=================================");
            		System.out.print("Elija una cuenta: ");
            		int opcion=sc.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.depositar();
                            flag=1;
                            break;
                        case 2:
                            c2.depositar();
                            flag=1;
                            break;
                        default:
                            System.out.println("Únicamente se tienen dos cuentas para este cliente");
                    }
            	}
            } catch (Exception e) {
                System.out.println("Error en el elemento ingresado.");
            }
        }
        if (c==3){
            try {
            	while (flag==0) {
            		System.out.println("1. "+c1.getNum_cuenta()+"\n2. "+c2.getNum_cuenta()+"\n3. "+c3.getNum_cuenta());
            		System.out.println("=================================");
            		System.out.print("Elija una cuenta: ");
            		int opcion=sc.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.depositar();
                            flag=1;
                            break;
                        case 2:
                            c2.depositar();
                            flag=1;
                            break;
                        case 3:
                            c3.depositar();
                            flag=1;
                            break;
                        default:
                            System.out.println("Únicamente se tienen tres cuentas para este cliente");
                    }
            	}
            } catch (Exception e) {
                System.out.println("Error en el elemento ingresado.");
            }
        }
    }
}
