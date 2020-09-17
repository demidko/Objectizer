package cf.demidko.objects

fun String.parseNameOnly() = split(' ')[1]

fun main() {
    println("Hello, World".parseNameOnly())
}

