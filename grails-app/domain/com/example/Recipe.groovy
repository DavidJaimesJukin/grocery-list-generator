package com.example

class Recipe {
    String name

    static hasMany = [ingredients: Ingredient]

    static constraints = {
        name maxSize: 255
    }

    String toString(){
        name
    }
}
