import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`);
    var N = input.nextInt();
    var i: Int;
    var a: Int;
    for (i in 1..N) {
        a = input.nextInt();
        if (a > 0 && a % 2 == 0) {
            System.out.println("EVEN POSITIVE");
        } else if (a < 0 && a % 2 == 0) {
            System.out.println("EVEN NEGATIVE");
        } else if (a > 0 && a % 2 != 0) {
            System.out.println("ODD POSITIVE");
        } else if (a < 0 && a % 2 != 0) {
            System.out.println("ODD NEGATIVE");
        } else {
            System.out.println("NULL");
        }
    }
}

