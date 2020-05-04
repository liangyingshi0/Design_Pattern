package Decorator_Pattern;

//�䵱����װ����
public class ComponentDecorator extends Component{

	private Component component;
	
	//ע����󹹼����͵Ķ���
	public ComponentDecorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void display() {
		component.display();
	}
	
}
