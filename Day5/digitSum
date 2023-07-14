import java.io.*;
import  java.util.*;
 //Read only region start
class UserMainCode
{
 public int digitSum(int input1)
 {      
     //Read only region end 
		// Write code here...
		int input=input1;
        int count=0;
        int flag=0;
        if(input1<-9)  flag=1;
        while(input>9 || input<-9)
        {   
            count=0;
            String str=String.valueOf(input);
         //   System.out.println("STR: "+str);
         //  System.out.println("LEN: "+str.length());
          //  System.out.println("INPUT: "+input);
            int[] arr=new int[str.length()];
            for(int i=0;i<str.length();i++)
            {
                
                if(input<0 && i==0)
                     continue;

                arr[i]=str.charAt(i)-'0';
                System.out.print(arr[i]+"--");
                count+=arr[i];
            }
            input=count;
           // System.out.println("COUNT: "+count);
        }
        if(flag==1) return -input;
        return input;
	}
}
