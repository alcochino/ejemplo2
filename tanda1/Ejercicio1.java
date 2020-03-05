package tanda2;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int LIMINF;
		final int LIMSUP;
		int i,suma,liminf;
		long producto;
		suma=0;
		producto=1;
		LIMINF=20;
		LIMSUP=40;
		
		if (LIMINF%2==0)
		{
			liminf=LIMINF+1;
		}
			else
			{
				liminf=LIMINF;
			}
		for(i=(LIMINF+1);i<LIMSUP;i+=2)
		{
			suma=suma+i;
			producto=producto*i;
		}
		System.out.println("La suma de los impares entre 20 y 40 es igual a " + suma);	
		System.out.println("el prodcuto de los impares entre 20 y 40 es igual a " + producto);
		
		
	}

}
