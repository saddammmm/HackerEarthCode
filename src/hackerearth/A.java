package hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
 class A {
	public static void main(String[] args) {
		int n;
        Scanner sc=new Scanner(System.in);
				n=sc.nextInt();

		int[] array =new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
            System.out.println(Coun(array));
        }
        public static int Coun(int []arr)
        { 
            ArrayList<Integer>A=new ArrayList<>();
            int c1=0;
            for (int i = 0; i <arr.length-1; i++) {
                if(arr[i+1]-arr[i]==1)
                {A.add(arr[i]);System.out.println(A.size());}
                else
                {
                    if(c1<A.size()+1)
                {
                    c1=A.size()+1;
                    A.clear();
                }
                }
                
            }
            
            return c1;
        }
 }