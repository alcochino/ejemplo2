package tanda1;

import tanda2.Consola;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double  precio;
		final int DCTO=20;
		
		System.out.println("Introduce precio de la compra");
		precio=Consola.leeDouble();
		
		if (precio>100)
		{
			precio=precio- DCTO*precio/100;
		}
		System.out.println("El precio final es de"+precio);
	}

}
