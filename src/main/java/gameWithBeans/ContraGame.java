package gameWithBeans;

public class ContraGame implements Game {

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
