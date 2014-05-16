package com.fdm.generics;

public class Arrays {
	
	
	String[] strings = {"one", "two", "three"};
	Integer[] ints = {1,2,3};
	Character[] chars = {'a','b','c'};
	Double[] doubles = {1.0,2.0,3.0};
	Byte[] bytes = {4,5,6};
	Float[] floats = {1.0F,2.0F,3.0F};
	Long[] longs = {6L,7L,8L};
	
	

	public static void main(String[] args) {
	
		Arrays arrays = new Arrays();
		arrays.print();

	}


	private void print() {
		ArrayPrinter printer = new ArrayPrinter();
		printer.printArrays(strings);
		printer.printArrays(ints);
		printer.printArrays(chars);
		printer.printArrays(doubles);
		printer.printArrays(bytes);
		printer.printArrays(floats);
		printer.printArrays(longs);
		
	}

}
