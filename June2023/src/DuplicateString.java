
public class DuplicateString {

	public static void main(String[] args) {
		
		
		String s= "welcome";
		char string[]=s.toCharArray();
		System.out.println("duplicates are:::");
		for(int i=0; i<string.length; i++) {
			
			for (int j=i+1; j<string.length; j++) {
				if(string[i]==string[j]) {
					System.out.println( string[i]);
					
				}
				
			}
		}
		
	}

}