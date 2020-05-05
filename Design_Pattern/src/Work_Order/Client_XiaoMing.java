package Work_Order;

//客户端测试类
public class Client_XiaoMing {

	public static void main(String[] args) {
	//小明买了套餐一，并选配了榨菜和海带丝：
		
		//生成套餐1具体建造者对象
		SetMealBuilder setMeal = new Set1();
		
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
		ZhaCaiDecorator zhaCai;
		zhaCai = new ZhaCaiDecorator(setMeal);
		zhaCai.addZhaCai();
		HaiDaiSiDecorator haiDai;
		haiDai = new HaiDaiSiDecorator(setMeal);
		haiDai.addHaiDaiSi();
	}

}
