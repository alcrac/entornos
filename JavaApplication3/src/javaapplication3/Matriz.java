
package javaapplication3;


public class Matriz {
	protected int fil;
	protected int col;
	protected char [][] m;
	
	public Matriz(){
		
	}
	public Matriz (int fil, int col){
		
		this.fil=fil;
		this.col=col;
		
		//instanciar la matriz con las filas y columnas pedidas
		
		m=new char [fil][col];
	}
	public String toString(){
		StringBuffer sb=new StringBuffer();
		//una matriz se recorre con dos bucles anidados
		for (int i=0;i<fil;i++){
			for (int j=0;j<col;j++){
			sb.append(m[i][j]);
		}
		sb.append("\n");	
		}
	return sb.toString();
	}
	public void rellenar (char c){
		
		//una matriz se recorre en dos bucles aislados
		
		
		
		for(int i=0;i<fil;i++){
		for(int j=0;j<col;j++){
		m[i][j]=c;
		}
		}
	}
	public String verIndices(){
		
		StringBuffer sb=new StringBuffer();
		//imprimimos cada fila con un salto de linea al final
		for (int i=0;i<fil;i++){
			for(int j=0;j<col;j++)
				sb.append("("+i+","+j+") ");
				sb.append('\n');
		}
		return sb.toString();
	}
	public int getFil() {
		return fil;
	}
	public void setFil(int fil) {
		this.fil = fil;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public char[][] getM() {
		return m;
	}
	public void setM(char[][] m) {
		this.m = m;
	}



}