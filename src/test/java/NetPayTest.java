/*
// this is the testing class
// DO NOT MODIFY THIS CLASS AND ITS METHODS
*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class NetPayTest {
    // version 2 testing
    @Test public void testNetPay() {
        int numberOfHours = 25;
        assertThat("Net pay is not calculated correctly. You may want to check two things (1) deduction calculation, (2) rounding", NetPay.netPay(numberOfHours), is(RightSolution.netPay(numberOfHours)));
    }

    @Test public void testNetPay2() {
        int numberOfHours = 38;
        assertThat("Net pay is not calculated correctly. You may want to check two things (1) deduction calculation, (2) rounding", NetPay.netPay(numberOfHours), is(RightSolution.netPay(numberOfHours)));
    }

    @Test public void testNetPay3() {
        int numberOfHours = 7;
        assertThat("Net pay is not calculated correctly. You may want to check two things (1) deduction calculation, (2) rounding", NetPay.netPay(numberOfHours), is(RightSolution.netPay(numberOfHours)));
    }
}
