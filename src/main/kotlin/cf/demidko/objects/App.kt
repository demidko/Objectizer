package cf.demidko.objects

import java.io.File


fun main(args: Array<String>) {
    val file = File({}.javaClass.getResource("/test.txt").toURI())
    println(file.readText())
    args.forEach {
        file.appendText("\n$it")
    }
    /*val storage = mutableMapOf<Duration, List<Object>>()
storage[ofDays(1)] = listOf(Object("rt"), Object("dd"))
val mapper = ObjectMapper()
println(mapper.writeValueAsString(storage))*/
}
