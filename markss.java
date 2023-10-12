package marks;

import java.util.Scanner;

public class markss{

    public static void main(String[] args) {
    	int mark[][]=new int[4][3];
		int rollNo[]=new int[4];
		String names[]=new String[4];
		String result[]=new String[4];
		String grade[]=new String[4];
		int total[]=new int[4];
		float average[]=new float[4];
		
		int x,y;
		for(x=0;x<4;x++) 
		{
			
			System.out.println("Enter the Student Roll Number :");
			Scanner in = new Scanner(System.in);
			rollNo[x]=in.nextInt();
			
			System.out.println("Enter the Student Name :");
			names[x]=in.next();
			
			{System.out.println("Enter the Three Marks :");
			for(y=0;y<3;y++)
			{
			mark[x][y]=in.nextInt();
			}
			
			total[x]=mark[x][0]+mark[x][1]+mark[x][2];
			System.out.println("The Total is :"+total[x]);
			average[x]=total[x]/3;
		}
			
				
			if(average[x]>50) {
				result[x]="P";
			} else {
				result[x]="F";
			}
			
			if(average[x]>69) {
				grade[x]="A";
			}else if(average[x]>49) {
				grade[x]="B";
			}else if(average[x]<50) {
				grade[x]="C";
			}
			
	}
						
System.out.println("*****************************************************************************************************************************************************");
System.out.println("                                                  STUDENT MARKLIST                                                            ");
System.out.println("*****************************************************************************************************************************************************");
System.out.println("ROLL\t\tNAME\t\tMARK1\t\tMARK2\t\tMARK3\t\tTOTAL\t\tRESULT\t\tAverage\t\tGRADE\t\t");
System.out.println(""+rollNo[0]+"\t\t"+names[0]+"\t\t  "+mark[0][0]+"\t\t"+mark[0][1]+"\t\t"+mark[0][2]+"\t\t"+total[0]+"\t\t"+result[0]+"\t\t"+average[0]+"\t\t"+grade[0]); 
System.out.println(""+rollNo[1]+"\t\t"+names[1]+"\t\t  "+mark[1][0]+"\t\t"+mark[1][1]+"\t\t"+mark[1][2]+"\t\t"+total[1]+"\t\t"+result[1]+"\t\t"+average[1]+"\t\t"+grade[1]);
System.out.println(""+rollNo[2]+"\t\t"+names[2]+"\t\t  "+mark[2][0]+"\t\t"+mark[2][1]+"\t\t"+mark[2][2]+"\t\t"+total[2]+"\t\t"+result[2]+"\t\t"+average[2]+"\t\t"+grade[2]);
System.out.println(""+rollNo[3]+"\t\t"+names[3]+"\t\t  "+mark[3][0]+"\t\t"+mark[3][1]+"\t\t"+mark[3][2]+"\t\t"+total[3]+"\t\t"+result[3]+"\t\t"+average[3]+"\t\t"+grade[3]); 
}
}