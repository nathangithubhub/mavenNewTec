package edu.gqq.basic;

public abstract class AbstractTest {
	int i, j;

	public AbstractTest(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

class impel extends AbstractTest {

	public impel(int i, int j) {
		super(i, j);
		// super();
		// TODO Auto-generated constructor stub
	}

}
