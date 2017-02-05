import java.util.*;
import java.io.*;

public class SingleObject {

//static instance of itselft
	private static SingleObject onylObject = new SingleObject();


//private constructor
	private SingleObject() {
		System.out.println("Private Constructor is called");
	}

//get the only object created above
	public static SingleObject getInstance(){
		return onylObject;
	}

//method on the only object
	public void showMsg(){
		System.out.println("This is a Singleton object!");
	}
}

