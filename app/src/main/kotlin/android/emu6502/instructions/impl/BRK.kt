package android.emu6502.instructions.impl

import android.emu6502.CPU
import android.emu6502.instructions.BaseInstruction
import android.emu6502.instructions.Instruction

/** BRreaK */
class BRK(private val cpu: CPU) : BaseInstruction(Instruction.BRK, cpu) {
  override fun single() {
    cpu.stop()
  }
}