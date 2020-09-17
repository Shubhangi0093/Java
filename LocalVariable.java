 
public class LocalVariable {
	//These are instance variables 
	//because they are declared in the class but outside of any function
	int x=1;
	int y;
    public void Age(){
    	// These are local variables
    	//object initialization is mandatory within this block
    	String a = "Covid is more danger for age group of ";
    	int b = 60;
    	int c = 10;
    	int d= b+c;
    	//Initialization of local variable is Mandatory otherwise it will show an
    	//compilation error when the variable is invoked to the output
    	int e;
    	String g;
    	//We cannot access these variables outside this method i.e Age
    	System.out.println(a+b);
    	System.out.println(d);
    	//System.out.println(e);//Here it will show error as we are calling the variable which is not initialized
    	//System.out.println(g);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a an object for the class for local variable
		LocalVariable age = new LocalVariable();
		//If we try to initialize any local variable here it will give any compilation error
		age.Age();
		
		//Creating an object of the class for instance variable which can be used to invoke 
		//the variable from outside of this main method
		LocalVariable age1 = new LocalVariable();
		//We can initialize a instance variable here
		age1.y= 10;
		
		//Here we are calling the function and displaying the output
		//through a print statement
		System.out.println(age1.x+age1.y);
		
	}

}
