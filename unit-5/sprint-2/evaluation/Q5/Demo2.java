package eval2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Demo2 {
	public static void main(String[] args) throws Exception {
		

		
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://studentdata.txt"));
			Object s = ois.readObject();
			
			

			List<Student> st = (List<Student>) s;
			
			
			
		
			st.forEach(l -> System.out.println(l));
			ois.close();
			
			ArrayList<Student> al= new ArrayList<>(st);
			
			
			al.add(new Student(8, "n8", 800, "n8.gmail.com", "n8000", new Address("punjab", "bhatinda", "87899")));
		
		
			
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://studentdata.txt"));
		oos.writeObject(st);
		oos.flush();
			oos.close();
			System.out.println("Again serialization complete after a new object added");
			
			
		 
		 
		 
		}
}
