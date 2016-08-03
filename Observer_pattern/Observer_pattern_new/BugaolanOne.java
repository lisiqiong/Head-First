import java.util.Observer;
import java.util.Observable;

public class BugaolanOne implements Observer
{

	private Observable observable;

	public BugaolanOne(Observable ob)
	{
		this.observable = ob;
		this.observable.addObserver(this);
	}


	public void update(Observable ob, Object object)
	{
		if (ob instanceof WeatherData)
		{
			WeatherData wdata = (WeatherData) ob;

			float wendu = wdata.getWendu();
			float shidu = wdata.getShidu();
			float tianqi = wdata.getTianqi();

			this.testOutput(wendu, shidu, tianqi);
		}
	}


	public void testOutput(float wendu, float shidu, float tianqi)
	{
		System.out.println("BugaolanOne Current wendu is :" + wendu + "\r\n");
		System.out.println("BugaolanOne Current shidu is :" + shidu + "\r\n");
		System.out.println("BugaolanOne Current tianqi is :" + tianqi + "\r\n");
	}
}