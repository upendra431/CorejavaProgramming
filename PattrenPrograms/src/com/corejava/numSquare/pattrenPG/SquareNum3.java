package com.corejava.numSquare.pattrenPG;

public class SquareNum3 {
	public static void main(String[] args) {
		int n = 3;
		int c=9;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(c--);
			}
			System.out.println();

		}
	}

}
