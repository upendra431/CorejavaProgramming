package com.corejava;

import java.io.File;

public class CreatingFolder 
{
public static void main(String[] args) {
	File file=new File("c://hello");
	if(!file.exists())
	{
	if(file.mkdir());
	{
		System.out.println("File Created");
	}
	
	}
}
}
