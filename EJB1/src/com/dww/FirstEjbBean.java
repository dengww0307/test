package com.dww;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class FirstEjbBean implements FirstEjb {

	@Override
	public void test1() {
		System.out.println("test1----");
		//---------------
	}

}
