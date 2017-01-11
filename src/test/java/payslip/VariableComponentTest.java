package payslip;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VariableComponentTest {

	VariableComponent messageUtil = new VariableComponent();

   @Test
   public void testPrintMessage() {
      double message = 3161.44;
      assertEquals(message,messageUtil.printVariable(),0.01);
   }
}