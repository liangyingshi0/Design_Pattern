package Builder_Pattern;

//��Ϸ��ɫ�࣬�䵱���Ӳ�Ʒ����.
public class Actor {
	private String type;	//��ɫ����
	private String Sex;		//�Ա�
	private String face;	//����
	private String costume;	//��װ
	private String hairstyle;//����
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getCostume() {
		return costume;
	}
	public void setCostume(String costume) {
		this.costume = costume;
	}
	public String getHairstyle() {
		return hairstyle;
	}
	public void setHairstyle(String hairstyle) {
		this.hairstyle = hairstyle;
	}
	
}
