package tanda1;

import tanda2.Consola;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int DIAS=10;
		int contdias,cont16,cont10;
		float tiempo, suma, media;
		suma=0;
		cont16=0;
		cont10=0;
		for(contdias=1;contdias<=DIAS;contdias++)
		{
			System.out.println("Introduce tiempo");
			tiempo=Consola.leeFloat();
			suma=suma+tiempo;
			if (tiempo>16)
			{
				cont16++;
			}
			if (tiempo<10) 
			{
				cont10++;
			}
		}
		media=suma/10;
		if ((cont16==0) || (cont10>0) || (media<=15))
		{
			System.out.println("APTO");
		}
		else
		{
			System.out.println("NO APTO");
		}
	}

}
