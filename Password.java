package Bucles;

import javax.swing.JOptionPane;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave= "jesus";
		String pass= "";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("introduce una contraseña");
		}
		
		if (clave.equals(pass)==false){
			System.out.println("contraseña incorrecta");
				
		}
		System.out.println("contraseña correcta, acceso permitido");
		
			

	}

}
