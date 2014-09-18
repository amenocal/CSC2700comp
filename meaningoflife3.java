package prob1;

import java.io.*;


public class meaningoflife3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new FileReader("/Users/Menocal/Google Drive/LSU/Fall 2014/CSC 2700/prob1/src/prob1/test.txt"));
		String num;
		boolean stop = true;
		while ((num = read.readLine()) != null){
			if ( num.equals("42"))
				break;
			else
				System.out.println(num);
			
		}
		
		
	}

}
