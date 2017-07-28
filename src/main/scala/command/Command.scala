package command

import java.io.File

trait Command {

  def execute(file: File): Unit
}
