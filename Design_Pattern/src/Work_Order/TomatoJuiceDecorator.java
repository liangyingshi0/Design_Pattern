package Work_Order;

//����֭������װ����
public class TomatoJuiceDecorator extends SetDecorator{

	public TomatoJuiceDecorator(SetMealBuilder set) {
		super(set);
	}
	
	public void addTomatoJuice() {
		System.out.print("����֭  ");
	}

}
