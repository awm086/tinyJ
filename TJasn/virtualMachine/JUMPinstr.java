//Ali
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class JUMPinstr extends OneOperandInstruction {

  void execute ()
  {
    /* ???????? */
    PC = operand;
  }

  public JUMPinstr (int address)
  {
    super(address, "JUMP");
  }
}

