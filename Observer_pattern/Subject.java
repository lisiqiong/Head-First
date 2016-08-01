public interface Subject
{
	public void notifyObserver();

	public void regirstObserver(Observer observer);

	public void removeObserver(Observer observer);
}