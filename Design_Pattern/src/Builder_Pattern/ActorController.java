package Builder_Pattern;

//角色控制器，充当指挥者
public class ActorController {
	//逐步构建复杂产品对象
	public Actor construct(ActorBuilder ab) {
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHairstyle();
		actor = ab.createActor();
		return actor;
	}
}
