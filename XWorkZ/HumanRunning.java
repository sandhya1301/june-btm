class HumanRunning{
	public static void main(String[] args)
	{
		System.out.println("running main");
		Human.Walk();
		Human.sleep();//re-use
		Human.run();
		Human.eat();
		Human.draw();
		Human.work();
		Human.write();
		Human.code();
	}
}
