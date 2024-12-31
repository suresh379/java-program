package java1;
interface Shape{
	void getarea(int... values);
}
class Rectangle implements Shape{
	public void getarea(int... values) {
		int length=values[0];
	    int breadth=values[1];
	    int area=length*breadth;
	    System.out.println("Rectangle area :"+area);
	}
}
class Triangle implements Shape{
	    public void getarea(int... values) {
		int base=values[0];
	    int heigth=values[1];
	    double area=0.5* base* heigth;
	    System.out.println(" Triangle area :"+area);
}
}
class circle implements Shape{
	public void getarea(int... values) {
		int radius=values[0];
	    double area=0.5* radius*radius;
	    System.out.println(" circle area :"+area);

}

public class Main5 {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.getarea(7,5);
		Triangle t=new Triangle();
		t.getarea(2,5);
		circle c=new circle();
		c.getarea(3,8);
		// TODO Auto-generated method stub
		
		
		

	}

}
