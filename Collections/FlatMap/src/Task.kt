// Return all products this customer has ordered
fun Customer.getOrderedProducts(): Set<Product> = orders.flatMap { it.products }.toSet()

// Return all products that were ordered by at least one customer
fun Shop.getAllOrderedProducts(): Set<Product> = customers.flatMap { it.orders }.flatMap { it.products }.toSet()
// better solution  = customers.flatMap{ it.orderedProducts }.toSet()
