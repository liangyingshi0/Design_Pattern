package Decorator_Pattern;

public class Client {

	public static void main(String[] args) {
		Component component,componentCD;
		component = new Window();
		componentCD = new ScrollBarDecorator(component);
		componentCD.display();
	}

}
