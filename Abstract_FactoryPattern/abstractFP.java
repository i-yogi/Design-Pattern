import java.util.*;
import java.io.*;

public class abstractFP{


//Interfaces to 'implemente'
public interface Shape{
	void draw();
}

public interface Color{
	void paint();
}


//Concrete class that implements respective interfaces

//For Shape interface
public class Circle implements Shape{

	public void draw(){
		System.out.println("Circle drawn.");
	}
}

public class Rectangle implements Shape{

	public void draw(){
		System.out.println("Rectangle drawn.");
	}
}

//For Color interface
public class Blue implements Color{

	public void paint(){
		System.out.println("Blue color painted.");
	}
}

public class Orange implements Color{

	public void paint(){
		System.out.println("Orange color painted.");
	}
}


//Abstract class for generating Factories

public abstract class AbstractFactory{

	abstract Shape getShape(String type);
	abstract Color getColor(String color);
}

//Respective classes for Factories

public class ShapeFactory extends AbstractFactory{

	Color getColor(String color){
		return null;
	}

	Shape getShape(String type){
		if(type == null){
			return null;
		} else if(type.equalsIgnoreCase("circle")){
			return new Circle();
		} else if(type.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}

		return null;
	}
}

public class ColorFactory extends AbstractFactory{

	Shape getShape(String type){
		return null;
	}

	Color getColor(String color){
		if(color == null){
			return null;
		} else if(color.equalsIgnoreCase("blue")){
			return new Blue();
		} else if(color.equalsIgnoreCase("Orange")){
			return new Orange();
		}

		return null;
	}
}

//

public class FactoryProducer{

	public AbstractFactory getFactory(String choice){
		if(choice == null){
			return null;
		} else if(choice.equalsIgnoreCase("shape")){
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("color")){
			return new ColorFactory();
		}

		return null;
	}
}


public static void main(String args[]){

	abstractFP afp = new abstractFP();

	FactoryProducer fp = afp.new FactoryProducer();

	AbstractFactory sf = fp.getFactory("shape");
	Shape s1 = sf.getShape("circle");
	s1.draw();

	AbstractFactory cf = fp.getFactory("color");
	Color c1 = cf.getColor("Orange");
	c1.paint();
}

}