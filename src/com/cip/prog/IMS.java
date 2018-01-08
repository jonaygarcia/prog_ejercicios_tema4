package com.cip.prog;

import java.util.Scanner;

public class IMS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, introduzca el peso (en kilogramos):");
		double peso = sc.nextDouble();
		
		System.out.println("Por favor, introduzca la altura (en metros):");
		double altura = sc.nextDouble();
		
		double ims = peso / Math.pow(altura, 2.0);
		
		System.out.println("El IMS es " + ims);
		
		sc.close();

	}

}
