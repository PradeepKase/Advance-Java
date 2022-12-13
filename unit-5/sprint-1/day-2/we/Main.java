package class2;

public class Main {
	public void fun2(String s) {
		System.out.println("inside fun1 of main "+s);
		System.out.println(s);
	}
	
	public Main(String name) {
		System.out.println("inside constructor of main calss "+name);
		System.out.println(name);
	}

	public static void main(String[] args) {
	//using External class
//		Intr i1=new IntrImplimentation();
//		i1.sayHello("pradeep");
	
		//using inner class
//	Intr i2=new Intr() {
////		@override
//		public void sayHello(String name) {
//			System.out.println("your name is "+name);
//		}
//	};
//	i2.sayHello("pradeep");
	
	//7using lamda
//	Intr i4=(name,age)->{
//		System.out.println("using lamda " +name+" "+age);
//	};
//	
//	i4.sayHello("paddu",24);
		
		
		//usingn external class and using studewnt javabean
//		Intr i1= new IntrImplimentation();
//		i1.sayHello(new Student("pradeep",1158,600));
		
		
		//usingn inner class and using studewnt javabean
//		Intr i2=new Intr() {
//			@Override
//			public void sayHello(Student s) {
//				System.out.println("roll is "+s.getRoll());
//				System.out.println("name is "+s.getName());
//				System.out.println("marks is "+s.getMark());
//			}
//
//		};
//		i2.sayHello(new Student("pradeep", 1158, 650));
		
		
		//usingn lamda Expression and using studewnt javabean
//		Intr i3=(Student s)->{
//			System.out.println("roll is "+s.getRoll());
//			System.out.println("name is "+s.getName());
//			System.out.println("marks is "+s.getMark());	
//		};
//		i3.sayHello(new Student("paddu",1158,750));
		
		
		//usingn external class and return type
//		Intr i1=new IntrImplimentation();
//		String s1=i1.sayHello("paddu");
//		System.out.println(s1);
		
		//using inner class return
//		Intr i2= new Intr() {
//			@Override
//			public String sayHello(String name) {
//				return name.toUpperCase();
//			}
//		};
//		String result =i2.sayHello("pradeep");
//		System.out.println(result);
		
		
		//using lamda
		
//		Intr i3=name->{
//			 return name.toLowerCase();
//		};
//		
//		System.out.println(i3.sayHello("Pradeep"));
		
		
		//return usingn  and using student javabean external class
		
//		Intr i1=new IntrImplimentation();
//		System.out.println(i1.getStudentdetails( 1152,"paddu",88));
		
		
		//return usingn lamda Expression and using student javabean external class
//		Intr i2=(roll, name,marks)->new Student(name.toUpperCase(),roll, marks+5);
//	
//		System.out.println(i2.getStudentdetails(30, "pradeep", 500));
		
		
		//Method reference if method is similar and static
//		Intr i1=Main::fun1;
//		i1.sayHello("MR");
		
		//Method reference if method is similar and non-static
//		Intr i2 = new Main()::fun2;
//		i2.sayHello("paddu");
		
		
		//Method reference using costructor
//		Intr i3=Main::new;
//		i3.sayHello("pradeep");
		
		
		//EX:2 using MR
		
//		Intr i1=number->System.out.println(Integer.parseInt(number)+2); 
//		i1.sayHello("20"); 
		
		
		Intr i2=Integer::parseInt;
		System.out.print(i2.sayHello("100")+4);
}
}
