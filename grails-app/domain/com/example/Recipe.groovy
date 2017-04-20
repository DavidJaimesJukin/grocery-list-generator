package com.example

class Recipe {
    String name
    static hasMany = [ingredients: Ingredient]
    Boolean leftovers
    Integer servings
    Integer frequencyWeek

    static constraints = {
        name maxSize: 255
        ingredients nullable: true
        leftovers nullable: true
        servings nullable: true
        frequencyWeek nullable: true
    }

    String toString(){
        name
    }
}
