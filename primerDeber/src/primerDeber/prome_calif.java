package primerDeber;
import java.util.*;
public class prome_calif {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		 int valor1=0;
		 int cont=0; 
		 float valor2=0.0f;
		 float promedio =0.0f;
		
		System.out.println("");
		System.out.println("B I E N V E N I D O");
		System.out.println("");
		
		System.out.println("Cantidad de Calificaciones a Calcular:");
			valor1 = teclado.nextInt();
			
			while (cont < valor1)
			{
				System.out.print("Ingrese Calificacion:");
				valor2 += teclado.nextFloat();
				
				cont++;
			}
			{
				promedio = (valor2 / valor1);
				
				System.out.println("");	
				System.out.println("EL PROMEDIO ES: **"+promedio+"**");
				
			}
			
	}
}
	
