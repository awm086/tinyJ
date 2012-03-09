//Jian Jun Yuan
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;

public class PUSHSTATADDRinstr extends OneOperandInstruction {

  void execute ()
  {
    /* ???????? */
    EXPRSTACK[ESP++] = POINTERTAG + operand;
  }

  public PUSHSTATADDRinstr (int offset)
  {
    super(offset, "PUSHSTATADDR");
  }
}

