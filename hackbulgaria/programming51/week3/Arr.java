package com.hackbulgaria.programming51.week3;
public class Arr {
	public static String toString(int[] a) {
		String string4e=new String();
		for(int i=0;i<a.length;++i){
			string4e+=a[i]+ " ";
		}
		return string4e;
	}
	
	public static void sort(int[] a){
		for(int i=0;i<a.length;++i){
			int min=a[i];
			for(int j=i;j<a.length;++j){
				if(a[j]<a[i]){
					min=a[j];
					a[j]=a[i];
					a[i]=min;
				}
			}
		}
	}
	
	public static int[] reverse(int[] a){
		int cnt=0;
		for(int i=a.length-1;i>=(a.length)/2;--i){
			int temp=a[cnt];
			a[cnt]=a[i];
			a[i]=temp;
			cnt++;
		}
		return a;
	}
	
	public static String join(int[] a, String glue) {
		String string4e=new String();
		for(int i=0;i<a.length;++i){
			string4e+=a[i]+ glue;
		}
		string4e = string4e.substring(0, string4e.length()-2);
		return string4e;
	}
	
	public static int sum(int[] a){
		int sum=0;
		for(int i=0;i<a.length;++i){
			sum+=a[i];
		}
		return sum;
	}
	
	public static int[] range(int a, int b){
		int[]arrRange=new int[b-a];
		int cnt=0;
		for(int i=a;i<b;i++){
			arrRange[cnt]=i;
			cnt++;
		}
		return arrRange;
	}
	
	public static int[] filterOdd(int[] a){
		int cnt=0;
		for(int i=0;i<a.length;++i){
			if(a[i]%2==1){
				a[cnt]=a[i];
				cnt++;
			}
		}
		int []b=new int[cnt];
		for(int i=0;i<cnt;++i){
			b[i]=a[i];
		}
		return b;
	}
	
}
