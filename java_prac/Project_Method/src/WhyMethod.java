import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a","*"));
		fw.close();
		
		printTwoTimesA("a");
	}

	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out +delimiter +"\n";
		out = out +text +"\n";
		out = out +text +"\n";
		return out;
	}
	
	public static void printTwoTimesA(String text) {
		System.out.println("-");
		System.out.println(text);
		System.out.println(text);

	}public static void writeTwoTimesA(String text, String delemiter) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delemiter+"\n");
		fw.write(text+"\n");
		fw.write(text+"\n");
		fw.close();

	}
}
