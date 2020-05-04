package Builder_Pattern;

//��ħ��ɫ���䵱���彨����
public class DevilBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		actor.setType("��ħ");
	}

	@Override
	public void buildSex() {
		actor.setSex("��");
	}

	@Override
	public void buildFace() {
		actor.setFace("��ª");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("����");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("��ͷ");
	}

}
