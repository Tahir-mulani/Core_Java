abstract class Circle
{
	float PI,radius;
	Circle()
	{
		PI=3.14f;
	}
	void setRadius(float radius)
	{
		this.radius=radius;
	}
	abstract float getCircleResult();
		
}
class Area extends Circle
{
	float getCircleResult()
	{
		return radius*radius*PI;
	}
}
class Circum extends Circle
{
	float getCircleResult()
	{
		return PI*2*radius;
	}
}
public class CircleAreaApplication
{
	public static void main(String x[])
	{
		Circle c = null;
		c = new Area();
		c.setRadius(3.0f);
		float result = c.getCircleResult();
		System.out.println("Area of Circle : "+result);
		
		c = new Circum();
		c.setRadius(3.0f);
		result=c.getCircleResult();
		System.out.println("Circumference of Circle : "+result);
	}
}