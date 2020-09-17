
public class StaticVariable {
	
	static int a =6;
	static int b;
	static String c= "Apples";
	static String d;
	String e= "I am shubhangi";
	int f;
	static int g;
	static String h;
	public void LocalStatic() {
		//Using static variable inside a function may lead to error
		//static int x= 110;
		int y=10;
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StaticVariable.b = 30;
         StaticVariable.d = "is of ";
         System.out.println(StaticVariable.a+ " " + StaticVariable.c+" " +StaticVariable.d+"Rs."+StaticVariable.b);
         StaticVariable obj = new StaticVariable();
         obj.b= 70;
         obj.f= 27;
         System.out.println(obj.e+"\nI am "+obj.f+" years old"+ "\nNow, the " + StaticVariable.c +" price has increased to Rs."+obj.b);
         StaticVariable obj1 = new StaticVariable();
         obj1.LocalStatic();
         //Calling static variable using local function(Constructor)
         System.out.println(obj1.g);
         //Calling static integer variable using Class and without initialization will give default value as 0
         System.out.println(obj.g);
         //Calling a String variable without initialization will give default value as null
         System.out.println(obj.h);
	}

}
