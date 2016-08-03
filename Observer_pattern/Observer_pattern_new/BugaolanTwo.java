import java.util.Observer;
import java.util.Observable;

public class BugaolanTwo implements Observer
{

	private Observable observable;

	public BugaolanTwo(Observable ob)
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
		System.out.println("BugaolanTwo Current wendu is :" + wendu + "\r\n");
		System.out.println("BugaolanTwo Current shidu is :" + shidu + "\r\n");
		System.out.println("BugaolanTwo Current tianqi is :" + tianqi + "\r\n");
	}
}