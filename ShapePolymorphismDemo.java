import java.util.Scanner;
class Shape {
	public void draw (){
		System.out.println("Drawing a generic shape.");
	}
	public void erase(){
		System.out.println("Erasing a generic shape.");
	}
}
class Circle extends Shape {
	private double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Drawing  a Circle with radius: " + radius);
	}
	public void erase(){
		System.out.println("Erasing the Circle.");
	}
}
class Triangle extends Shape {
	private double base;
	private double height;
	public Triangle(double base,double height){
		this.base = base;
		this.height = height;
	}
	public void draw(){
		System.out.println("Drawing a Triangle with base:" + base + " and height: " + height);
	}
	public void erase(){
		System.out.println("Erasing the Triangle>");
	}
}
class Square extends Shape {
	private double side;
	public Square(double sids){
		this.side = side;
	}
	public void draw(){
		System.out.println("Drawing a square with side length: " + side);
	}
	public void erase(){
		System.out.println("Erasing the Square.");
	}
}
public class ShapePolymorphismDemo {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("--- ENTER DIMENSIONS---");
		System.out.print ("Enter radius for Circle: ");
		double radius = scanner.nextDouble();
		System.out.print("Enter base for Triangle: ");
		double base = scanner.nextDouble();
		System.out.print("Enter height for Triangle: ");
		double height = scanner.nextDouble();
		System.out.print("Enter side length for Square: ");
		double side = scanner.nextDouble();
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(radius);
		shapes[1]= new Triangle(base, height);
		shapes[2]=new Square(side);
		System.out.println("\n===DEMONSTRATING POLYMORPHISM ===\ns");
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].draw();
			shapes[i].erase();
			System.out.println();
		}
		scanner.close();
	}
}	
			
		
		 
		
		
	
	