
public class JacobAndJayden {
	
    static int Solution(int x, int y, int [] A) 
    { 
        int n=A.length;
        int Xcount=0,Ycount=0,result=-1;
		for(int i=0;i<n;i++) {
			if(A[i]==x)	Xcount++;
			if(A[i]==y)	Ycount++;
			
			if(Xcount==Ycount) {
				result=i;
			}
		}
        return result; 

         }
      
    public static void main(String[] args) 
    { 
    	
    	//int [] A= {100,63,1,6,2,13};
    	int [] A= {6,42,11,7,1,42};
    	//int [] A= {7, 42, 5, 6, 42, 8, 7, 5, 3, 6, 7};
    	
    	//int x=100,y=63;
    	int x=7,y=42;
    	//int x=7,y=42;
    	int r = Solution(x,y,A);
        System.out.println(r);
    
    }

}
