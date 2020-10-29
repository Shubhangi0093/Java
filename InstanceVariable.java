
public class InstanceVariable {
	//Declare instance variable in a class outside of any function
     int a;
     String b;
     int c;
     String d= "I love coding";	
     //Declaring instance variable without initialization
     int e;
     String g;
     
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        InstanceVariable obj1= new InstanceVariable();
        obj1.a= 10;
        obj1.b ="Hi";
        obj1.c= 20;
        InstanceVariable obj2= new InstanceVariable();
        obj2.b="Hello";
        obj2.d= "Oop's has four main concepts Inheritance, Abstraction, Encapsulation and Polymorphism.";
        		
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj2.b);
        System.out.println(obj1.c);
        System.out.println(obj1.d);
        System.out.println(obj2.d);
        //Instance variable without initialization value will give default output as 0 for integer input
        System.out.println(obj1.e);
      //Instance variable without initialization value will give default output as null for String input
        System.out.println(obj1.g);
       
        
        
	}

}
