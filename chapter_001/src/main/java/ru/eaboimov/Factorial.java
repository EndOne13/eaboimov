package ru.eaboimov;
/**
@���������� ����������.
*/
public class Factorial {
	/**
	����� calc.
	@param n n
	@return factor
	*/
	public int calc(int n) {
		int factor = 1;
		/**
		@param n n
		@return factor
		*/
		for (int i = 1; i <= n; i++) {
			factor = factor * i;
		}
		/**
		@�����
		*/
		return factor;
	}
}
