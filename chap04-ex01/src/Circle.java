
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
		pizza.name="å������";
		pizza.radius=5;
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ����" + area);
		
		Circle donut;
		donut = new Circle();
		donut.name= "�밡��";
		donut.radius = 10;
		double area1 = donut.getArea();
		System.out.println(donut.name+"�� ����" + area1);
	}

}
