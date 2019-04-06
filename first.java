package com.epam.gitdemo;

import java.util.*;
class TestClass {
    public static int fun(int n)
    {
        while(n>0)
        {
            if(n%2==0)
                return 0;
            n=n/2;
        }
        return 1;
    }
    public static void main(String args[] ) throws Exception {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
         int testcases= scanner.nextInt();
         while(testcases>0)
         {
             int count=0,i,k=4;
             int rod_size= scanner.nextInt();
             for(i=3;i<=rod_size;)
             {
                if(fun(i)==1)
                    count++;
                    i+=k;
                    k*=2;
             }
             System.out.println(count);
             testcases--;
         }
    }
}