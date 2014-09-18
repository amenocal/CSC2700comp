package prob1;
import java.util.*;


public class MeaningofLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] list;
		int size = 1000000;
		list = new int[size];
		int count =0;
		System.out.println("Enter input:");
		while(true)
		{
			for (int i = 0; i <= size; i++)
			{
				list[i] = scan.nextInt();
				count++;
				if (list[i] == 42)
				{
					list[i] = scan.nextInt();
					for (int j = 0; j < count-1; j++)
					{
						System.out.println(list[j]);
					}
					break;
				}
			}
			
		}

						
	}
}