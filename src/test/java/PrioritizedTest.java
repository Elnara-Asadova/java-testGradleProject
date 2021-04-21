import org.testng.annotations.Test;

public class PrioritizedTest {
    @Test(priority = 3)
    public void firstTestPriority3() {
        System.out.println("firstTestPriority3");
    }

    @Test(priority = 2)
    public void secondTestPriority2() {
        System.out.println("secondTestPriority2");
    }

    @Test(priority = 1)
    public void thirdTestPriority1() {
        System.out.println("thirdTestPriority1");
    }
}
