package parcialJava;
import java.util.*;
import java.lang.Character;
public class Funcion {

	String fila;
	
	public String comprimir (String a)
	{
		int contador=1;
		int indice;
		char letraSiguiente='j';
		String salida="";
		String termino="";
		int corte=a.length();
		
		for(int x=0;x<a.length()-1;x++)
		{
			char letraActual=a.charAt(x);
			indice=x+1;
			letraSiguiente=a.charAt(indice);
			if (letraActual==letraSiguiente)
			{
				contador++;
				
			}
			if ((letraActual!=letraSiguiente)||(x==corte-2))
			{
				if (contador>4)
				{
					termino="("+letraActual+contador+")";
					salida=salida.concat(termino);
					contador=1;
					
				}
				else
				{
					for (int j=0;j<contador;j++)
						salida=salida.concat(" "+letraActual+" ");
					contador=1;
				}
			}
			
		}
		return salida;
	}

	public String descomprimir (String a)
	{
		String salida="";
		char letraActual;
		char letraDespuesPar;
		int cant=0;
		int indice=0;
		int indice2=0;
		boolean esDigito=false;
		//comentario
		for(int x=0;x<a.length()-1;x++)
		{
			letraActual=a.charAt(x);
			esDigito=Character.isLetter(letraActual);
			if (letraActual=='(')
			{
				indice2=x+1;
				letraDespuesPar=a.charAt(indice2);
				indice=x+2;
				cant = Character.getNumericValue(a.charAt(2));
				for (int j=0;j<cant;j++)
				{
					esDigito=Character.isLetter(letraActual);

					if (letraActual!=')')
					{
						if (esDigito==false)
							salida=salida.concat(""+letraDespuesPar);

					}
				}
			}
			else
			{
				esDigito=Character.isLetter(letraActual);

				if (letraActual!=')')
				{
					if (esDigito==true)
						salida=salida.concat(""+letraActual);
				}
			}
			
		}
		
		
		return salida;
	}
}
