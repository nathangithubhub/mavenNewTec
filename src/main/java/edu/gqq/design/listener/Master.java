package edu.gqq.design.listener;

import static java.lang.System.out;

public class Master implements Observer {

	@Override
	public void update() {
		out.println("has a mouse..");
	}

}
