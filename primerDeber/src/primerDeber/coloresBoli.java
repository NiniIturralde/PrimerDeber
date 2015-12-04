package primerDeber;
import java.util.*;
public class coloresBoli {

	public static void main(String[] args) {
		float imp=0;
		float desc=0, total=0,acum=0,acum1=0,acum2=0,tp1=0,tp2=0,tp3=0,sum=0;
		int op,s = 0;

		Scanner objx= new Scanner (System.in);
		System.out.println("B I E N V E N I D O");
		System.out.println(" _U S U A R I O_");
		System.out.println(""); 
	do
	{
			
				System.out.println("Ingrese el Importe del dia:");
				imp = objx.nextFloat();
				
				System.out.println("Por favor elija una opcion:");
				System.out.println("1. Bolita Roja");
				System.out.println("2. Bolita Amarilla");
				System.out.println("3. Bolita Blanca");
				
			do
		
		{ 
				System.out.println("Digite la opcion:");
				op = objx.nextInt(); 
				
		}
		while (!(op >=1 && op<=4));
			switch (op)
			{
			case 1 : 
				desc=(float) (imp* 0.4);
				total =(float) (imp-desc);
				System.out.println("Su Total de 40% de descuento es:"  +total);
				System.out.println("");
				System.out.println("Desea seguir utilizando el sistema |1 o 2|:");
				System.out.println("1.-Si");
				System.out.println("2.-No");
				s= objx.nextInt();
				
				acum=total+0;
				tp1=acum;
				break;
				
			case 2 :
				desc= (float)(imp*0.25);
				total=(float) (imp-desc);
				System.out.println("Su Total de 25% de descuento es:"  +total);
				System.out.println("");
				System.out.println("Desea seguir utilizando el sistema |1 o 2|:");
				System.out.println("1.-Si");
				System.out.println("2.-No");
				s= objx.nextInt();
				
				acum1=total+0;
				tp2=acum1;
				break;
				
			case 3 :	
				desc=(float) imp;
				System.out.println("Su total sin descuento es:" +desc);
				System.out.println("");
				System.out.println("Desea seguir utilizando el sistema |1 o 2|:");
				System.out.println("1.-Si");
				System.out.println("2.-No");
				s= objx.nextInt();
				
				acum2=desc+0;
				tp3=acum2;
				
			 break;
			}
	}
				
	while (s==1);
	sum=tp1+tp2+tp3;
	if (s==2){
		
	
	System.out.println("Total de Importes del Dia:" +sum);
	System.out.println("G R A C I A S");	
	}

	}

	}

