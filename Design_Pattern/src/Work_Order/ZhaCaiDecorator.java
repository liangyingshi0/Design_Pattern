package Work_Order;

//榨菜，具体装饰类
public class ZhaCaiDecorator extends SetDecorator{

	public ZhaCaiDecorator(SetMealBuilder set) {
		super(set);
	}
	
	public void addZhaCai() {
		System.out.print("榨菜  ");
	}

}
