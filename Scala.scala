import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var N = input.nextInt()
    for (i <- 1 to N) {
        var a = input.nextInt()
        if (a > 0 && a % 2 == 0) {
            println("EVEN POSITIVE")
        } else if (a < 0 && a % 2 == 0) {
            println("EVEN NEGATIVE")
        } else if (a > 0 && a % 2 != 0) {
            println("ODD POSITIVE")
        } else if (a < 0 && a % 2 != 0) {
            println("ODD NEGATIVE")
        } else {
            println("NULL")
        }
    }
}
}
 
