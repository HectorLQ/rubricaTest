package fp;

import java.util.ArrayList;
import java.util.Calendar;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Calculator {

	
	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		return x.getClass();
	}


	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		List<Integer>fibo;
		fibo = new ArrayList<Integer>();
		calculattingFibo(n, fibo);
		
		return fibo;
			
	}


	private static void calculattingFibo(int n, List<Integer> fibo) {
		int num1 = 0; int num2 = 1; int num3 = 0;
		for (int i = 0; i < n; i++) {
			num3 = num1 + num2;
			num2 = num1;
			num1 = num3;
			fibo.add(num3);
		}
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		
	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		int number = 0;
		int[] div;
		
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		
		
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	
	public static boolean isValidDate(String date) {
		
		
		return;
		
	}
}
