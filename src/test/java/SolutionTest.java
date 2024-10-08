import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        String s = "][[][[][[][][[]]]]";
        int expected = 1;
        int  actual = new Solution().minSwaps(s);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        String s = "]]][[[";
        int expected = 2;
        int  actual = new Solution().minSwaps(s);
        Assert.assertEquals(expected, actual);
    }
}
