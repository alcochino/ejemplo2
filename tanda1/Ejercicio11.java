package tanda1;

import tanda2.Consola;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,div,n;
		
		System.out.println("Introduce numero");
		num=Consola.leeInt();
		n=num;
		for(div=2;div<=num;div++ )
		{
			while (n%div==0)
			{
				System.out.print(div+"*");
				n=n/div;
			}
		}
	}

}
