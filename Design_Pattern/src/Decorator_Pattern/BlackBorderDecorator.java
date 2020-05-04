package Decorator_Pattern;

//��ɫ�߿�װ���࣬�䵱����װ����
public class BlackBorderDecorator extends ComponentDecorator{

	public BlackBorderDecorator(Component component) {
		super(component);
	}
	
	public void setBlackBorder() {
		System.out.println("Ϊ������Ӻ�ɫ�߿�");
	}
	
	public void display() {
		this.setBlackBorder();
		super.display();
	}

}
