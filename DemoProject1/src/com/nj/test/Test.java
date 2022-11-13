package com.nj.test;

import java.util.Date;

import com.nj.beans.Utility;

public class Test {

	public static void main(String[] args) {
		
		Date date = Utility.getSysDate();
		System.out.println(date);
	}
}
