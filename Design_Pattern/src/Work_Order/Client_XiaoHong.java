package Work_Order;

//�ͻ��˲�����
public class Client_XiaoHong {

	public static void main(String[] args) {
	//С�������ײͶ�����ѡ���˷���֭��ե�ˣ�
		
		//�����ײ�2���彨���߶���
		SetMealBuilder setMeal = new Set2();
		
		//ͨ��ָ���ߣ������������ײͶ���
		SetMealController sc = new SetMealController();
		SetMeal set;
		set = sc.construct(setMeal);
		
		System.out.println("�ײ�����"+set.getSetName());
		System.out.println("���ϣ�"+set.getDrink());
		System.out.println("��ʳ��"+set.getFood());
		System.out.println("��ˣ�"+set.getVegetable());
		
		//����װ��ģʽ��ʹ�ð�͸��װ��ģʽ
		System.out.print("С�ˣ�");
		TomatoJuiceDecorator fanQie;
		fanQie = new TomatoJuiceDecorator(setMeal);
		fanQie.addTomatoJuice();
		ZhaCaiDecorator zhaCai;
		zhaCai = new ZhaCaiDecorator(setMeal);
		zhaCai.addZhaCai();
	}

}
