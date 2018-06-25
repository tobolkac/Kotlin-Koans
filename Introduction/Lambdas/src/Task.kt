fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0}
// or fun containsEven(collection: Collection<Int>): Boolean = collection.any { x -> x % 2 == 0}