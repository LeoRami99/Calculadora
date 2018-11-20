//Darwing Camilo Bustos Beltran
public class Ejercicio1{
	public static void main(String[] args){
		String arrays[]={"4","7","11","4","9","5","11","7","3","5"};//se crea la variable string el cual cuenta con un array de los números propuestos en el PDF
		//Se crea la condición de eliminar los números duplicados con while y dentro de este un if
		int i=0;
		while(i<arrays.length){
			int j=0;
			while(j<arrays.length-1){

				if(i!=j){

					if(arrays[i]==arrays[j]){
						arrays[i]="";
					}
				}
				j++;
			}
			i++;
		}
		//Se imprime en pantalla los números no duplicados
	int x=arrays.length;
	int y=0;
		while (y<=x-1){

			if(arrays[y]!=""){

				System.out.print( arrays[y]+",");
			}
			y++;
		}
	}
}
