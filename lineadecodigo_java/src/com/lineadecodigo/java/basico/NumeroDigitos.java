package com.lineadecodigo.java.basico;

/**
 * @file NumeroDigitos.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date  14-mayo-2011
 * @url    http://lineadecodigo.com/java/digitos-de-un-numero/
 * @description C�digo que nos dice cu�ntos d�gitos tiene un n�mero 
 */

public class NumeroDigitos {

	public static void main(String[] args) {			
		int iNumero = 123458;
		String x = Integer.toString(iNumero);
		System.out.println(iNumero + " tiene " + x.length() + " d�gitos");		
	}
	
}
