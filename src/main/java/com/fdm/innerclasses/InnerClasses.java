package com.fdm.innerclasses;

public class InnerClasses {

	public static void main(String[] args) {

		MyInterface mi = new MyInterface() {

			public void myMethod() {
				System.out.println("Inside myMethod!");
				myOtherMethod();

			}

			public void myOtherMethod(){
				System.out.println("Inside my other Method");
			}

		};

		mi.myMethod();


		//Local Class

		class MyClass implements MyInterface{

			public void myMethod() {
				System.out.println("Inside My Method");
			}
			public void myOtherMethod() {
				System.out.println("Inside My Other Method");
			}

		}//Class end
		MyClass c = new MyClass();
		c.myMethod();
		c.myOtherMethod();
	}

}
