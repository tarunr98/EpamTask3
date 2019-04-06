package com.epam.gitdemo;

import java.util.*;

class TestClass3 {
    public static void main(String args[] ) throws Exception {
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        long n = s.nextLong();                
        long x = s.nextLong();
        long y = s.nextLong();
        long[] a = new long[100010];
        long[] b = new long[100010];
        int i,j;
        @SuppressWarnings("unused")
		long t,k,sum=0,sum1=y-x;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextLong();
            b[i]=s.nextLong();
        }
        for(i=0;i<n-1;i++)
        {
        	for(j=0;j<n-i-1;j++)
        	{
        		if((a[j]-b[j])>(a[j+1]-b[j+1]))
        		{
        			a[j] = a[j]^a[j+1]^(a[j+1] = a[j]);
        			b[j] = b[j]^b[j+1]^(b[j+1] = b[j]);
        		}
        	}
        }
       /* for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();*/
		for(i=0;i<n;i++)
		{
			if(a[i]-b[i]>y)
				break;
			if(a[i]+b[i]<x)
				continue;
			if(a[i]-b[i]>x)
			{
				x=a[i]-b[i];
			}
			sum+=(a[i]+b[i]-x);
			//System.out.print(sum+"  ");
			if(a[i]+b[i]>y)
			{
				 sum-=(a[i]+b[i]-y);
			//	 System.out.print(sum+"  ");
				 break;
			}
				x=a[i]+b[i];
		}
		System.out.print(sum1-sum);
    }
}
