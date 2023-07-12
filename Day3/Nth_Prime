import java.util.Scanner;
        class HelloWorld{
            public static void main(String args[]) {
                Scanner in = new Scanner(System.in);
                int N = in.nextInt();
                int res = prime(N);
                System.out.println("VALUE: " + res);
            }

            public static int prime(int input1)
            {
                       
        // Write code here...
         int flag=0;
         int num=0;
         int k=2;
         while(num<=input1)
         {
             flag=0;
             for(int i=2;i<k;i++)
             {
                 if(k%i==0) flag=1;
             }
             if(flag==0) 
             {
                 num++;
                 if(num==input1) return k;
             }
             k++;
         }
               return 0;
    }
        }
