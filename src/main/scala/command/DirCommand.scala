package command

import java.io.File

class DirCommand extends Command {

  override def execute(file: File): Unit = {
    file.list().foreach(s => print(s"$s; "))
  }
}
