package programacionFuncional1;

import java.util.Arrays;
import java.util.List;

import programacionFuncional1.main.Operaciones;

public class testProgramacionFuncional {
	
	
	public static class Operaciones{
		
		public static int verSiPar(int x) {
			
			int par= 0;
			
			if(x %2== 0) {
				
				par= x;
			}
			return par;
		}
		
		public static int multiplicar(int x, int y) {
			
			return x*y;
		}
		public static int restar(int x, int y) {
			
			return x-y;
		}
		}
	
	static List<String> Nombres = Arrays.asList("Paco", "Pepe", "Ana");
	static List<Integer> numeros = Arrays.asList(1, 2,3,4,3,7,3);
	static List<Integer> numerosPares = Arrays.asList();
	
	

	public static void main(String[] args) {
		
		
		// prueba de con el reduce, coger los numeros y ejecutar la operacion restar
		// int a = numeros.stream().reduce(0, Operaciones::restar);
		
		// Cogemos los numeros y los sumamos, si existe un valor, hace un print del mismo
		numeros.stream().reduce((x,y)->{
			return x+y;
		}).ifPresent(System.out::println);
		
		// Cuenta la cantidad de nombres en la lista
		//System.out.println(Nombres.stream().count());
		
		//Coge toda la lista con reduce y te concatena los nombres
		//Nombres.stream().reduce(String::concat).ifPresent(System.out::println);
		
		
		int a = buscarRepetidos(3);
		System.out.println("Se ha repetido el numero " + a + " veces");
		
		
			
		

	}
	
	//Método que busca numeros iguales a 3 y devuelve el numero de repeticiones
	public static int buscarRepetidos(int numero) {
		
		return (int) numeros.stream().filter( resp-> {
			
			
			return resp.equals(numero);
		}).count();
		
	}
	
	//metodo que devuelve true o false si el nombre que se pasa por parámetro existe
	public static boolean existeNombre(String nombre) {
		
		for(String item : Nombres) {
			
			if(item.equals(nombre)) {
				return true;
			}
		}
		return false;
		
		
	}

}
