package fp;

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
		
		
	public static String unidadEnTexto(int iNumero){	
		switch(iNumero){
		case 0:
			return "cero";
		case 1:
			return "uno";
		case 2:
			return "dos";
		case 3:
			return "tres";
		case 4:
			return "cuatro";
		case 5:
			return "cinco";
		case 6:
			return "seis";
		case 7:
			return "siete";
		case 8:
			return "ocho";
		case 9:
			return "nueve";
		default:
			return "";
		}
	 }
	public static String decenaEnTexto(int iDecena){
		 switch (iDecena){
			case 1:
				return "diez";
			case 2:
				return "veinte";
			case 3:
				return "treinta";
			case 4:
				return "cuarenta";
			case 5:
				return "cincuenta";
			case 6:
				return "sesenta";
			case 7:
				return "setenta";
			case 8:
				return "ochenta";
			case 9:
				return "noventa";		
			default:
				return "";
		 }
		}
	 public static String decenas(int iDecena){	 
		 switch (iDecena){
			case 11:
				return "once";
			case 12:
				return "doce";
			case 13:
				return "trece";
			case 14:
				return "catorce";
			case 15:
				return "quince";
			case 16:
				return "dieciseis";
			case 17:
				return "diecisiete";
			case 18:
				return "dieciocho";
			case 19:
				return "diecinueve";		
			default:
				return "";
		 }
		 
		 int iNumero;
		 int iDecenas;
		 String sTexto;
		 int iUnidad = iNumero%10;
		 iNumero = iNumero/10;		
		 sTexto = unidadEnTexto(iUnidad);
		 
		 int iDecena = iNumero%10;
		 iNumero = iNumero/10;
		  
		 if ((iUnidad==0) && (iDecena>0))
		 	sTexto = decenaEnTexto(iDecena);
		 else if (iDecena==1)
		 	sTexto = decenas(10+iUnidad);
		 else if (iDecena > 1)
		 	sTexto = decenaEnTexto(iDecena) + " y " + sTexto;
		 
		 
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
