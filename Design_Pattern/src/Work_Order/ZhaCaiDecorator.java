package Work_Order;

//ե�ˣ�����װ����
public class ZhaCaiDecorator extends SetDecorator{

	public ZhaCaiDecorator(SetMealBuilder set) {
		super(set);
	}
	
	public void addZhaCai() {
		System.out.print("ե��  ");
	}

}
