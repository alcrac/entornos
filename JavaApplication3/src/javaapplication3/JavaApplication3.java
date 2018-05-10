
package javaapplication3;

public class JavaApplication3 {

public class MatrizPir extends Matriz{
 
	
	public MatrizPir (int base){
	 /*El constructor garantiza:
	  * 1. que la base (col) sea impar
	  * 2.que la altura (fil) sea adecuada a la base
	  */
		
		super();
		col= (base%2==0)? base+1: base;
		fil=(col+1)/2;
		m= new char [fil][col];
 }
	public void piramide(){
		//pintar piramide
		// pista: i+j=fil-1 (lado izq)|| j-i=fil-1 (lado der)
		
		int centro= (col-1)/2;
	
		for (int i=0;i<fil;i++){
			
			//blancos
			for (int j=0;j<centro-i;j++) m[i][j]= ' ';
			
			//*
			for (int j=centro-i;j<centro-i+2*i+1;j++)m[i][j]= '*';
			
			
			//finalizar con blancos
			for (int j=centro+i+1;j<col;j++)m[i][j]=' ';
		}
	}
	
	public void piramidevacia(){
		//pintar piramide
		int centro= (col-1)/2;
	
		for (int i=0;i<fil;i++){
			
			//blancos
			for (int j=0;j<centro-i;j++) m[i][j]= ' ';
			
			//*
			m[i][centro-i]='*';
			m[i][centro+i]='*';
			
			//finalizar con blancos
			for (int j=centro-i+1;j<centro-i+2*i;j++){
				m[i][j]= ' ';
			}
			
			for (int j=centro+i+1;j<col;j++)m[i][j]=' ';
			
		}
		//pintar la parte de abajo
		for(int j=0;j<col;j++)m[fil-1][j]='*';
        }}}