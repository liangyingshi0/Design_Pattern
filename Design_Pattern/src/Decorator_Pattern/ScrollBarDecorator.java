package Decorator_Pattern;

//������װ���࣬�䵱����װ����
public class ScrollBarDecorator extends ComponentDecorator{

	public ScrollBarDecorator(Component component) {
		super(component);
	}
	
	public void setScrollBar() {
		System.out.println("Ϊ������ӹ�������");
	}
	
	public void display() {
		this.setScrollBar();
		super.display();
	}
}
