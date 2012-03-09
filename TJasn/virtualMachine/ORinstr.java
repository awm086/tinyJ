//Ali
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class ORinstr extends ZeroOperandInstruction {

  void execute ()
  {
    /* Modify*/
   EXPRSTACK[--ESP-1] += EXPRSTACK[ESP];
  }

  public ORinstr ()
  {
    super("OR");
  }
}

