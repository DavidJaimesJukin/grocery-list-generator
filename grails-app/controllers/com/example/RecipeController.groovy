package com.example

class RecipeController {
    static scaffold = Recipe

    def search(){
        params.max = Math.min(params.max ? params.int('max'): 5, 100)

        def recipeList = Recipe.createCriteria().list(params){
            if(params.query){
                ilike("name", "%${params.query}%")
            }
        }
        println(recipeList)
        [recipeList: recipeList]
    }
}
