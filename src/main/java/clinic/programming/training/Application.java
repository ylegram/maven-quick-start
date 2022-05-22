package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
	
	public int countWords(String words){
		//Add a comment for test merge
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
	
	public void greet() {
	
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for(String greeting : greetings){
			System.out.println("Greeting: " +greeting);
		}
		
	}	

	public String testPrint(String prova){
		return prova;

	}

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		
		int count = app.countWords("I jave four words");
		System.out.println("Word count: " + count);

		System.out.println(app.testPrint("ciao"));
    }
}