/**
* Package for calculate task.
*
* @author Evgenyi Aboimov (mailto:tuz1k@mail.ru)
* @version $Id$
* @since 22.04.2017
*/
package ru.eaboimov;

/**
*String echo.
*@param value - value.
*/

public class Calculate {
	public String echo(String value){
		return String.format("%s %s %s", value, value, value);
	}
	/**
	*Main.
	*@param arhs - args.
	*/
	
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		System.out.println(calc.echo("aah"));
	}
}

