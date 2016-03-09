package com.gym.javap.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeFactory sfactory = new ShapeFactory();
		
		Shape shape1 = sfactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = sfactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = sfactory.getShape("SQUARE");
		shape3.draw();
		
	}

}
