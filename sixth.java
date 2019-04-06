package com.epam.gitdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 

public class sixth {
 
public static void main(String args[] )
	{
        //Scanner
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        int N = s.nextInt(); // Reading input from STDIN
        int K = s.nextInt();
        ArrayList<ArrayList<Integer> > ws = new ArrayList<ArrayList<Integer> >(K); 
        for(int i=0;i<K;i++)
        {
            ArrayList<Integer> w = new ArrayList<Integer>();
            ws.add(w);
        }
        for(int i=0;i<N;i++)
        {
            int a=s.nextInt();
            ws.get(a%K).add(a);
        }
        for(int i=K-1;i>=0;i--)
        {
            Collections.sort(ws.get(i));
            for(int j=0;j<ws.get(i).size();j++)
            {
                System.out.print(ws.get(i).get(j)+" ");    // Writing output to STDOUT
            }
        }
	
	}
}