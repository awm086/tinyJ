//Ali
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
import TJasn.virtualMachine.VirtualMachineHaltException;

public class LOADFROMADDRinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
       /* ???????? */
    EXPRSTACK[--ESP] = TJ.data[EXPRSTACK[ESP++] - POINTERTAG];
  }

  public LOADFROMADDRinstr ()
  {
    super("LOADFROMADDR");
  }
}

