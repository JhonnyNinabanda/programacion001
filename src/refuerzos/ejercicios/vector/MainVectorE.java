package refuerzos.ejercicios.vector;

public class MainVectorE {

	public static void main(String[] args) {
		
		// 1. Declarar un vector X[8]

		int X [] = new int [8];
		
		// 2. Declarar un vector Y [3] y asignar a la posicion 2 el valor de A
		
		char Y [] = new char [3];
		Y[2]= 'A';
		
		// 3. Declarar un vector A [5] y asignar a la posicion 0 el valor de 25, posicion 3 el valor de 49 y a la 
		// posicion 2 el valor de la posicion 0
		
		int A [] = new int [5];
		A[0]= 25;
		A[3]= 49;
		A[2]= A[0] ;
		
		// 4. Declarar vector B[10], a la posicion B[0] asignele el valor del vector A[3] del ejercico anterior 
		
		int B [] = new int [10];
		B[0]=A[3];
		
		// 5. Declarar un vector Z [12] y asignar a todas sus pòsiciones valores que inician desde 1 y son 
		// secuenciales 
		
		int Z [] = new int [12];
		Z[0]=1;
		Z[1]=2;
		Z[2]=3;
		Z[3]=4;
		Z[4]=5;
		Z[5]=6;
		Z[6]=7;
		Z[7]=8;
		Z[8]=9;
		Z[9]=10;
		Z[10]=11;
		Z[11]=12;
		
		// 6. Declarar un vector y (10)y asignar a todas sus posiciones valores impares que inicia el 1 y son secuenciales
		
		int y[] = new int [10];
		
		y[0]=1;
		y[1]=3;
		y[2]=5;
		y[3]=7;
		y[4]=9;
		y[5]=11;
		y[6]=13;
		y[7]=15;
		y[8]=17;
		y[9]=19;
		
		// 7. Declara un vector H(10) asignar solo a las posiciones impares letras que inician desde la A secuencialmente.
		
		char H [] = new char [10];
		
		H[1] = 'A';
		H[3] = 'B';
		H[5] = 'C';
		H[7] = 'D';
		H[9] = 'E';
		
		// 8. Declarar un vector F(10) y en base al ejercicio anterior asignar los valores de la siguiente manera:
		// F[0]=H[3]
		// F[3]=H[2]
		// F[4]=H[6]
		// F[7]=H[0]
		// F[8]=H[1]
		// F[9]=H[9]
		
		int F[] = new int [10];
		
		F[0]=H[3];
		F[3]=H[2];
		F[4]=H[6];
		F[7]=H[0];
		F[8]=H[1];
		F[9]=H[9];
		
		// 9. Declarar un vector L (15) y asiganar valorters en base a los siguientes :
		// L[0]= (promedio de 3,5,7 y 9)
		// L[4]= (la suma de 5, 7, 8 y 15)
		// L[7]= (la multiplicación de 6, 7 y 3)
		// L[10]= (la división de 10/2)
		
		int L [] = new int [15];
		int promedio =((3+5+7+9)/4);
		int suma = (5+7+8+15);
		int multiplicacion=  6*7*3;
		int division = 10/2;
		
		 L[0]= promedio;
		 L[4]= suma;
		 L[7]= multiplicacion;
		 L[10]= division;
		 
		// 10. Declarar  vector N (12) y realizar la siguiente asignaciones:
		// N[0]= (promedio de 3,10 y 9)
		// N[4]= (la suma de 7, 8 y 10)
		// N[12]= (la multiplicación de 5, 7 y 3)
		// N[20]= (la suma de 7, -3 y 8)
		// en la última posición el valor de 20/4
		 
		 int N[] = new int [12];
		 
		 int promedio1 = ((3+10+9)/3);
		 int suma1 = (7+8+10);
		 int multiplicacion1 = (5*7*3);
		 int suma2 = (7-3+8);
		 int division1 = (20/4);
		 
		 N[0] = promedio1;
		 N[4] = suma1;
		 N[12] = multiplicacion1;	// Esta linea va dar error 
		 N[20] = suma2;				// Esta linea va dar error 
		 N[11] = division1;
		 
		
		
	}

}
