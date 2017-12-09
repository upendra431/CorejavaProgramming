package com.corejava;

public class MissingElement 
{
public static void main(String[] args) {
	int arr[]= {1,3,4,5,6,7,8,9};
	int n=arr.length+1;
	int sum=0;
	for (int i = 0; i < arr.length; i++) {
		sum=sum+arr[i];
		
	}
	int total=(n*(n+1))/2;
	System.out.println(total-sum);
}
}
