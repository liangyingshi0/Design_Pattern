package Work_Order;

//ʹ�ð�͸��װ��ģʽ������䵱����װ����
public class SetDecorator extends SetMealBuilder{
	private SetMealBuilder setMealBuilder;
	
	//ע�����
	public SetDecorator(SetMealBuilder set) {
		this.setMealBuilder = set;
	}

	@Override
	public void buildSetName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildFood() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildVegetable() {
		// TODO Auto-generated method stub
		
	}

}
