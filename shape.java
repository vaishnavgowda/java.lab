import java.util.*;

class shape
{
	int a;
	int b;
	void printarea()	
	{}
}

class triangle extends shape
{	
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.print("ENTER THE BASE AND HIGHT   ");
	a = s.nextInt();
	b = s.nextInt();
	area=0.5*a*b;
	System.out.println("AREA OF TRIANGLE  : "+area);
	}
}

class rectangle extends shape
{
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.print("ENTER THE LENGTH AND  BREADTH  ");
	a = s.nextInt();
	b = s.nextInt();
	area=a*b;
	System.out.println("AREA OF RECTANGLE : "+area);
	}
}


class  circle extends shape
{
	Scanner s = new Scanner(System.in);
	double area;
	void printarea()
	{
	System.out.print("ENTER THE RADIOUS ");
	a = s.nextInt();
	area=3.14*a*a;
	System.out.println("AREA OF CIRCLE : "+area);
	}
}


class main1
{
public static void main(String a[])
{
	rectangle r=new rectangle();
	r.printarea();
	triangle t = new triangle();
	t.printarea();
	circle c = new circle();
	c.printarea();
}
}
