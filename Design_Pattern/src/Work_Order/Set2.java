package Work_Order;

//充当具体建造者
public class Set2 extends SetMealBuilder{

	@Override
	public void buildSetName() {
		setMeal.setSetName("套餐二");
	}
	
	@Override
	public void buildDrink() {
		setMeal.setDrink("橙汁");
	}

	@Override
	public void buildFood() {
		setMeal.setFood("面包");
	}

	@Override
	public void buildVegetable() {
		setMeal.setVegetable("空心菜");
	}

}
