import java.io.*;
import java.math.*;
import java.util.*;

public class IteratedSums {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		int a,b, temp;
		int answer = 0;
		a = scan.nextInt();
		b = scan.nextInt();
		for(int i = a; i <= b; i++){
			
			temp = i*i;
			answer += temp;
		}
		System.out.println(answer);

	}


}