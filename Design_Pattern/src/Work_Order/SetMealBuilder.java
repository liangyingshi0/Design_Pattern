package Work_Order;

//充当抽象建造者
public abstract class SetMealBuilder {
	protected SetMeal setMeal = new SetMeal();
	public abstract void buildSetName();
	public abstract void buildDrink();
	public abstract void buildFood();
	public abstract void buildVegetable();
	
	//工厂方法，返回一个完整的对象
	public SetMeal createSetMeal() {
		return setMeal;
	}
}
