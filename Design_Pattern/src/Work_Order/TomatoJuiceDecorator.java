package Work_Order;

//番茄汁，具体装饰类
public class TomatoJuiceDecorator extends SetDecorator{

	public TomatoJuiceDecorator(SetMealBuilder set) {
		super(set);
	}
	
	public void addTomatoJuice() {
		System.out.print("番茄汁  ");
	}

}
