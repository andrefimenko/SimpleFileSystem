package com.rtjvm.scala.oop.commands

import com.rtjvm.scala.filesystem.State
import com_rtjvm_scala_oop.commands.UnknownCommand

trait Command {

  def apply(state: State): State
}

object Command {

  def from(input: String): Command =
    new UnknownCommand
}