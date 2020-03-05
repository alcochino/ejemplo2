package tanda1;

import tanda2.Consola;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lineas,contlin,contcol,num;
		System.out.println("Introduce lineas");
		lineas=Consola.leeInt();
		for(contlin=1; contlin<=lineas; contlin++)
		{
			num=contlin;
			for(contcol=1;contcol<=contlin;contcol++)
			{
				System.out.print(num+ "\t");
				num=num-(contlin-1);
			}
			System.out.println();
		}
			
	}

}
