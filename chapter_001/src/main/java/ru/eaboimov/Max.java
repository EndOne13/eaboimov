package ru.eaboimov;
/**
������������ ����� �� 2 � 3 �����.
*/
public class Max {
	/**
	Method max.
	@param first first
	@param second second
	@return first
	*/
	public int max(int first, int second) {
	 return (first > second) ? first : second;
}
/**
Method max.
	@param first first
	@param second second
	@param third third
	@return max
	*/
    public int max(int first, int second, int third) {
	 return max(first, max(second, third));
	 }
}


