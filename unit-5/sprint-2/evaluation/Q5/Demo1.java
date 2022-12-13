package eval2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;
public class Demo1 {
	public static void main(String[] args) throws Exception {
		
		
		ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream("d://studentdata.txt"));
		
		List<Student> slist = Arrays.asList(
				
				new Student(3, "n3", 300, "n3.gmail.com", "n3000", new Address("mudhol", "baglkot", "8746008088")),
				new Student(4, "n4", 400, "n4.gmail.com", "n4000", new Address("bengaluru", "south", "5874601")),
				new Student(5, "n5", 500, "n5.gmail.com", "n5000", new Address("bijapur", "sindhagi", "587302")),
				new Student(6, "n6", 600, "n6.gmail.com", "n6000", new Address("bidat", "bidar", "78165")),
				new Student(7, "n7", 700, "n7.gmail.com", "n7000", new Address("indi", "oieiw", "132543"))
				
				);
		
		
		oos.writeObject(slist);
		oos.flush();
		oos.close();
		
		System.out.println("serialisation complete");
		
	}

}
