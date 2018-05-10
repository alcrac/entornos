
public class Piramide {
	/**
	 * Recibe un n�mero y crea una pir�mide
	 * con la base m�s cercana posible al
	 * n�mero recibido
	 * @param args
	 */

	public static void main(String[] args) {
		
		/*
		 * Para empezar, suponemos que la base va a ser impar
		 */
		int base=7;
		
		//Calcular el n� de filas
		int filas= (base+1)/2;
		
		
		/*
		 * Para cada fila dese 0 hasta el filas-1
		 * 
		 * 1.clacular los blancos + imprimirlos
		 * 2. imprimir los asteriscos + imprimirlos
		 * 
		 */
		
		for (int i=0; i<filas; i++) {
			//i es el n� de fila
			/*
			 *Hacemos una tabla con i y con el n� de blancos
			 *correspondiente a cada i.
			 *vemos que la suma es constante, as� que
			 *podemos formular
			 *
			 * i+blancos=filas-1
			 * 
			 * as� que
			 * blancos=fila-1-i
			 */
			
			//clacular e imprimir blancos
			for (int j= filas-i; j>=0; j--)
				System.out.print(' ');
			//clacular e imprimir asteriscos
			/*
			 * para calcular los asteriscos realizamos
			 * un razonamiento an�logo a los blancos
			 */
			
			for(int j=0; j<2*i+1; j++)
				System.out.print('*');
			
			//los blancos del final no hace falta imprimir
			
			//imprimir salto de l�nea
			System.out.print('\n');
			
		}//for

	}//main

}//class
