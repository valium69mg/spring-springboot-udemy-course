package com.introToSpringContext.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("contraGameQualifier")
public class ContraGame implements GamingConsole {
	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Duck");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Shoot");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go forward");

	}
}
