import java.io.*;
import  java.util.*;   
// Read only region start
class UserMainCode
{
public int uniquedigits(int input1, int input2){
// Read only region end
// Write code here...
       
        int count=0;
         int rem=0;
         int index=0;
         int N=input1;
         while(input1>0)
    {
        rem=input1%10;
        input1/=10;
        count++;   
    }
   int arr[]=new int[count];
      while(N>0)
    {
        rem=N%10;
        N/=10;
        arr[index]=rem;
        index++;   
    }
    Arrays.sort(arr);
    int new_count=1; 
    int flag=0;
    int temp=0;
    for(int i=0;i<count-1;i++)
    {
        flag=0;
        for(int j=i+1;j<count;j++)
        {
            if(arr[i]==arr[j])
                 flag=1;    
        }
        System.out.println("FLAG:"+flag);
        if(flag==0) 
           new_count++;
    return new_count;
    	}
}
