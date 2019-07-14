package pac;

public class Bike {
Engine e=new Engine("abc",110.5);
String color;
String model;
Bike(String color,String model){
	this.color=color;
	this.model=model;
}
void run()
{
	System.out.println("bike is running"); 
}
}
