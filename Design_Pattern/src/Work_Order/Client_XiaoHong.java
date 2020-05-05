package Work_Order;

//客户端测试类
public class Client_XiaoHong {

	public static void main(String[] args) {
	//小红买了套餐二，并选配了番茄汁和榨菜：
		
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
		
		//引入装饰模式，使用半透明装饰模式
		System.out.print("小菜：");
		TomatoJuiceDecorator fanQie;
		fanQie = new TomatoJuiceDecorator(setMeal);
		fanQie.addTomatoJuice();
		ZhaCaiDecorator zhaCai;
		zhaCai = new ZhaCaiDecorator(setMeal);
		zhaCai.addZhaCai();
	}

}
