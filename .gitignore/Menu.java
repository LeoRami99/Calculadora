import java.util.*;

class Menu 
{
	public static void main(String[] args) 
	{
	 Scanner tc = new Scanner(System.in); 
		//variables para menu
		int opcion;
		String name1;
		boolean salir = false;	
		System.out.println("Escribe tú nombre");
		name1 = tc.nextLine();
		System.out.println("\n");
		System.out.println("\t---Hola "+ nombre(name1)+"---");
		System.out.println("\n");
	
	while (!salir) 
		{
			System.out.println("*******************************************************");                                                                                                                                                                                      
			System.out.println("▒█▀▀█ █▀▀█ █░░ █▀▀ █░░█ █░░ █▀▀█ █▀▀▄ █▀▀█ █▀▀█ █▀▀█ ");
			System.out.println("▒█░░░ █▄▄█ █░░ █░░ █░░█ █░░ █▄▄█ █░░█ █░░█ █▄▄▀ █▄▄█ ");
			System.out.println("▒█▄▄█ ▀░░▀ ▀▀▀ ▀▀▀ ░▀▀▀ ▀▀▀ ▀░░▀ ▀▀▀░ ▀▀▀▀ ▀░▀▀ ▀░░▀ ");
			System.out.println("*******************************************************");
			System.out.println("\tOpci\u00f3n 1 Sumar");
			System.out.println("\tOpci\u00f3n 2 Restar");
			System.out.println("\tOpci\u00f3n 3 Multiplicar");
			System.out.println("\tOpci\u00f3n 4 Dividir");
			System.out.println("\tOpci\u00f3n 5 Salir");
			
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
						System.out.println("\t"+nombre(name1)+" estas en el apartado de suma");
						System.out.println("\tTe recordamos que no es necesario introducir el operador");
						System.out.println("***********************************************************");
						int i=0;
						do
						{	
							System.out.println("Ingresa el " + (i+1) +" número");
							System.out.print(">>");
							suma = tc.nextDouble();
							resum=suma+resum;
							i++;
						}
						while (suma!=0);
						System.out.println("El resultado de la suma es: " + resum);

					break;
					
					case 2:
						System.out.print("Has seleccionado la opción Restar");
					break;
					case 3:
						System.out.print("Has seleccionado la opción Multiplicar");
					break;
					case 4:
						System.out.print("Has seleccionado la opción Dividir");
					break;
					case 5:
						salida();
						System.out.println("Espero tengas un buen día "+ nombre(name1));
						salir = true;
					break;
					default: 
					System.out.println("Solo números entre 1 y 4");
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Debe insertar un número valido...");
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
		System.out.println("Gracias por usar nuestra calculadora");
		System.out.println("Recuerda que puedes encontrar el codigo en: https://github.com/LeoRami99/Calculadora-.git");
	}
}