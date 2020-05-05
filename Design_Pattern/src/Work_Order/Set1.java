package Work_Order;

//充当具体建造者
public class Set1 extends SetMealBuilder{

	@Override
	public void buildSetName() {
		setMeal.setSetName("套餐一");
	}
	
	@Override
	public void buildDrink() {
		setMeal.setDrink("可乐");
	}

	@Override
	public void buildFood() {
		setMeal.setFood("米饭");
	}

	@Override
	public void buildVegetable() {
		setMeal.setVegetable("油麦菜");
	}

}
