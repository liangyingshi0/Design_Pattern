package Work_Order;

//����˿������װ����
public class HaiDaiSiDecorator extends SetDecorator{

	public HaiDaiSiDecorator(SetMealBuilder set) {
		super(set);
	}

	public void addHaiDaiSi() {
		System.out.print("����˿  ");
	}
}
