package gameWithBeans;

public class MarioGame implements Game {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Enter pipe");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Go backwards");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go forward");

	}

}
