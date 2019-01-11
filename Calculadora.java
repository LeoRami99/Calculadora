//calculadora desarrollada por Juan Leonardo Ramírez Velásquez.
//juanlov4321@gmail.com
//whatsapp: +573002100794
//Se es modificable el código a su gusto.
import java.util.Scanner;// se usa la libreria Scanner para que más adelante se cree el objeto y el usuario pueda digitar lo que se le va a pedir.

class Calculadora
{
	public static void main(String[] args) 
	{
	 	Scanner tc = new Scanner(System.in); //se crea un objeto Scanner para datos que seran introducidos por teclado
		//variables para menu
		int opcion;//variable entera para opcion para después ser usada en el switch
		String name1;//se llama el metodo llamado nombre el cual el usuario digita su nombre 
		double result=0,cant=0;//Variables universales para resultado y cantidad
		boolean salir = false;//variable boolean para el while y el case 5
		System.out.println("Escribe t\u00fa nombre");
		name1 = tc.nextLine();
		System.out.println("\n");
		System.out.println("\t---Hola "+ nombre(name1)+"---");
		System.out.println("\n");
	

	while (!salir) 
		{
			//Se le menciona al usuario las opciones de la calculadora
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
					//en todos las operaciones básicas solo se pueden digitar dos números 

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
	//se crea un metodo para que el usuario pueda degitar el nombre mas arriba, el nombre aparezca en varias secciones
	//de la calculadora
	public static String nombre(String name)
	{
		return name;
	}
	//se crea este metodo para que se ejecute cuando termine el programa
	public static void salida()
	{
		System.out.println("***********************************************************");
		System.out.println("Gracias por usar nuestra calculadora");
		System.out.println("Recuerda que puedes encontrar el c\u00f3digo en: https://github.com/LeoRami99/Calculadora.git");
		System.out.println("***********************************************************");
	}
}