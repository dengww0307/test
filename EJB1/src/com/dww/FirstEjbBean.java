package com.dww;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class FirstEjbBean implements FirstEjb {
	final String str = "";
	@Override
	public void test1() {
		System.out.println("test代码");
		System.out.println("test1----");
//		str = "2";
	}

}
