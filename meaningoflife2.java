
import java.io.*;
import java.util.*;

public class meaningoflife2 {

	
	public static void main(String[] args) throws IOException{
		
		Scanner read = new Scanner(System.in);
		int n;
		//boolean stop = true;
		while(true)
		{
			n = read.nextInt();
			if (n == 42)
				break;//stop = false;
			else
				System.out.println(n);
		}	
	}
}
