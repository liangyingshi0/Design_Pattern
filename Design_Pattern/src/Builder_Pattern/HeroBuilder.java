package Builder_Pattern;

//Ӣ�۽�ɫ���䵱���彨����
public class HeroBuilder extends ActorBuilder{

	@Override
	public void buildType() {
		actor.setType("Ӣ��");
	}

	@Override
	public void buildSex() {
		actor.setSex("��");
	}

	@Override
	public void buildFace() {
		actor.setFace("Ӣ��");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("����");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("Ʈ��");
	}

}
