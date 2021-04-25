package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class UnderstandingTryCatchBlock {

	@Test
	public void tryCatchFinallyNoException(){

		//If there is no exception occurred, then JVM will execute only finally block. Catch block will be skipped.
		try
		{
			System.out.println("try block");
		}
		catch (Exception e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

	@Test
	public void tryCatchBreak(){

		//Check will the break is called if exception is occured before break. So break is not called if exceptions
		// is occured before break

		for(int i=0;i<3;i++){
			try
			{
				int number=5/0;
				break;
			}
			catch (ArithmeticException e)
			{
				System.out.println("catch block");
			}
		}
	}

	@Test
	public void tryCatchFinallyExceptionOccures(){

		//If there is an exception occurred in try block, then JVM will execute catch block first and then finally block.
		try
		{
			System.out.println("try block");
			throw new NullPointerException();
		}
		catch (Exception e)
		{
			System.out.println("catch block");
		}

		finally
		{
			System.out.println("finally block");
		}

	}

	@Test
	public void tryCatchFinallyExceptionNotHandled(){

		//If the exception is not handled by any provided catch block, the JVM default exception handler handle it. In this case, finally block will be executed followed by default exception handling mechanism.
		try
		{
			System.out.println("try block");
			throw new NullPointerException();
		}
		finally
		{
			System.out.println("finally block");
		}
	}

	@Test
	public void tryMultipleCatchFinallyExceptionOccures(){

		//If there are multiple catch blocks associated with the try block, then exception is handled by the first catch block in sequence which can handle the exception type or it’s parent types.
		try
		{
			System.out.println("try block");
			throw new NullPointerException();
		}
		catch (NumberFormatException e)
		{
			System.out.println("catch block 1");
		}
		catch (NullPointerException e)
		{
			System.out.println("catch block 2");

		}
		catch (Exception e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

	@Test
	public void tryCatchFinallyExceptionOccuresInCatchBlock(){
/*		There may be cases when there is an exception while handling another exception in catch block. How it will handled?

		In case of exception in catch block, the execution is transferred to finally block (if any) associated with the respective catch block. Then the exception is propagated in method call stack to find a catch block which can handle this exception.

				If such catch block is found then exception is handled, else JVM default exception handler handles the exception and terminates the application.*/

		try
		{
			System.out.println("try block");

			throw new NullPointerException("NullPointerException occured");
		}
		catch (NullPointerException e)
		{
			System.out.println("catch block 1");

			throw new NumberFormatException("NumberFormatException occurred");
		}
		catch (Exception e)
		{
			System.out.println("catch block 2");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

	}
