package Work_Order;

//使用半透明装饰模式，此类充当抽象装饰类
public class SetDecorator extends SetMealBuilder{
	private SetMealBuilder setMealBuilder;
	
	//注入对象
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
