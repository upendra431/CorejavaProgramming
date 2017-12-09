package com.corejava.stringPG.reverseWord;

public class WordRev1 {
	public static void main(String[] args) {
		String[] str = "java is a programing language".split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");
		}

	}
}
