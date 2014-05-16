package com.fdm.io;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.mockito.Spy;


public class IOAppTest  {

	
	
	@Test
	public void testReadFileVerifiesThatReadLineMethodFromBRWasCalled() throws IOException{
		IOApp spyioapp = spy(new IOApp());
		BufferedReader mockbr  = mock(BufferedReader.class);
		doReturn(mockbr).when(spyioapp).getBufferedReader();
		spyioapp.readFile();
		verify(mockbr).readLine();
	}
	
	@Test
	public void testWriteFileVerifiesThatWriteMethodFromBWWasCalled() throws IOException{
		IOApp spyioapp = spy(new IOApp());
		BufferedWriter mockbw = mock(BufferedWriter.class);
		doReturn(mockbw).when(spyioapp).getBufferedWriter();
		spyioapp.writeFile("hi");
		verify(mockbw).write("hi");
		
	}

}
