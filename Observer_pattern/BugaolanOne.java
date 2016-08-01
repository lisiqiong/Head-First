public class BugaolanOne implements Observer, DisplayElement
{
	private Subject subject;

	public BugaolanOne(Subject subject)
	{
		this.subject = subject;
		this.subject.regirstObserver(this);
	}


	public void display()
	{
		System.out.println("This is BugaolanOne display method -----\r\n");
	}


	public void update(float temp, float humidity, float pressure)
	{
		System.out.println("The BugaolanOne is update ......\r\n");
		System.out.println("\r\n");
		System.out.println("Show current wendu is :" + temp);
		System.out.println("Show current shidu is :" + humidity);
		System.out.println("Show current tianqi is :" + pressure);

	}


}