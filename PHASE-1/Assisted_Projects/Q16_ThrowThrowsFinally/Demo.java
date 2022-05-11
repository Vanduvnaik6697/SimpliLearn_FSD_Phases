package Ab_Ag_Int;

import java.io.IOException;  

public class Demo{  
	
  void m() throws IOException{  
    throw new IOException("device error"); //checked exception  
  }  
  
  void n() throws IOException{  
    m();    // it doesnot have catch block so it will move to p() calling method with 
            // exception propogation
  }  
  
  void p(){  
   try{  
    n();  
   }
   catch(Exception e)
   {
	   System.out.println("exception handled");
	   System.out.println(e.getMessage());
	   System.out.println(e.getStackTrace());
	   System.out.println(e.getClass());
   }  
   finally
	  {
		  System.out.println("finally block is always executed");
	  } 
  }  
  
  public static void main(String args[]){  
	   Demo obj=new Demo();  
	   obj.p();  
	   System.out.println("normal flow...");  
  }  
  
}  
