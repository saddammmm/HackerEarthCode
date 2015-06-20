/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.util.ArrayList;

/**
 *
 * @author shussain
 */

class MaxofthreeArray {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findCommonOfThreeArrays();
	}
 
	public static void findCommonOfThreeArrays() {
		int [] ar1 = {1, 5, 10, 20, 40, 80};
		int [] ar2 = {6, 7, 20, 80, 100};
		int [] ar3 = {3, 4, 15, 20, 30, 70, 80, 120};
 
//		int [] ar1 = {1, 5 };
//		int [] ar2 = {1, 7 };
//		int [] ar3 = {1, 4 };
 
		ArrayList<Integer> result = new ArrayList<Integer>();
		int x=0;
		int i=0,j=0,k=0; 
		while(i<ar1.length && j<ar2.length && k< ar3.length){
			if(ar1[i]==ar2[j]&& ar2[j] ==ar3[k]){
				result.add(ar1[i]);
				i++;j++;k++;
			}else{
			int max = findMax(ar1[i],ar2[j],ar3[k]);
			while(i<ar1.length &&  ar1[i]<max) i++;
			while(j<ar2.length &&  ar2[j]<max) j++;
			while(k<ar3.length &&  ar3[k]<max) k++;
			}
		}
		System.out.println(result);
	}
 
	public static int findMax(int a,int b,int c){
		return findMax(findMax(a,b),c);
	}
 
	public static int findMax(int a,int b){
		return a>=b?a:b;
	}
}