# NullPointerException in Scala Generics with Non-Nullable Types

This repository demonstrates a common but subtle error in Scala involving `NullPointerExceptions` when using generics with non-nullable type parameters. The `MyClass` example shows how passing `null` to a generic type parameter that is not nullable results in a runtime exception.

The solution demonstrates how to handle null values gracefully either by using nullable types or by adding explicit null checks.  Understanding this nuance helps to write more robust and error-free Scala code.