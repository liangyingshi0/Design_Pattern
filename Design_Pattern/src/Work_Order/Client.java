package Work_Order;

//�ͻ��˲�����
public class Client {

	public static void main(String[] args) {
		SetMealBuilder setMeal = new Set1();
		
		SetMealController sc = new SetMealController();
		SetMeal set;
		set = sc.construct(setMeal);
		
		System.out.println("�ײ�����"+set.getSetName());
		System.out.println("���ϣ�"+set.getDrink());
		System.out.println("��ʳ��"+set.getFood());
		System.out.println("��ˣ�"+set.getVegetable());
		
		System.out.print("С�ˣ�");
		ZhaCaiDecorator zc;
		zc = new ZhaCaiDecorator(setMeal);
		zc.addZhaCai();
	}

}
