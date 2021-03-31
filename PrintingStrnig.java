package sample;

public class PrintingStrnig {

	  // Method to print the string 
	    static void printString(String str,  int count) 
	    { 
	        int sum=0,wordCount=0; 
	        String s1="";
	        if (count>str.length()) { 
	           // System.out.println(str); 
	            return; 
	        } 
	        String[] arrOfStr = str.split(" "); 
	         for (String a : arrOfStr) {
	        	// System.out.print(a+ "");
	             int l=a.length();
//	             System.out.println("-------"+ l);
//	             System.out.println("total words="+ wordCount);
	             if((l+wordCount)<=count){
	            	// System.out.println(l+wordCount);
	            	// System.out.println(sum);
	                  for(int i=0;i<l;i++){
	                       s1=s1+a.charAt(i);
	                       sum++;     
	                  }
	            if (sum== count) 
	                break; 
	            s1=s1+" ";
	            //System.out.println(s1+ "");
	        }
	             wordCount+=l+1; 
	         }
	        System.out.println(s1);
	    }
	    public static void main(String[] args) 
	    { 
	        //String str = "the quick brown fox jumps over the lazy dog"; 
	    	//String str = "codility we test coders"; 
	          String str = "To crop or not to crop"; 
	        printString(str,21); 
	    } 
	} 


