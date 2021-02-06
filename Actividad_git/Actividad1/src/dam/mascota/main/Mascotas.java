package dam.mascota.main;

import java.util.Scanner;

import dam.mascota.Mascota;


public class Mascotas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introdue el id de la mascota 1");
		String id1 = sc.nextLine();
		
		System.out.println("Introdue el nombre de la mascota");
		String nombre1 = sc.nextLine();
		
		System.out.println("Introdue el color de la mascota");
		String color1 = sc.nextLine();
		
		Mascota mas1 = new Mascota(id1, nombre1, color1);
		
		System.out.println("Introdue el id de la mascota 2");
		String id2 = sc.nextLine();
		
		System.out.println("Introdue el nombre de la mascota");
		String nombre2 = sc.nextLine();
		
		System.out.println("Introdue el color de la mascota");
		String color2 = sc.nextLine();
		
		Mascota mas2 = new Mascota(id2, nombre2, color2);
		
		System.out.println("\nMascota 1\n" + mas1);
		System.out.println("\nMascota 2\n" + mas2);
		sc.close();
	}

}
