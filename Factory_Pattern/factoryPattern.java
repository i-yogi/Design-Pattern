import java.util.*;
import java.io.*;

public class factoryPattern{


public interface Shape{
	void draw();
}

public class Rectangle implements Shape{
	public void draw(){
		System.out.println("Draw Rectangle.");
	}
}

public class Square implements Shape{
	public void draw(){
		System.out.println("Draw Square.");
	}
}

public class Circle implements Shape{
	public void draw(){
		System.out.println("Draw Circle.");
	}
}

public class ShapeFactory{

	public Shape getShape(String type){
		if(type == null){
			return null;
		} else if(type.equalsIgnoreCase("Circle")){
			return new Circle();
		} else if(type.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		} else if(type.equalsIgnoreCase("Square")){
			return new Square();
		}
		return null;
	}
}

	public static void main(String args[]){

		factoryPattern fp = new factoryPattern();

		ShapeFactory shapeFactory = fp.new ShapeFactory();

		Shape s1 = shapeFactory.getShape("Circle");
		s1.draw();

		Shape s2 = shapeFactory.getShape("square");
		s2.draw();
	}
}



