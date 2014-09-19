import java.io.*;

public class meaningoflife3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File inFile = null;
		
		if (0 < args.length) {
			inFile = new File(args[0]);	
			}
		try {
			String num;
			
		BufferedReader read = new BufferedReader(new FileReader(inFile));
		while ((num = read.readLine()) != null ){
			if ( num.equals("42"))
				break;
			else
				System.out.println(num);
			}
		}
		catch (IOException e){
			e.printStackTrace();
			}	
		}
		
		
	}
