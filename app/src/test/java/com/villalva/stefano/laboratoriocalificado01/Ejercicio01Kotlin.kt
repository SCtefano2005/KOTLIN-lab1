package com.villalva.stefano.laboratoriocalificado01

import org.junit.Test
import org.junit.Assert.*

class Ejercicio01Kotlin {

    // Esta función chequea si dos palabras son anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Primero, si no tienen el mismo largo, ya sabemos que no lo son
        if (palabra1.length != palabra2.length) return false

        // Convertimos ambas palabras a minúsculas
        val palabra1Ordenada = palabra1.lowercase().toCharArray().sorted()
        val palabra2Ordenada = palabra2.lowercase().toCharArray().sorted()

        // Comparamos los arrays ya ordenados
        return palabra1Ordenada == palabra2Ordenada
    }

    // Ahora hacemos algunas pruebas para ver si la función anda bien
    @Test
    fun pruebaAnagramas() {
        // "listen" y "silent" son anagramas, así que esto debería dar true
        assertTrue(sonAnagramas("listen", "silent"))

        // "hello" y "world" no lo son, así que esto debería dar false
        assertFalse(sonAnagramas("hello", "world"))

        // "anagram" y "nagaram" son anagramas, debería dar true
        assertTrue(sonAnagramas("anagram", "nagaram"))

        // "rat" y "car" no son anagramas, debería dar false
        assertFalse(sonAnagramas("rat", "car"))


    }
}
