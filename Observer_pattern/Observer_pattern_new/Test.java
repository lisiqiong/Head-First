public class Test
{

	public static void main(String [] a)
	{
		//Observable
		WeatherData wdata = new WeatherData();


		//register Observer
		BugaolanOne b1 = new BugaolanOne(wdata);
		BugaolanTwo b2 = new BugaolanTwo(wdata);


		//when Observable changed , pull observer
		wdata.setOptions(111, 222, 333);

	}
}