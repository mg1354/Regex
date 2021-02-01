    import java.io.File;  // Import the File class
	import java.io.FileNotFoundException;  // Import this class to handle errors
	import java.util.Scanner; // Import the Scanner class to read text files

	public class Reader1 {
	  public static void main(String[] args) {
	    try {
	      File myObj = new File("D:\\JAVA\\RegularExpression\\src\\text.txt");
	      Scanner myReader = new Scanner(myObj);
	      int i = 0 ;
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	         i +=1;
	        for (int k =1 ; k<=1000 ; k++) {
				
	         String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				  for (int j=0; j<52;j++) {
				  char y =letters.charAt(j);	
				  String z="+";
				   z =y+z;
	        System.out.println("Line "+ i+": "+data);
	      }
	      myReader.close();
	        }}
	    } 
	        
	    catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }}
	

