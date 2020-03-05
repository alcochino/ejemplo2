package tanda1;

import tanda2.Consola;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,r,maxdivcomun;
		
		System.out.println("Introduce un numero");
		a=Consola.leeInt();
		System.out.println("Introduce un numero mas pequeño");
		b=Consola.leeInt();
		
			while(a%b!=0)
			{
				r=a%b;
				a=b;
				b=r;
			}
			maxdivcomun=b;
		System.out.println(maxdivcomun);
		
	}

}
