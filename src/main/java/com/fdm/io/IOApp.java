package com.fdm.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class IOApp {
	
	public void writeFile(String txt) throws IOException{
		BufferedWriter bw = getBufferedWriter();
		bw.write(txt);
		bw.flush();
	}
	
	public BufferedWriter getBufferedWriter() throws IOException{
		return new BufferedWriter(new FileWriter("./data.txt"));
	}
	
	
	public String readFile() throws IOException{
		BufferedReader br = getBufferedReader();
		return br.readLine();
	}
	
	public BufferedReader getBufferedReader() throws FileNotFoundException{
		return new BufferedReader(new FileReader("./data.txt"));
	}

}
