package tanda1;

import tanda2.Consola;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char estado;
		int tiempo;
		final double CALR=1.66;
		final double CALD=1.08;
		double calorias;
		do
		{
			System.out.println("Introduce estado");
			estado=Consola.leeChar();
		}while (estado!='R' && estado!='D');
		do
		{
			System.out.println("Introduce tiempo");
			tiempo=Consola.leeInt();
		}while (tiempo<=0);
		if (estado=='R')
		{
			calorias=CALR*tiempo;
		}
		else
		{
			calorias=CALD*tiempo;
		}
		System.out.println(calorias + " calorias consumidas en "+tiempo+ " minutos");
	}

}
