public class MallardDuck extends Duck
{

	public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior)
	{

		this.flyBehavior   = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	public void display()
	{
		System.out.println("I am real MallardDuck.....");
	}

}