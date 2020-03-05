package tanda1;

import tanda2.Consola;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,p,digitos,n,dig,num2;
		
		System.out.println("Introduce numero");
		num=Consola.leeInt();
		
		digitos=1;
		n=num;
		while ((n/10)!=0)
		{
			n=n/10;
			digitos++;
		}
		
		do
		{
			System.out.println("Introduce posicion");
			p=Consola.leeInt();	
		}while(p>digitos);
		
		dig=0;
		num2=num;
		while(dig<(digitos-p))
		{
			num2=num2/10;
			dig++;
		}
		
		dig=num2%10;
		
		System.out.println(dig);
		
	
	}

}
