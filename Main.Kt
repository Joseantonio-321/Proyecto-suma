fun main() {
    val scanner = Scanner(System.`in`)

    println("Por favor, ingrese el primer número:")
    val numero1 = scanner.nextInt()

    println("Por favor, ingrese el segundo número:")
    val numero2 = scanner.nextInt()

    val suma = numero1 + numero2
    println("La suma de $numero1 y $numero2 es: $suma")
}