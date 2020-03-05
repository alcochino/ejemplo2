package tanda1;

import tanda2.Consola;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,digitos,n;
		
		System.out.println("Introduce numero");
		num=Consola.leeInt();
		digitos=1;
		n=num;
		while ((n/10)!=0)
		{
			n=n/10;
			digitos++;
		}
		System.out.println(num+" tiene "+digitos+" digitos");
	}

}
