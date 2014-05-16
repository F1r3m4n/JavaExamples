package com.fdm.serializer;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class SerializerTest {
	
	Map<String,User> map;
	Serializer ser;
	User user;
	Share share;
	
	@Before 
	public void setUp(){
		map = new HashMap<String,User>();
		user = new User();
		share = new Share();
		
		share.setShareid(1);
		user.setUsername("bill");
		user.setPassword("pass");
		user.setShare(share);
		
		map.put(user.getUsername(), user);
		ser = new Serializer(map);
		
	}
	

	@Test
	public void testSerialiizerSerializesTheMap() throws IOException {
		ser.serializeMap(map);
	}
	
	@Test
	public void testDeserializerDeserializesTheMap() throws IOException{
		Map<String,User> deserialized;
		deserialized = ser.deserializeMap();
		User duser = deserialized.get("bill");
		System.out.println("confirmpassword " + duser.getConfirmpassword());
		System.out.println("password " + duser.getPassword());
		Share dshare = duser.getShare();
		System.out.println("Shareid " + dshare.getShareid());
		
	}

}
