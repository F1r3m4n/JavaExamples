package com.fdm.serializer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Map;

/**
 * This class is used to serialize and deserializes maps which contain key value pair <String, User> 
 * @author nikolaos.lamprou
 * @version 1.0 16/05/2014
 */
public class Serializer {
	
	/**
	 * Instance Variables  
	 */
	public Map<String,User> map;
	
	/**
	 * Constructor method to instantiate the map
	 * @param map is used to set the instance variable map
	 */
	public Serializer(Map<String,User> map){
		this.map = map;
	}

	///write an object

	/**
	 * Writes the map to user.ser transforms map to bytes
	 * @param map is the map to be serialized 
	 * @throws IOException thrown when ObjectOutput.close is called
	 */
	public void serializeMap(Map<String,User> map) throws IOException{
		ObjectOutput oo = null;

		try {
			oo = getObjectOutput();
			oo.writeObject(map);
			oo.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(oo!=null)
			oo.close();
		}

	}
	
	/**
	 * Method to get the ObjectOutput
	 * @return new instance of object output
	 * @throws IOException thrown when new instance of output stream is created
	 * @throws FileNotFoundException when new instance of FileOutputStream is created
	 */
	public ObjectOutput getObjectOutput() throws IOException,
	FileNotFoundException {
		return new ObjectOutputStream(new FileOutputStream("./user.ser"));
	}

	
	////Read An Object
	
	/**
	 * Method to deserialize map
	 * @return map that has been desirealized 
	 * @throws IOException at some point
	 */
	public Map<String,User> deserializeMap() throws IOException{
		ObjectInput ois = null;
		
		try {
			ois = getObjectInput();

			map = (Map<String,User>) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(ois!=null)
			ois.close();
			
		}
		
		
		return map;
		
	}

	public ObjectInput getObjectInput() throws IOException,
			FileNotFoundException {
		return new ObjectInputStream(new FileInputStream("./user.ser"));
	}


}
