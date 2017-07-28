package command

object CommandType {

  def getType(command: String): Command = command.toLowerCase match {
    case "dir" => new DirCommand
    case _ => throw new NoSuchMethodException("No command found.")
  }
}
