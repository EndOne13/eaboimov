/**
* Package for calculate task.
*
* @author Evgenyi Aboimov (mailto:tuz1k@mail.ru)
* @version $Id$
* @since 22.04.2017
*/
package ru.eaboimov;

/**
*Main.
*@param args - args.
*/

public class Calculate {
	public String echo(String value){
		return String.format("%s %s %s", value, value, value);
	}
	public static void main(String[] args) {
		Calculate calc = new Calculate();
		System.out.println(calc.echo("aah"));
	}
}

