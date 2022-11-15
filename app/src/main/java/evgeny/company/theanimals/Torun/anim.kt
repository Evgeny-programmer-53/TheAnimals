package evgeny.company.theanimals.Torun

import evgeny.company.theanimals.Model.Animals
import evgeny.company.theanimals.Model.Carnivorous
import evgeny.company.theanimals.Model.Graminivorous

fun main() {
    val listOfAnimals = listOf<Animals>(
        Graminivorous("Kine", "Mooing", 20, 10),
        Graminivorous("Sheep", "Bleating", 15, 4),
        Carnivorous("Wolf", "Howls", 30, 12f),
        Carnivorous("Jaguar", "Growls", 90, 15f),

        )
    listOfAnimals.forEach {
        when (it) {
            is Carnivorous -> println("${it.name} ${it.sound} ${it.speed} ${it.meetneedet}")
            is Graminivorous -> println("${it.name} ${it.sound} ${it.speed} ${it.gresnidet}")
        }

    }
}
