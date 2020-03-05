package tanda1;

import tanda2.Consola;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		
		System.out.println("Introduce n1");
		n1=Consola.leeInt();
		System.out.println("Introduce n2");
		n2=Consola.leeInt();
		System.out.println("Introduce n3");
		n3=Consola.leeInt();
		if (n1<n2)
		{
			if (n2<n3)
			{
				System.out.println(n2+" es el numero con posicion intermedia");
			}
			else
			{
				if(n1<n3)
				{
					System.out.println(n3+" es el numero con posicion intermedia");
				}
				else
				{
					System.out.println(n1+" es el numero con posicion intermedia");
				}
			}
		}
		else 
		{
			if (n1<n3)
			{
				System.out.println(n1+" es el numero con posicion intermedia");
			}
			else
			{
				if (n3<n2)
				{
					System.out.println(n2+" es el numero con posicion intermedia");
				}
				else
				{
					System.out.println(n3+" es el numero con posicion intermedia");
				}
			}
		}
			
			
	}

}
