package com.fdm.innerclasses;

public  class EnclosingClass {
	
	private static String myString = "Hello";
	
	public static class InnerClass{
		
		public void greeting(){
			System.out.println(myString + ", inside innerClass");
		}
		
		
	}

}
