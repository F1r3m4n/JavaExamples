package com.fdm.generics;

import java.util.Arrays;

public class ArrayPrinter{

	public <T> void printArrays(T[] type) {
		
		for(int i=0; i<type.length; i++){
			System.out.println(type[i]);
		}
		
	
	}

}
