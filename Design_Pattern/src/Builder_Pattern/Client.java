package Builder_Pattern;

//�ͻ��˲�����
public class Client {

	public static void main(String[] args) {
		ActorBuilder ab;
		//���ɾ��彨���߶���
		ab = (ActorBuilder) XMLUtil.getBean();
		
		//ͨ��ָ���ߣ�������������
		ActorController ac = new ActorController();
		Actor actor;
		actor = ac.construct(ab);
		
		System.out.println("��ɫ���ͣ�"+actor.getType());
		System.out.println("�Ա�"+actor.getSex());
		System.out.println("���ݣ�"+actor.getFace());
		System.out.println("��װ��"+actor.getCostume());
		System.out.println("���ͣ�"+actor.getHairstyle());
	}

}
