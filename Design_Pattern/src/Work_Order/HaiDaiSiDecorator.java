package Work_Order;

//海带丝，具体装饰类
public class HaiDaiSiDecorator extends SetDecorator{

	public HaiDaiSiDecorator(SetMealBuilder set) {
		super(set);
	}

	public void addHaiDaiSi() {
		System.out.print("海带丝  ");
	}
}
