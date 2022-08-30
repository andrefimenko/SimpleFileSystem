package com_rtjvm_scala_oop.commands

import com.rtjvm.scala.filesystem.State
import com.rtjvm.scala.oop.commands.Command

class UnknownCommand extends Command {

  override def apply(state: State): State =
    state.setMessage("Command not found!")
}
