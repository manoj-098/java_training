import java.util.*;
public class Student_grade_calculator {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("--------------Welcome to grade calculator----------------------\n");
		
		System.out.println("Enter student reg.no: ");
		int std_num=in.nextInt();
		System.out.println("Enter total no.of subjects : ");
		int N=in.nextInt();
		System.out.println("Enter the marks: ");
		double marks[]=new double[N];
		double sum=0,per=0;
		char grade='A';
		boolean flag=true;
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter marks obtained in subject "+(i+1));
			marks[i]=in.nextInt();
			sum+=marks[i];
			if(marks[i]<50) flag=false;
		}
		String Grade=grade_calc(sum,N,flag);
		if(flag)
	    	per=(sum/(N*100))*100;
		System.out.println("\n                   RESULTS                              ");
		System.out.println("--------------------------------------------------------");
		System.out.println("Student Reg.No       : "+std_num);
		System.out.println("Total Marks          : "+sum);
		System.out.println("Grade obtained       : "+Grade);
		System.out.println("Percentage obtained  : "+per+"%");
		System.out.println();
		for(int i=0;i<N;i++)
			System.out.println("Subject "+(i+1)+": "+marks[i]);
		System.out.println("--------------------------------------------------------");
	}
	
	public static String grade_calc(double sum,int N,boolean flag)
	{
		if(!flag) return "FAIL";
		double tot=sum/N;
		if(tot>=91) return "O";
		else if(tot>=81) return "A+";
		else if(tot>=71) return "A";
		else if(tot>=61) return "B+";
		else return "B";
	}

}
