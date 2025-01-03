# Unexpected map() Behavior on MutableList in Kotlin

This example demonstrates a common pitfall when using the `map()` function with `MutableList` in Kotlin. Unlike some other languages, Kotlin's `map()` function doesn't modify the original list; instead, it returns a *new* list containing the transformed elements.

The `bug.kt` file shows the unexpected behavior, where the `mutableList` remains unchanged after the `map` operation. The `bugSolution.kt` file provides the correct approach using `map` with assignment to a new variable, and using `mapInPlace` if you want to update in place.