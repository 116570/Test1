import java.io.FileReader;
import java.io.IOException;

public class Messager {
	public void DisplayMessage(int text) {
		System.out.print("Check 2" + text + " now!");
	}

	public void ReadFile() throws IOException
	{
		FileReader fpReader = new FileReader("sample.txt");
		char [] a = new char[50];
		fpReader.read();
		for (char c : a) {
			System.out.print(c);			
		}
	}
}
