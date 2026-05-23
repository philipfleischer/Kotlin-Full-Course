package FunksjonellProgrammering

import junit.framework.TestCase.assertEquals

class CollectionsTest {

    val list = listOf(1, 2, 3, 4)

    @org.junit.Test
    fun testFirst() {
    // first() henter ut første element
        assertEquals(1, 1)
        assertEquals(list.first(), 1)
    }

    @org.junit.Test
    fun testLast() {
    // last() henter ut siste element
        assertEquals(4, 4)
        assertEquals(list.last(), 4)
    }

    @org.junit.Test
    fun testForEach() {
    // forEach() utfører en funksjon på alle elementer
        list.forEach {
            print("$it ")
        }
    }

    @org.junit.Test
    fun testMap() {
    // map() transformerer alle elementene med en gitt funksjon
        assertEquals(list.map { it * it }, listOf(1, 4, 9, 16))
        assertEquals(list.map { it * it + 1}, listOf(2, 5, 10, 17))
    }

    @org.junit.Test
    fun testFilter() {
    // filter() beholder elementene som oppfyller condition
        assertEquals(list.filter { it % 2 == 0}, listOf(2, 4))
    }

    @org.junit.Test
    fun testFold() {
    // fold() tar en initiell verdi, og lar oss kombinere elementene
        assertEquals(list.fold(0) { x, y -> x + y }, 10)

        // [1,2,3,4] -> 1*2*3*4

        assertEquals(list.fold(1) { x, y -> x * y}, 24)
        assertEquals(listOf(1, 2, 3, 4).fold(1) { x, y -> x * y}, 24)
        assertEquals(listOf(1, 2, 3, 4).fold(0 + 1) { x, y -> x + y}, 11)
        assertEquals(listOf<Int>().fold(6+4) { x, y -> x + y }, 10)
    }

    @org.junit.Test
    fun testSortedBy() {
    // sortedBy() sorterer basert på kriterie gitt i lambda funksjonen
        assertEquals(list.sortedBy { it }, listOf(1, 2, 3, 4))
        assertEquals(list.sortedBy { -it }, listOf(4, 3, 2, 1))
    }

    @org.junit.Test
    fun testFind() {
        // find finner første element som matcher betingelsen
        assertEquals(2, list.find { it % 2 == 0 })
        assertEquals(3, list.find { it > 2 })
        assertEquals(null, list.find { it > 10 })
    }

    @org.junit.Test
    fun testFindLast() {
        // findLast finner siste element som matcher betingelsen
        assertEquals(4, list.findLast { it % 2 == 0 })
        assertEquals(3, list.findLast { it < 4 })
        assertEquals(null, list.findLast { it > 10 })
    }

    @org.junit.Test
    fun testCount() {
        // count teller hvor mange elementer som matcher betingelsen
        assertEquals(4, list.count())
        assertEquals(2, list.count { it % 2 == 0 })
        assertEquals(3, list.count { it > 1 })
    }

    @org.junit.Test
    fun testPartition() {
        // partition deler listen i to lister:
        // første liste = de som matcher
        // andre liste = de som ikke matcher
        assertEquals(
            Pair(listOf(2, 4), listOf(1, 3)),
            list.partition { it % 2 == 0 }
        )
    }

    @org.junit.Test
    fun testZipWithNext() {
        // zipWithNext lager par av nabo-elementer
        assertEquals(
            listOf(Pair(1, 2), Pair(2, 3), Pair(3, 4)),
            list.zipWithNext()
        )

        // Kan også gjøre noe med hvert nabopar
        assertEquals(
            listOf(3, 5, 7),
            list.zipWithNext { a, b -> a + b }
        )
    }

    @org.junit.Test
    fun testZip() {
        // zip kobler sammen to lister element for element
        val letters = listOf("a", "b", "c", "d")

        assertEquals(
            listOf(Pair(1, "a"), Pair(2, "b"), Pair(3, "c"), Pair(4, "d")),
            list.zip(letters)
        )

        // Kan også bestemme selv hva hvert par skal bli
        assertEquals(
            listOf("1a", "2b", "3c", "4d"),
            list.zip(letters) { num, let -> "$num$let"}
        )
    }
}