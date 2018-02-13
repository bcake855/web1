
public class Regex {

	public static void main(String[] args) {
		
		String path = "somethingPrefix://USern8me:paswor4jk4j4j@restshit";
		
		String[]  parts = path.split("\\://|\\:|\\@");

		for (String string : parts) {
			System.out.println(string);
		}
	}

}
