package ru.eaboimov;
/**
C���� ������ �����.
*/
public class Counter {
/**
@����� add.
@param start start
@param finish finish
@return sum
*/
public int add(int start, int finish) {

int sum = 0;
for (int i = start; i <= finish; i++) {
	if (i % 2 == 0) {
		sum += i;
	}
    }
	return sum;
  }
}

