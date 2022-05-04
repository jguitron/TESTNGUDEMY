package TEST;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {
    @Test (groups ={"Smoke"})
    public void Demo()
    {
        System.out.println("Hello world");
    }

    @AfterSuite
    public void afSuite () {
        System.out.println("I am the no 1 from the last");
    }
    @Test
    public void SecondTest()
    {
        System.out.println("Bye");
    }
}
