package models

abstract class Personnage(val end: Int, val force: Int, val pv: Int) {

    // Définition d'un comportement abstrait
    abstract fun frappe(): String
}