fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    val updatedList = mutableList.map { it * 2 } // Correct way: assign to a new variable
    println(mutableList) // Output: [1, 2, 3, 4, 5]
    println(updatedList) // Output: [2, 4, 6, 8, 10]

    // For in-place modification, consider using a loop:
    for (i in mutableList.indices) {
        mutableList[i] *= 2
    }
    println(mutableList) // Output: [2, 4, 6, 8, 10]
    
    //Alternatively use a library like Arrow
    import arrow.core.extensions.list.map.map
    import arrow.core.extensions.list.traverse.traverse
    import arrow.core.Either

    fun <A,B> List<A>.mapInPlace(f: (A) -> B): List<B> = this.map(f)
    fun main() {
      val list = listOf(1,2,3,4,5)
      val list2 = list.mapInPlace { it *2 }
      println(list2)
    }
}