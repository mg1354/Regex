import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {

	public static void main(String[] args) {
		String myString= "aaa Kalle Os&&tar&& 08-111222 A(A12aaf ddchbwwA) Qqqqq aaaaaaa R() 08/3432421";
//		String pattern ="kalle";
//		String pattern ="111";
//		String pattern ="[A-Z][a-z]";
//		String pattern ="[A-Z][a-z][a-z][a-z][a-z]";
//		String pattern ="[A-Z][a-z]+";
//		String pattern ="[A-Z]\\(";
//		String pattern ="[A-Z]\\(([A-Za-z0-9\\s]+)?\\)";
//		String pattern ="0[0-9]{1,4}[-/]?[1-9][0-9]+";
//		String pattern ="[a]{3,5}";
		String pattern ="\\w+";
		
//*********************		
//[A-Z] 	 all big letters
//[]matchar något i "hakarna" 
//		+ - en eller flera
//\\ - mellanslag		
// ? eller inte.
//{n-m}	mellan n och m stycken	
//	. vad som helst	
		
//********************		
		finder(myString,pattern);
		
	}
	public static void finder (String myString , String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(myString);
		
		while (matcher.find()) {
			if(matcher.group().length() != 0) {
			
			System.out.println(matcher.group());
			}
			
			System.out.println("Start:" +matcher.start()+ "");
			System.out.println("Slut:" +matcher.end());
			
		}
	}

}
