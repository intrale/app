import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformTest {
    @Test
    fun testPlatformName() {
        val name = getPlatform().name
        assertTrue(name.contains("Java"))
    }
}
