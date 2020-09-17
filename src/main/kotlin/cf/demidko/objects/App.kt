package cf.demidko.objects


import com.fasterxml.jackson.databind.ObjectMapper
import java.time.Duration
import java.time.Duration.ofDays


fun main() {
    val storage = mutableMapOf<Duration, List<Object>>()
    storage[ofDays(1)] = listOf(Object("rt"), Object("dd"))
    val mapper = ObjectMapper()

    println(mapper.writeValueAsString(storage))
}

