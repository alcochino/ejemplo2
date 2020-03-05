package tanda1;

import tanda4.Consola;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dianac, mesnac, dias, anionac, dia, mes, anio,contdia, contdiaanac,i,j,numdiasmesnac,numdiasmes;
		
		System.out.println("Introduce dia");
		dia=Consola.leeInt();
		System.out.println("Introduce mes");
		mes=Consola.leeInt();
		System.out.println("Introduce anio");
		anio=Consola.leeInt();
		System.out.println("Introduce dia nacimiento");
		dianac=Consola.leeInt();
		System.out.println("Introduce mes nacimiento");
		mesnac=Consola.leeInt();
		System.out.println("Introduce anio nacimiento");
		anionac=Consola.leeInt();
		contdiaanac=(anionac-1)*365;
		for (i=1; i < mesnac ;i++)
		{
			if((i==1) || (i==3) || (i==5) || (i==7) ||(i==8) || (i==10) || (i==12))
			{
				numdiasmesnac=31;
			}
			else
			{
				if(i==2)
				{
				numdiasmesnac=28;
				}
				else
				{
					numdiasmesnac=30;
				}
			}
		contdiaanac=contdiaanac+numdiasmesnac;
		}
		contdiaanac=contdiaanac+dianac;
		contdia=(anio-1)*365;
		for (j=1; j < mes ;j++)
		{
			if((j==1) || (j==3) || (j==5) || (j==7) ||(j==8) || (j==10) || (j==12))
			{
				numdiasmes=31;
			}
			else
			{
				if(j==2)
				{
					numdiasmes=28;
				}
				else
				{
					numdiasmes=30;
				}
			}
		contdia=contdia+numdiasmes;
		}
		contdia=contdia+dia;
		dias=contdia-contdiaanac;
		System.out.println(dias);													
	}
}
