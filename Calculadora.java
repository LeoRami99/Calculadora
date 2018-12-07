//calculadora desarrollada por Juan Leonardo Ramírez Velásquez.
//juanlov4321@gmail.com
//whatsapp: +573002100794
//Se es modificable el código a su gusto.
import java.util.Scanner;

class Calculadora
{
	public static void main(String[] args) 
	{
	 Scanner tc = new Scanner(System.in); 
		//variables para menu
		int opcion;
		String name1;
		double result=0,cant=0;
		boolean salir = false;	
		System.out.println("Escribe t\u00fa nombre");
		name1 = tc.nextLine();
		System.out.println("\n");
		System.out.println("\t---Hola "+ nombre(name1)+"---");
		System.out.println("\n");
	

	while (!salir) 
		{
			System.out.println("*******************************************************");                                                                                                                                                                                      
			System.out.println("\t▒█▀▀█ █▀▀█ █   █▀▀ █  █ █   █▀▀█ █▀▀▄ █▀▀█ █▀▀█ █▀▀█ ");
			System.out.println("\t▒█    █▄▄█ █   █   █  █ █   █▄▄█ █  █ █  █ █▄▄▀ █▄▄█ ");
			System.out.println("\t▒█▄▄█ ▀  ▀ ▀▀▀ ▀▀▀  ▀▀▀ ▀▀▀ ▀  ▀ ▀▀▀  ▀▀▀▀ ▀ ▀▀ ▀  ▀ ");
			System.out.println("*******************************************************");
			System.out.println("\t*Opci\u00f3n 1 Sumar");
			System.out.println("\t*Opci\u00f3n 2 Restar");
			System.out.println("\t*Opci\u00f3n 3 Multiplicar");
			System.out.println("\t*Opci\u00f3n 4 Dividir");
			System.out.println("\t*Opci\u00f3n 5 Salir");
			
			try
			{
				System.out.println("Digita una de las opciones");
				System.out.print(">>");
				opcion = tc.nextInt();
				switch (opcion) 
				{
					case 1:
						double suma=0,resum=0;
						System.out.println("***********************************************************");
						System.out.println("\t "+nombre(name1)+" estas en el apartado de suma");
						System.out.println("\tTe recordamos que no es necesario introducir el operador");
						System.out.println("\tIngrese la cantidad de n\u00fameros que desea sumar");
						System.out.print(">>");
						cant = tc.nextDouble();
						System.out.println("***********************************************************");
						result=0;
						for (int s=0;s<cant;s++ ) 
						{
							System.out.println("Ingresa el " + (s+1) +" n\u00famero");
							System.out.print(">>");
							suma = tc.nextDouble();
							result=suma+result;	
						}
						System.out.println("El resultado de la suma es: " + result);

					break;
					
					case 2:
						System.out.println("***********************************************************");
						System.out.println(nombre(name1)+" estas en el apartado de resta");
						System.out.println("Por favor digite la cantidad de n\u00fameros a restar");
						System.out.print(">");
						double resta;
						result=0;
						cant = tc.nextDouble();
						System.out.println("***********************************************************");
						for (int r=0;r<cant;r++ ) 
						{
							System.out.println("Ingresa el "+(r+1)+" n\u00famero");
							System.out.print(">>");
							resta = tc.nextDouble();
							result=resta-result;
						}
						System.out.println("El resultado de la resta es:"+result);
					break;
					case 3:
						System.out.println("***********************************************************");
						System.out.println(nombre(name1)+" estas en el apartado de multipliaci\u00f3n");
						System.out.println("Solo puede digitar 2 numeros para la multipliaci\u00f3n");
						System.out.print(">>");
						double multi,multi2;
						result=0;
						System.out.println("***********************************************************");
						
							System.out.println("Ingresa el n\u00famero");
							System.out.print(">>");
							multi = tc.nextDouble();
							System.out.println("Ingresa el n\u00famero");
							System.out.print(">>");
							multi2 = tc.nextDouble();
							result=multi*multi2;
						System.out.println("El resultado de la multiplicaci\u00f3n es:"+ result);
					break;
					case 4:
						System.out.println("***********************************************************");
						System.out.println(nombre(name1)+" estas en el apartado de divisi\u00f3n");
						System.out.println("Solo puede digitar 2 n\u00fameros para la divisi\u00f3n");
						System.out.print(">>");
						double divi,divi2;
						result=0;
						System.out.println("***********************************************************");
						
							System.out.println("Ingresa el n\u00famero");
							System.out.print(">>");
							divi = tc.nextDouble();
							System.out.println("Ingresa el n\u00famero");
							System.out.print(">>");
							divi2 = tc.nextDouble();
							result=divi/divi2;
						System.out.println("El resultado de la divisi\u00f3n es:"+ result);
					break;
					case 5:
						salida();
						System.out.println("Espero tengas un buen día "+ nombre(name1));
						salir = true;
					break;
					default: 
					System.out.println("Solo n\u00fameros entre 1 y 4");
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Debe insertar un n\u00famero valido...");
				tc.next();
			}
		}
	}//fin del metodo menu 
	public static String nombre(String name)
	{
		return name;
	}
	public static void salida()
	{
		System.out.println("***********************************************************");
		System.out.println("Gracias por usar nuestra calculadora");
		System.out.println("Recuerda que puedes encontrar el c\u00f3digo en: https://github.com/LeoRami99/Calculadora.git");
		System.out.println("***********************************************************");
	}
}