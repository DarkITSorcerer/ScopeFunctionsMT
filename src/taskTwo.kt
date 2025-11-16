import kotlin.apply

/** 2.	Создать класс City, в конструкторе передается название города
 * и population(население). В главной функции создать его экземпляр,
 * в конструктор передать название, через функцию apply объекту назначить население
 * в любом количестве. Всю информацию об объекте, созданного City вывести в консоль.
 */
fun main() {
    val chinaTown = City()
    chinaTown.getName("HongKong")
    chinaTown.getPopulation(7500000)
    chinaTown.run { println("Население города $name - $population человек") }
}

data class City(var name: String? = null, var population: Int? = null) {
    fun getName(_name: String) = apply { name = _name }
    fun getPopulation(_population: Int) = apply { population = _population }
}