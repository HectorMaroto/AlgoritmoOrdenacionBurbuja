import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Es un pequeño ejercicio autodidacta practicando el algoritmo de ordenacion burbuja
		
		Scanner sc=new Scanner(System.in);
		
		int []a=new int[10];
		
		System.out.println("Usuario dame los valores del array:");
		for(int i=0;i<a.length;i++) {
			System.out.println("Valor "+(i+1)+" :");
			a[i]=sc.nextInt();
		}
		
		System.out.println("El array resultante es:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		
		//Ahora vamos a ordenarlos tanto de forma ascendente como de forma descendente con el algoritmo burbuja
		
		int aux=0;  // creamos variable auxiliar que nos ayude a ir cambiando los valores de orden
		
		for(int i=0;i<a.length-1;i++) {         //Para que sea mas optimo el codigo le restamos 1 al numero de iteraciones que debe hacer ya que no tiene que hacer
			for(int j=0;j<a.length-1;j++) {     //10 comparaciones sino 9
				if(a[j]<a[j+1]) {				
					aux=a[j];  	  //La variable auxiliar toma el valor del valor menor
					a[j]=a[j+1];  // El valor menor toma la posicion y el valor del mayor para seguir comparandolo
					a[j+1]=aux;   // El valor mayor toma la posicion y el valor del auxiliar que contenia el valor y la posicion del numero menor
					
				}
			}
		}
		
		System.out.println("El array ordenado de mayor a menor queda asi:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println(" ");
		
		System.out.println("Ahora para recorrerlo de menor a mayor lo hacemos al contrario:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}

	}

}
