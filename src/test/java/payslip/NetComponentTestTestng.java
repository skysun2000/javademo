package payslip;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.*;

/**
 * Created by chetiany on 1/11/2017.
 */
public class NetComponentTestTestng {
    @org.testng.annotations.Test
    public void testPrintNetSalary() throws Exception {
        double message = 38428.68538461538;
        assertEquals(message,messageUtil.printNetSalary(),0.01);
    }

}