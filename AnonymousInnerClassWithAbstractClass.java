package com.kirangs;

/**
 * Anonymous classes (this class will not be having any name also)
 * 
 * They enable you to declare and instantiate a class at the same time. They are
 * like local classes except that they do not have a name. Use them if you need
 * to use a local class only once.
 * 
 * Name for anonymous class will be created like {classname}$1
 * 
 */
public class AnonymousInnerClassWithAbstractClass {

	public static void main(String[] args) {
		
		Person person=new Person() {
			
			@Override
			void eat() {
				
				System.out.println("Eat method implemented here");
				
			}
		};
		
		person.eat();

	}

}

abstract class Person {
	abstract void eat();
}
