package primerDeber;
import java.util.*;
public class porcentaje {

	public static void main(String[] args) {
		int acum=0, ind=0, acumA=0, acumB=0;
		float porcentage=0f;
	
		int cal_alum[]= new int [50]; 
		int suma=0;
	
		Scanner objx= new Scanner (System.in);

			System.out.println("B I E N V E N I D O");
			System.out.println(" _U S U A R I O_");
			System.out.println(""); 
			
			for ( ind=0; ind<50; ind++)
	{
				System.out.println("Por favor ingrese calificacion del Estudiante: ");
				cal_alum[ind]=objx.nextInt();
				suma= suma+cal_alum[ind];			
	}
				for ( ind=0; ind<50; ind++)
				{
					if (cal_alum[ind]>=1 & cal_alum[ind]<70)
						acumA=acumA+1;
					porcentage=((100 * acumA)/50);
							
				}
				System.out.println("Porcentaje de Reprobados ="  +porcentage+"%");
	}

}

