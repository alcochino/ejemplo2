package tanda1;

import tanda2.Consola;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,divent;
		
		System.out.println("Introduce un numero");
		n1=Consola.leeInt();
		System.out.println("Introduce un numero mas pequeño");
		n2=Consola.leeInt();
		divent=0;
		do
		{
			n1=n1-n2;
			divent++;
		}while (n1>=n2);
		System.out.println(divent);
	}

}
