fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("${sumPi(5)}")

    println(sum)
    println(a)
    println(b)
}

var sum = 5
var a = 5//gai
var b = 5// kong
var c = 0 //duihuan
fun sumPi(x: Int): Int {
    //啤酒2元一瓶，4个盖子可以换一瓶啤酒，2个空瓶可以换一瓶啤酒。请用java语言书写10元钱可以喝多少瓶酒，剩余多少个空瓶和盖子。
    c = a/4 + b/2
    a = c + a%4
    b = c + b%2
    sum += c
    if (a < 4 && b < 2) {
        return 123
    }
    return sumPi(c)
}