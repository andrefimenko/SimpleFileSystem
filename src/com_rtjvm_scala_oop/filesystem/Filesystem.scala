package com.rtjvm.scala.filesystem

import com.rtjvm.scala.oop.commands.Command
import com_rtjvm_scala_oop.files.Directory

import java.util.Scanner

object Filesystem extends App {

  val root = Directory.ROOT
  var state = State(root, root)
  val scanner = new Scanner(System.in)

  while (true) {
    state.show
    val input = scanner.nextLine()
    state = Command.from(input).apply(state)
  }
}
