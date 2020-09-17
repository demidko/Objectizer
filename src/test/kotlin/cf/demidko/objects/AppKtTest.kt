package cf.demidko.objects

import org.junit.jupiter.api.Test
import java.io.File


class AppKtTest {

    @Test
    fun test() {
        val f = File(javaClass.getResource("/test.txt").toURI())
        println(f.readText())
    }
}