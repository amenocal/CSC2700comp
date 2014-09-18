package prob1;
import java.util.*;

public class meaningoflife2 {

	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String n;
		boolean stop = true;
		while(stop)
		{
			n = scan.nextLine();
			if (n == "42")
				stop = false;
			System.out.println(n);
		}	
	}
}
