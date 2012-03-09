//Jian Jun Yuan
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.virtualMachine.VirtualMachineHaltException;
import TJasn.TJ;

public class ADDinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
      /* Modify */
      EXPRSTACK[--ESP-1] += EXPRSTACK[ESP];
  }

  public ADDinstr ()
  {
    super("ADD");
  }
}

