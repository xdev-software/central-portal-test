package software.xdev;

import software.xdev.test.Calculator;


public final class Application
{
	@SuppressWarnings({"java:S106", "PMD.SystemPrintln"})
	public static void main(final String[] args)
	{
		final Calculator calc = new Calculator();
		final double result = calc.add(1.2d, 2.3d);
		System.out.println("Result: " + result);
	}
	
	private Application()
	{
	}
}
