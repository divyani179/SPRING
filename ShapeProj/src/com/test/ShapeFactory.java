package com.test;

public class ShapeFactory {
Shape shape;

public Shape getShape() {
	return shape;
}

public void setShape(Shape shape) {
	this.shape = shape;
}

@Override
public String toString() {
	return "ShapeFactory [shape=" + shape + "]";
}

public int getMyArea(int x,int y){
	return (int) (shape.area(x, y));
	
}

}
