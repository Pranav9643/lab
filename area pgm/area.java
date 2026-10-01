class check{
	public double circle(double r){
        	return 3.14*r*r;
	}
    	public float Square(float r){
        	return r*r;
    	}
    	public double Rectangle(double a,double b){
        	double length = a;
        	double radius = b;
        	return length*radius;
	}
}

public class area{
	public static void main(String args[]){
        	check obj = new check();
        	System.out.println("Circle:"+obj.circle(2.0));
        	System.out.println("Square:"+obj.Square(2f));
        	System.out.println("Rectangle:"+obj.Rectangle(2,3));
		
	}
}