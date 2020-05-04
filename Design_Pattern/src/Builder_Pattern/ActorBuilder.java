package Builder_Pattern;

//�䵱��������
public abstract class ActorBuilder {
	protected Actor actor = new Actor();
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairstyle();
	
	//��������������һ�������Ķ���
	public Actor createActor() {
		return actor;
	}
}
