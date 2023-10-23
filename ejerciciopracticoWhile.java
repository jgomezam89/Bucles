package Bucles;

public class ejerciciopracticoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int duration = 10;
		
		while(i<duration) {
			
			if (i<3) {
				System.out.println("reproduciendo intro: " + i);
			} else if (i<7) {
				System.out.println("reproduciendo pelicula: " + i);
			} else {
				System.out.println("reproduciendo credito: " + i);
			}
			i++;
			
		}
			

	}

}
