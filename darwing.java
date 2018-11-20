//Darwing Camilo Bustos Beltran
public class darwing{
	public static void main(String[] args){
		String arrays[]={"4","7","11","4","9","5","11","7","3","5"};
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
