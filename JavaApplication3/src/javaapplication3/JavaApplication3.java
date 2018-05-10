
package javaapplication3;

public class JavaApplication3 {

public static void main(String[] args) {
		
		/*
		 * Para empezar, suponemos que la base va a ser impar
		 */
		int base=7;
		
		//Calcular el nº de filas
		int filas= (base+1)/2;
		
		
		/*
		 * Para cada fila dese 0 hasta el filas-1
		 * 
		 * 1.clacular los blancos + imprimirlos
		 * 2. imprimir los asteriscos + imprimirlos
		 * 
		 */
		
		for (int i=0; i<filas; i++) {
			//i es el nº de fila
			/*
			 *Hacemos una tabla con i y con el nº de blancos
			 *correspondiente a cada i.
			 *vemos que la suma es constante, así que
			 *podemos formular
			 *
			 * i+blancos=filas-1
			 * 
			 * así que
			 * blancos=fila-1-i
			 */
			
			//clacular e imprimir blancos
			for (int j= filas-i; j>=0; j--)
				System.out.print(' ');
			//clacular e imprimir asteriscos
			/*
			 * para calcular los asteriscos realizamos
			 * un razonamiento análogo a los blancos
			 */
			
			for(int j=0; j<2*i+1; j++)
				System.out.print('*');
			
			//los blancos del final no hace falta imprimir
			
			//imprimir salto de línea
			System.out.print('\n');
			
		}//for

	}//main

}//class
