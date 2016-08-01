public class BugaolanTwo implements Observer, DisplayElement
{
	private Subject subject;

	public BugaolanTwo(Subject subject)
	{
		this.subject = subject;
		this.subject.regirstObserver(this);
	}


	public void display()
	{
		System.out.println("This is BugaolanTwo display method -----\r\n");
	}


	public void update(float temp, float humidity, float pressure)
	{
		System.out.println("The BugaolanTwo is update ......\r\n");
		System.out.println("\r\n");
		System.out.println("Show current wendu is :" + temp);
		System.out.println("Show current shidu is :" + humidity);
		System.out.println("Show current tianqi is :" + pressure);

	}


}