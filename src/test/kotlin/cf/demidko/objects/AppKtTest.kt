package cf.demidko.objects

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class AppKtTest {

    @Test
    fun parseNameOnly() {
        val data = "Даниил Демидко С"
        assertThat(data.parseNameOnly(), equalTo("Даниил"))
    }
}