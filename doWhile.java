package Bucles;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaraciones
		int numero = 0;
		Scanner sc= new Scanner(System.in);
		
		

		do {
			System.out.println("introduzca un numero");
			numero = sc.nextInt();
		} while (numero >11);

		System.out.println("el numero es ok");
		

	}

}
