package ans6;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id[]={1,2,3,4,5};
	
		int score[]=new int[5];
		
		for(int i=0;i<id.length;i++)
		{
			
			System.out.println("enter marks for "+i);
			int score1=sc.nextInt();
			if(score1<=100){
			score[i]=score1;
			}
			else{
				score[i]=0;
				//System.out.println("Not in criteria");
				try {
					throw new ScoreException("Not in criteria");
				} catch (ScoreException e) {
					
				}
			}
		}
		
		System.out.println("display data");
		for(int i=0;i<id.length;i++)
		{
			
			System.out.println("score of "+i+" is"+score[i]);
			
		}

	}

}
