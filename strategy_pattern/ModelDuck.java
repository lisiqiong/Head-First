public class ModelDuck extends Duck
{

	public void display()
	{
		System.out.println("I am real ModelDuck.....");
	}

	public ModelDuck(){

		System.out.println("Zui kai shi ni de fei xingshi:\n");
		this.flyBehavior = new FlyWithWings();
		
		System.out.println("Zui kai shi ni de quack shi:\n");
		this.quackBehavior = new QuackSqueak();

	}

}