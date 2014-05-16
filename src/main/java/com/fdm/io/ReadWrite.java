package com.fdm.io;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReadWrite {
	
	
	

	public static void main(String[] args) throws IOException {
		
		ArrayList array = new ArrayList(); 
		StringBuffer buff = new StringBuffer();
		IOApp ioapp = new IOApp();
		
		for(int i=0; i<100; i++){
			array.add(i);
			buff.append(array.get(i) + " ");
		
		}
		String str = buff.toString();

		ioapp.writeFile(str);
		System.out.println(str);
	}

}
