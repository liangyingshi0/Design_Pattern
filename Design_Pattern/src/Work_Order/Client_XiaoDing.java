package Work_Order;

//�ͻ��˲�����
public class Client_XiaoDing {

	public static void main(String[] args) {
	// С��ѡ���ײͶ���δѡ���κ���ˣ�
		
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
		
		//С��δѡ���κ���ˣ��������͸��װ��ģʽ
		//System.out.print("С�ˣ�");
	}

}
