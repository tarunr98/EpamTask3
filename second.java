package com.epam.gitdemo;

import java.util.*;

class TestClass2 {
    public static void main(String args[] ) throws Exception {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        long j,n,c,k=0;
        long t=sc.nextLong();
        while(t>0)
        {
            int[] a = new int[40];
            int i,l=0;
            sc.nextLine();
            String s=sc.nextLine();
            c=0;
            n=sc.nextLong();
            for(i=0;i<40;i++)
            {
                if(s.charAt(i)=='1')
                {
                    a[l++]=i+1;
                }
            }
            for(j=1;c!=n;j++)
            {
                for(i=0;i<l;i++)
                {
                    if(j%a[i]==0)
                    {
                        k=j;   
                        c++;
                        break;
                    }
                }
            }
            System.out.println(k);
         t--;   
        }
    }
}