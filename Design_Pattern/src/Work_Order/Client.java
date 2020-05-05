package Work_Order;

//客户端测试类
public class Client {

	public static void main(String[] args) {
		SetMealBuilder setMeal = new Set1();
		
		SetMealController sc = new SetMealController();
		SetMeal set;
		set = sc.construct(setMeal);
		
		System.out.println("套餐名："+set.getSetName());
		System.out.println("饮料："+set.getDrink());
		System.out.println("主食："+set.getFood());
		System.out.println("青菜："+set.getVegetable());
		
		System.out.print("小菜：");
		ZhaCaiDecorator zc;
		zc = new ZhaCaiDecorator(setMeal);
		zc.addZhaCai();
	}

}
