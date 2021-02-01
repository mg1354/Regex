import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader  {
	
	static String x ="";
	

	public static void main(String[] args) {
		
		
		
		try {
			
			File file =new File("D:\\JAVA\\RegularExpression\\src\\text.txt");
			
			if (file.exists()) {
				
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				String line;
				
				while( (line= br.readLine()) !=null){
					
					for (int i =1 ; i<=1000 ; i++) {
					
					String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
					  for (int j=0; j<52;j++) {
					  char y =letters.charAt(j);	
					  String z="+";
					   z =y+z;
//					  String pattern =z;
//					  finder(line,pattern);
//					  System.out.println(" in Line " + i + "  match group is  "+ x +".");
//					  System.out.println(); 
					  }
					}
				}
				
				br.close();
			}
			
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}

	}
//***********************
	public static void finder (String line , String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(line);
		
		while (matcher.find()) {
			if(matcher.group().length() != 0) {
			 x = matcher.group();
//			System.out.println(matcher.group());
			}
			
//			System.out.println("Start:" +matcher.start()+ "" + "Slut:" +matcher.end());
//			System.out.println("Slut:" +matcher.end());
			
		}
	
	}

}
