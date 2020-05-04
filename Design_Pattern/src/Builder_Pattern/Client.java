package Builder_Pattern;

//客户端测试类
public class Client {

	public static void main(String[] args) {
		ActorBuilder ab;
		//生成具体建造者对象
		ab = (ActorBuilder) XMLUtil.getBean();
		
		//通过指挥者，建造完整对象
		ActorController ac = new ActorController();
		Actor actor;
		actor = ac.construct(ab);
		
		System.out.println("角色类型："+actor.getType());
		System.out.println("性别："+actor.getSex());
		System.out.println("面容："+actor.getFace());
		System.out.println("服装："+actor.getCostume());
		System.out.println("发型："+actor.getHairstyle());
	}

}
