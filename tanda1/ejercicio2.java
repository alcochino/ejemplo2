package tanda1;

import tanda2.Consola;

public class ejercicio2bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI=3.141592;
		double area, base, altura, radio;
		char resp;
		
		System.out.println("Introduzca C o R");
		resp=Consola.leeChar();
		if (resp=='C')
		{
			System.out.println("Introduzca radio");
			radio=Consola.leeDouble();
			area=PI*radio*radio;
			System.out.println("El area del circulo es de "+area);
		}
		else
		{
			System.out.println("Introduzca base");
			base=Consola.leeDouble();
			System.out.println("Introduzca altura");
			altura=Consola.leeDouble();
			area=base*altura;
			System.out.println("El area del rectangulo es de "+area);
		}
		
		
		
		
	}

}
