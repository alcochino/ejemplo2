package tanda1;

import tanda2.Consola;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas, minutos;
		
		
		do
		{
			System.out.println("Introduce horas");
			horas=Consola.leeInt();
		}while (horas<0 || horas>23);
		do
		{
			System.out.println("Introduce minutos");
			minutos=Consola.leeInt();
		}while (minutos<0 || minutos>59);
		
		if (horas<12)
		{
			System.out.println(horas+":"+minutos+ "AM");
		}
		if (horas>12)			
		{
			horas=horas-12;
			System.out.println(horas+":"+minutos+ "PM");
		}
		if (horas==12)
		{
			System.out.println(horas+":"+minutos+ "PM");
		}
	}

}
