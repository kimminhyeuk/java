
public class Circle {
	int radius;
	String name;
	
	public Circle(){
		
	}
	public double getArea(){
		return 3.14 * radius * radius;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;
		pizza = new Circle();
		pizza.name="책을피자";
		pizza.radius=5;
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적" + area);
		
		Circle donut;
		donut = new Circle();
		donut.name= "대가리";
		donut.radius = 10;
		double area1 = donut.getArea();
		System.out.println(donut.name+"의 면적" + area1);
	}

}
