package simple;
import java.io.*;

public class BufferedReaderExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/**
		 * BufferedReader class will read data from keyboard and files as well.
		 * 1) InputStreamReader will read byte data from keyboard and convey them into charset and stores into buffer.
		 * 2) FileReader can read data from file and store data in buffer.
		 * 3) BufferedReader can take the data from buffer.
		 */
		
		/**
		 * BufferedReader only reads characters and strings not integers and floats.
		 * 1) read() will read single character.
		 * 2) readLine() will read multiple characters.
		 */
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		int a = Integer.parseInt(br.readLine());
		float b = Float.parseFloat(br.readLine());
		String name = br.readLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
		
		FileReader fr = new FileReader("C:\\Users\\kdarisi\\Desktop\\disc\\testFile.txt");
		BufferedReader br1 = new BufferedReader(fr);
		StringBuffer sb = new StringBuffer();
		String str;
		while((str = br1.readLine())!=null)
		{
			sb.append(str);
			sb.append("\n");
		}
		fr.close();
		System.out.println(sb.toString());
	}

}
