package com.dgdavidgreene.gratitude_domain.model

sealed class Preamble(val name: String) {
    object Thankful: Preamble("I am thankful for")
    object Blessed: Preamble("I am blessed with")
    object Fortunate: Preamble("I am fortunate that")
    object Grateful: Preamble("I am grateful for")

    companion object {
        fun fromString(name: String): Preamble {
            return when(name) {
                "I am thankful for" -> Thankful
                "I am blessed with" -> Blessed
                "I am fortunate that" -> Fortunate
                "I am grateful for" -> Grateful
                else -> Thankful
            }
        }
    }
}
