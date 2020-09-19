import java.io.IOException;

public class Adaptor {

	static int p(int x) {
		return (x + x + x);
	}

	public static void main(String[] args) throws IOException {
		if(p(12) != 3)
            System.out.println("Same!");
        else
            System.out.println("Not the Same");

		Messager obj = new Messager();
		obj.DisplayMessage(p(4));
		obj.ReadFile();
	}

}
