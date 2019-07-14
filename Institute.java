package pac;

public class Institute {
Branch b=new Branch("CSE","15CS065");
String name;
String address;
Institute(String name,String address){
	this.name=name;
	this.address=address;
}
void choose()
{
	System.out.println("institute running");
}
}
