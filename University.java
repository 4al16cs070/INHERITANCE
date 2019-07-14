package pac;

public class University {
	public static void main(String[] args) {
		Institute i=new Institute("alvas","MOODBIDRI");
		System.out.println(i.name);
		System.out.println(i.address);
		i.choose();
		System.out.println(i.b.name);
		System.out.println(i.b.code);
		i.b.selected();
	}

}
