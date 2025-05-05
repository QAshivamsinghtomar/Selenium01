package com.selenium.singalton;

//if any java class allow to create only one object then that is called as SingleTon class.
// We we want to create singalton class then that's class constructor should be private.

class Example {

	public Example() {

	}

	static Example getReference() {
		Example example = new Example();
		if (example == null) {
			example = new Example();
			return example;
		} else {
			return example;
		}
	}

}

class Sample {

	static Sample sample = null;

	private Sample() {

	}

	static Sample getReference() {
		if (sample == null) {
			sample = new Sample();
			return sample;
		} else {
			return sample;
		}
	}

}


public class Singalton_class {

	public static void main(String[] args) {
		
		System.out.println(Sample.getReference());
		System.out.println(Sample.getReference());
		System.out.println(Sample.getReference());

		System.out.println();

		System.out.println(Example.getReference());
		System.out.println(Example.getReference());
		System.out.println(Example.getReference());

		//Sample sample1 = new Sample();

		Example example1 = new Example();
		

	}

}
