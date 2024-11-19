
///////////////////////////////////////
package My_class_pac;

public class Const1 {
   
    private int int1, int2, int3;
    private String str1, str2;
    private float floatValue;

  
    Const1(int int1, int int2, int int3) {
        this.int1 = int1;
        this.int2 = int2;
        this.int3 = int3;
       
    }

  
    Const1(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        
    }

   
    Const1(float floatValue) {
        this.floatValue = floatValue;
       
    }

   
    
     void show()

     {
    	 System.out.println("Constructor with 3 integers called: " + int1 + ", " + int2 + ", " + int3); 
    	 
    	 System.out.println("========================================================================");
    	 
    	 System.out.println("Constructor with 2 strings called: " + str1 + ", " + str2);
      	 System.out.println("========================================================================");
    	 
    	 System.out.println("Constructor with 1 float called: " + floatValue);
      	 System.out.println("========================================================================");
     }
}
