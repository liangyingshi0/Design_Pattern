package Work_Order;

//�䵱ָ����
public class SetMealController {
	public SetMeal construct(SetMealBuilder set) {
		SetMeal setMeal;
		set.buildSetName();
		set.buildDrink();
		set.buildFood();
		set.buildVegetable();
		setMeal = set.createSetMeal();
		return setMeal;
	}
}
