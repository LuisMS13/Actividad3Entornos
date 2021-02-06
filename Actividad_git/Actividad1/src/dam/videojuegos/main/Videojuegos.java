package dam.videojuegos.main;

import java.util.Scanner;

import dam.videojuegos.Videojuego;

public class Videojuegos {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introdue el id del videojuego 1");
		String id1 = sc.nextLine();
		
		System.out.println("Introdue el nombre del videojuego");
		String nombre1 = sc.nextLine();
		
		System.out.println("Introdue el nombre de la compañia");
		String compania1 = sc.nextLine();
		
		Videojuego vid1 = new Videojuego(id1, nombre1, compania1);
		
		System.out.println("Introdue el id del videojuego 2");
		String id2 = sc.nextLine();
		
		System.out.println("Introdue el nombre del videojuego");
		String nombre2 = sc.nextLine();
		
		System.out.println("Introdue el nombre de la compañia");
		String compania2 = sc.nextLine();
		
		Videojuego vid2 = new Videojuego(id2, nombre2, compania2);
		
		System.out.println("\nVideojuego 1\n" +vid1);
		System.out.println("\nVideojuego 2\n" +vid2);
		sc.close();
	}

}
