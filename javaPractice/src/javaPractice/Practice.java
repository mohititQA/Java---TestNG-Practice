package javaPractice;

import java.util.HashMap;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string that you want to print");
		Scanner in = new Scanner(System.in);
		String str,rev = "";
		str = in.next();
		for(int i = (str.length()-1);i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		countofWords();
		
	}
	
	//Calculating the words in the string how much time they come
	
	public static void countofWords()
	{
		String str = "This this is is done by Saket Saket";

        String[] split = str.split(" ");

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for (int i=0; i<split.length-1; i++) {

            if (map.containsKey(split[i])) {

                int count = map.get(split[i]);

                map.put(split[i], count+1);

            }
            else {

               map.put(split[i], 1);

            }

        }
        System.out.println(map);
	}
	

}
