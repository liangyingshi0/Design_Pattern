package Work_Order;

//客户端测试类
public class Client_XiaoDing {

	public static void main(String[] args) {
	// 小丁选了套餐二，未选择任何配菜：
		
		//生成套餐2具体建造者对象
		SetMealBuilder setMeal = new Set2();
		
		//通过指挥者，建造完整的套餐对象
		SetMealController sc = new SetMealController();
		SetMeal set;
		set = sc.construct(setMeal);
		
		System.out.println("套餐名："+set.getSetName());
		System.out.println("饮料："+set.getDrink());
		System.out.println("主食："+set.getFood());
		System.out.println("青菜："+set.getVegetable());
		
		//小丁未选择任何配菜，不引入半透明装饰模式
		//System.out.print("小菜：");
	}

}
