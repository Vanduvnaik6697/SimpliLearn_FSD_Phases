package Collections;

class AccesMod{
	
	private void message(){
		System.out.println("Accesesable only within class");
	}
	
	void message1(){
		System.out.println("\nDefault: Accesesable only within class and within package");
	}
	protected void message2(){
		System.out.println("\nProtected: Accesesable in within class and within package");
		System.out.println("\n----------Also----------");
		System.out.println("\nProtected: Accesesable outside class by subclass only after extends the parent class");
	}
	public void message3(){
		System.out.println("\nPublic: Accesesable to All");
		
	}
	
}

public class AccessMod {

	public static void main(String[] args) {
		AccesMod am1=new AccesMod();
		//am1.message();// compile time error due to private
		am1.message1();
		am1.message2();
		am1.message3();
	}

}