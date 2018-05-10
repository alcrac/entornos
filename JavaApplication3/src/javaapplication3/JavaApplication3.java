
package javaapplication3;

public class JavaApplication3 {

public static void main(String[] args) {
		
		
	   
	    int [] lista= {1000,900,500,400,
	    		         100,90,50,40,
	    		          10,9,5,4,1};
	    
	    String[] letras= {"M", "CM", "D", "CD", "C", "XC", "L", "XL",
	    		           "X", "IX", "V", "IV", "I"};
	    
	    int num=3097;
	    int resto=num, cociente=0;
	    
	    for(int i=0; i<lista.length; i++) {
	    	
	    		cociente= dividir(resto, lista[i]);	    		
	   	     
	    		for(int j=0; j<cociente; j++)
	    			System.out.print(letras[i]);
	    			    		
	    		resto-= cociente*lista[i];
	    			    		
	    	   
	       }//for

  }//main
	   
	    private static int dividir(int num, int b) {

			
			
		   int cociente=0;
		   int resto= num;
		   
		   while(resto>=b) {
			   cociente++;
			   resto-= b;
		   } //while 
						   
		   return cociente; 
		   
		
		}//dividir
}//class

	   
	
	


 