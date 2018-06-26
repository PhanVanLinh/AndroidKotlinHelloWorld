package toong.vn.androidkotlinhelloworld.syntax

/**
 * ## Comparison
 * ### val vs var
 * - var : use for mutable property
 * - val : use for immutable property
 *
 * ## Popular problems
 *
 * ### Error: Property must be initialized or abstract
 * Happened when define variable (using val or var) as class property without provide value.
 * Fixed by
 * - Provide value (directly or in constructor)
 * - Use lateinit (if variable type is not primitive type)
 *
 * ### Error: 'lateinit' modifier is not allowed on primitive type
 * Happened when we use lateinit on a primitive type property
 * Reason: [StackOverFlow answer](https://stackoverflow.com/q/38761294/5381331)
 *
 * ### Error: 'lateinit' is not allowed on property of nullable type
 * Happened when we use lateinit on a nullable property
 *
 * ### Error: 'lateinit' is not allowed on property which initializer
 * Happened when we use lateinit on a property which already set value
 */
class DefineVariable {

  val a: Int = 1 // immediate assignment
  val b = 2 // `Int` type is inferred

  var c: String = "" // property must be initialized or abstract

  fun sum() {
    val d: Int // Type required when no initializer is provided
    d = 3; // deferred assignment
  }
}