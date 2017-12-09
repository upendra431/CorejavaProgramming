package com.corejava.pattrenPG;

public class SquareNum2 
{
	public static void main(String[] args) {
		int n = 3;
		int c=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(c++);
			}
			System.out.println();

		}
	}
}
