import akka.actor._

import scala.concurrent.Await
import scala.concurrent.duration.Duration

class Terminator extends Actor {
  def receive = {
    case str: String => {
      println(
        s"""
           |**
           |-> Received: $str
           |**
         """.stripMargin.trim)
      context.system.terminate()
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem()

    system.actorOf(Props[Terminator]) ! "Youhou"

    Await.result(system.whenTerminated, Duration.Inf)
  }
}
