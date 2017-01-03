package payslip;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NetComponentTest {

	NetComponent messageUtil = new NetComponent();

   @Test
   public void testPrintMessage() {
      double message = 38428.68538461538;
      assertEquals(message,messageUtil.printNetSalary(),0.01);
   }
}
