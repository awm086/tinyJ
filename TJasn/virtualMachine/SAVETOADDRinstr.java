//Jian Jun Yuan
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
import TJasn.virtualMachine.VirtualMachineHaltException;

public class SAVETOADDRinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
     /* ???????? */
    TJ.data[EXPRSTACK[--ESP-1]-POINTERTAG] = EXPRSTACK[ESP--];
  }

  public SAVETOADDRinstr ()
  {
    super("SAVETOADDR");
  }
}

