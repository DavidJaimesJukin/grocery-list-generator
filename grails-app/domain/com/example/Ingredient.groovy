package com.example

class Ingredient {

    String name
    String unitOfMeasurement
    Integer amount
    static belongsTo = [recipe: Recipe]
    static constraints = {
        name maxSize: 255
    }

    String toString(){
        name
    }
}
