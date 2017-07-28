import java.io.File

import com.typesafe.config.{Config, ConfigFactory}
import com.typesafe.scalalogging.LazyLogging
import command.CommandType
import profile.User

import scala.io.StdIn

object Main extends LazyLogging {

  val config: Config = ConfigFactory.parseFile(new File("config/application.conf")).resolve()

  val user: User = User(config.getString("user.rootFolder"))

  def main(args: Array[String]): Unit = {
    val command = StdIn.readLine()
    logger.info(s"$command: ${user.rootFolder}")
    CommandType.getType(command).execute(new File(user.rootFolder))
  }
}
