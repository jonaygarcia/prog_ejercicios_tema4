package com.cip.prog;

import java.util.Scanner;

public class RadioCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el radio:");
		double radio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2.0);
		
		System.out.println("El área del círculo es " + area);
		
		sc.close();


	}

}
