package com.fdm.serializer;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class SerTest {

	Serializer ser;
	Serializer spy;
	@Mock
	Map<String,User> map;
	@Mock
	ObjectOutput oos;
	@Mock
	ObjectInput ois;
	@Mock
	User user;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		ser = new Serializer(map);
		spy = spy(ser);
	}
	
	@Test
	public void testSerializeMapCallsWriteObjectMethod() throws IOException {
		doReturn(oos).when(spy).getObjectOutput();
		spy.serializeMap(map);
		verify(oos).writeObject(map);
		verify(oos).flush();
		verify(oos).close();
	} 
	
	@Test
	public void testDeserializeMapCallsReadObjectMethod() throws ClassNotFoundException, IOException{
		doReturn(ois).when(spy).getObjectInput();
		spy.deserializeMap();
		verify(ois).readObject();
		verify(ois).close();
	}
	
	

}
