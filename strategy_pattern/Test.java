public class Test
{
	public static void main(String arrs[] )
	{

		// Duck duck = new MallardDuck(new FlyNoWay(), new QuackSqueak());
		// duck.prefromQuack();

		// System.out.println("\n\n");

		// duck.prefromFly();

		Test t = new Test();

		t.test2();

	}


	public void test2()
	{

		ModelDuck duck = new ModelDuck();

		duck.prefromQuack();
		System.out.println("\n\n");
		duck.prefromFly();

		duck.setFlyBehavior(new FlyRocketPowered());
		duck.setQuackBehavior(new QuackMute());


		duck.prefromQuack();
		System.out.println("\n\n");
		duck.prefromFly();

	}
}