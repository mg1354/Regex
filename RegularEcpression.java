import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEcpression {

	public static void main(String[] args) {
		
		String[] pattern ={"(?i)abcdefghijklmnopqrstuvwxyz",
		        "(?i)ola",
		        "a{3,5}",
		        "\\W{2,}+",
		        "[a-zA-Z0-9_%.\\-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z]{2,3}+",
		        "\\d{8}|[\\d/-]{4}+\\d{6}",
		        "(\\D)\\1\\1\\1(?!1)+",
		        "[a-zA-Z]{3}/[0-9]{3}|[a-zA-Z]{3}_[0-9]{3}",
		        "\\([a-zA-Z0-9]+\\)",
		        "(if)\\(+[a-zA-Z0-9\\W]+;|(for)\\(+[a-zA-Z0-9\\W]+}"};;
	
		 File file = new File("D:\\JAVA\\RegularExpression\\src\\text.txt");
		
		 for(int i=0; i< pattern.length; i++ ) {
			 
			 int x = 0;
	    	 int y = 0;   
	 
	        try {
		
		         Scanner txt = new Scanner(file);
		             
	            	 if(i==3) {
	            		
	            		 while (txt.hasNextLine()) {
	    	            	 
	    	            	 String line = txt.nextLine();
	    	            	 x = x + finder1( line , pattern[i]);
	            		 }
	            	 } else {
	            		 
	            		 	 while (txt.hasNextLine()) {
	    	            	 
	    	            	 String line = txt.nextLine();
	    	            	 
	    	            	 y++;
	    	            	 
	    	            	 finder2(line , pattern[i], y);
	    	            	 
	            		 	 }
	            		 
	            	 }
	            	 
	            	 
	             txt.close();
	             
	             if(x != 0) {
		        	  System.out.println(" This is x: " + x);
		          }
	             
	            
	          }
	          
	          catch (FileNotFoundException e) {
		
	        	  e.printStackTrace();
	          }
	 
		  }
		
	}
	
	
	    public static int finder1 (String line , String pattern) {
		     
	    	 Pattern p = Pattern.compile(pattern);
		     Matcher matcher = p.matcher(line);
		     
		     int k = 0 ;
		    
		     while (matcher.find()) {
			  
		    	 if(matcher.group().length() != 0) {
			
			       k++;
			     }
			   			
		      }
	          return k;
	   }
	    
	    
	    public static void finder2(String line , String pattern , int z) {
	    	
	    	 Pattern p = Pattern.compile(pattern);
		     Matcher matcher = p.matcher(line);
		     
		     while (matcher.find()) {
				  
		    	 if(matcher.group().length() != 0) {
			
		    		 System.out.print("Found "+ p +": in " + matcher.group() + " ");
		             System.out.print(", Line: " + z + " ");
		             System.out.print(" ,Starts at: " + matcher.start() + " ");
		             System.out.println(" ,Ends at: " + matcher.end());
			     }
		     
	        }
	    
	    }
}
