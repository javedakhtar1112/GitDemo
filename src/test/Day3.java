//there are three types of testng framework
//1.Weblogin
//2.MobileLogin
//3.APILogin

package test;
import org.testng.annotations.Test;
public class Day3
{
	@Test
	public void WebLogin()
	{
		System.out.println("Weblogin");
	}
	@Test
	public void MobileLogin()
	{
		System.out.println("MobileLogin");
	}
	@Test
	public void APILogin()
	{
		System.out.println("APILogin");
	}
}
