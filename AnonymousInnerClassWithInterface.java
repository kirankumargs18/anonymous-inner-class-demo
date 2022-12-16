package com.kirangs;

/**
 * Anonymous classes (this class will not be having any name also)
 * 
 * They enable you to declare and instantiate a class at the same time. They are
 * like local classes except that they do not have a name. Use them if you need
 * to use a local class only once.
 * 
 * While local classes are class declarations, anonymous classes are
 * expressions, which means that you define the class in another expression
 * 
 * Name for anonymous class will be created like {classname}$1
 * 
 */
interface HelloWorld {
	
	void greet();

	void greetSomeone(String someone);
}


public class AnonymousInnerClassWithInterface {
	
	public static void main(String[] args) {
		
		HelloWorld helloWorld=new HelloWorld() {
			
			@Override
			public void greetSomeone(String someone) {
				
				System.out.println("Hey "+someone+" , Good Morning");
				
			}
			
			@Override
			public void greet() {
				
				System.out.println("Hey Hi, Good Morning");
				
			}
		};
		
		helloWorld.greet();
		helloWorld.greetSomeone("Kiran");
		
	}

}
