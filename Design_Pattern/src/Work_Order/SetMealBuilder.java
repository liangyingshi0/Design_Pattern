package Work_Order;

//�䵱��������
public abstract class SetMealBuilder {
	protected SetMeal setMeal = new SetMeal();
	public abstract void buildSetName();
	public abstract void buildDrink();
	public abstract void buildFood();
	public abstract void buildVegetable();
	
	//��������������һ�������Ķ���
	public SetMeal createSetMeal() {
		return setMeal;
	}
}
