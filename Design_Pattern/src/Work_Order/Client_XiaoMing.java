package Work_Order;

//�ͻ��˲�����
public class Client_XiaoMing {

	public static void main(String[] args) {
	//С�������ײ�һ����ѡ����ե�˺ͺ���˿��
		
		//�����ײ�1���彨���߶���
		SetMealBuilder setMeal = new Set1();
		
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
		ZhaCaiDecorator zhaCai;
		zhaCai = new ZhaCaiDecorator(setMeal);
		zhaCai.addZhaCai();
		HaiDaiSiDecorator haiDai;
		haiDai = new HaiDaiSiDecorator(setMeal);
		haiDai.addHaiDaiSi();
	}

}
