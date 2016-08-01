public class Test
{

	public static void main(String [] arg) 
	{
		WeatherData weatherData = new WeatherData();

		BugaolanOne bugaolanone = new BugaolanOne(weatherData);
		BugaolanTwo bugaolanTwo = new BugaolanTwo(weatherData);


		weatherData.setOptions(35, 22, 40);
	}
}