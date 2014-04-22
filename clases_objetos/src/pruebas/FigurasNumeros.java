package pruebas;
import java.lang.Math;

   public class FigurasNumeros {
      public static void main(String[] args) {
         int x;
         int y;
         int numero;
	 int actual;
      
      // cuadrado en columna
         for(y=0; y<4; y++) {
            for(x=0; x<9; x++) 
               System.out.print(x+1);
            System.out.println();
         }
         System.out.println();
      
      // cuadrado en filas
         for(y=0; y<4; y++) {
            for(x=0; x<9; x++)
               System.out.print(y+1);
            System.out.println();
         }
         System.out.println();
      
      // triángulo en columnas
         for(y=0; y<4; y++) {
            for(x=0; x<y+1; x++) 
               System.out.print(x+1);
            System.out.println();
         }
         System.out.println();    
      
      // triángulo en filas
         for(y=0; y<4; y++) {
            for(x=0; x<y+1; x++) 
               System.out.print(y+1);
            System.out.println();
         }
         System.out.println();    
      
      //cuadrado consecutivos
         numero = 0;
         for(y=0; y<4; y++) {
            for(x=0; x<9; x++) {
	       actual = (numero+(4*x))%9+1;
               System.out.print(actual);
            }
            System.out.println();
	    numero++;
         }
         System.out.println();    

	// faltan
	// triangulo consecutivo
	// triangulo consecutivo hueco

   } //fin metodo
}//Fin clase




