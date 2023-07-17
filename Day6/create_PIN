import java.util.*;
import java.io.*;

//Read only region start
class UserMainCode
{
  public int createPIN(int input1,int input2,int input3)
{
//Read only region end
// Write code here...
        int rem1=0,rem2=0,rem3=0;
        int arr[]=new int[9];
        int max=0,min=0,index=0,new_index=0;;
        int new_arr[]=new int[4];

		while(input1>0 && input2>0 && input3>0)
        {
                rem1=input1%10;
                arr[index++]=rem1;
                input1/=10;
                if(max<rem1) max=rem1;
                rem2=input2%10;
                arr[index++]=rem2;
                input2/=10;
                if(max<rem2) max=rem2;
                rem3=input3%10;
                arr[index++]=rem3;
                input3/=10;
                if(max<rem3) max=rem3;
                if(rem1<rem2 && rem1<rem3) new_arr[new_index++]=rem1;
                else if(rem2<rem3) new_arr[new_index++]=rem2;
                else new_arr[new_index++]=rem3;        
        }
        new_arr[new_index]=max;
        String str="";
        for(int i=3;i>=0;i--)
              str+=new_arr[i];
        //Arrays.sort(arr);
        return Integer.parseInt(str);
	}
}
