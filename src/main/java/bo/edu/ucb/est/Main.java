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
public class Main {
	public static void main( String[] args ) throws Exception {
	Cliente cliente1=new Cliente("Juan Perez","jperez",3333);
        Cliente cliente2=new Cliente("Maria Gomez","mgomez",4444);
        Cliente cliente3=new Cliente("Carlos Gomez","cgomez",5555);
        
        /*Cuenta c1=new Cuenta("jperez",111122,"Bolivianos","Caja de ahorros",12000);
        Cuenta c2=new Cuenta("jperez",112211,"USD","Cuenta corriente",100);
        Cuenta c3=new Cuenta("mgomez",221122,"Bolivianos","Caja de ahorros",0);
        Cuenta c4=new Cuenta("ptorrez",331122,"Bolivianos","Caja de ahorros",100);
        Cuenta c5=new Cuenta("ptorrez",332211,"USD","Cuenta corriente",1000);
        Cuenta c6=new Cuenta("ptorrez",332233,"Bolivianos","Caja de ahorros",100000);*/
        
        Cuenta c1=new Cuenta(cliente1.getCodigo(),111122,"Bolivianos","Caja de ahorros",12000);
        Cuenta c2=new Cuenta(cliente1.getCodigo(),112211,"USD","Cuenta corriente",100);
        Cuenta c3=new Cuenta(cliente2.getCodigo(),221122,"Bolivianos","Caja de ahorros",0);
        Cuenta c4=new Cuenta(cliente3.getCodigo(),331122,"Bolivianos","Caja de ahorros",100);
        Cuenta c5=new Cuenta(cliente3.getCodigo(),332211,"USD","Cuenta corriente",1000);
        Cuenta c6=new Cuenta(cliente3.getCodigo(),332233,"Bolivianos","Caja de ahorros",100000);
        
        Login log=new Login(); //Ingreso al cajero
        
        int cliente=0;
        while (cliente==0){
           cliente=log.leer();
        }
        
        if (cliente==1){ //Para el cliente 1
        	Menu menu=new Menu(c1,c2); //2 cuentas
        	menu.menu1();
        }
        if (cliente==2){ //Para el cliente 2
        	Menu menu=new Menu(c3); //1 cuenta
        	menu.menu1();
        }
        if (cliente==3){ //Para el cliente 3
        	Menu menu=new Menu(c4,c5,c6); //3 cuentas
        	menu.menu1();
        }
    }
}
