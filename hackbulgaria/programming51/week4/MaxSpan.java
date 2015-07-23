package com.hackbulgaria.programming51.week4;
import java.util.Scanner;

public class MaxSpan {

  public static int maxSpan(int[] numbers) {
	  int max=1;
	  for(int i=0;i<numbers.length;++i){
		  int tempMax=max;
		  for(int j=i+1;j<numbers.length;++j){
			  if(numbers[i]==numbers[j])
				  {
				  if(j-i+1>tempMax)max=j-i+1;
				  }
		  }
	  }
    return max;
  }

  public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] numbers = new int[n];

    for(int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }

    System.out.println(maxSpan(numbers));
  }

}