import java.util.*;
import java.io.*;

public class Driver {

	public static void main(String[] args){

		//SingleObject singleObject = new SingleObject();
		//Error: SingleObject() has private access

		SingleObject singleObject = SingleObject.getInstance();
		//Can be asked many time BUT
		//Only returns the same instance created in singleton class

		singleObject.showMsg();		
	}
}