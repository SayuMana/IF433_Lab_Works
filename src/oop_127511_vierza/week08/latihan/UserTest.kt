package oop_127511_vierza.week08.latihan

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\nRunning unit test")
    val testUser = DatabaseMock.findUser(1)
    val initial = testUser!!.name.substring(0, 1)
    check(initial == "T") { "Test Failed! Initial is wrong." }
    println("Test Passed: Initial is T")
}