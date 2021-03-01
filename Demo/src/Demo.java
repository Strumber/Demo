
public class Demo {

	    public static void main(String args[]) { 
	        byte x; 
	        int a = 270; 
	        double b = 128.128; 
	        System.out.println("int convertida en byte"); 
	        x = (byte) a; 
	        System.out.println("a y x" + a + "" + x); 
	        System.out.println("doble convertido a int"); 
	        a = (int) b; 
	        System.out.println("b y a" + b + "" + a); 
	        System.out.println("\n double converted to byte"); 
	        x = (byte) b; 
	        System.out.println("b y x" + b + "" + x);
	    }
	}

