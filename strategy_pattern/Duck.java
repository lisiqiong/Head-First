/**
 * 
 */
public abstract class Duck
{
	
	protected FlyBehavior flyBehavior;

	
	protected QuackBehavior quackBehavior;


	public Duck(){}


	public abstract void display();


	public void prefromQuack()
	{
		this.quackBehavior.quack();
	}


	public void prefromFly()
	{
		this.flyBehavior.fly();
	}

	public void swing()
	{
		System.out.println("All Duck was swing....");
	}

 
    public void setQuackBehavior(QuackBehavior quackBehavior)
    {
    	this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior)
    {
    	this.flyBehavior = flyBehavior;
    }

}
