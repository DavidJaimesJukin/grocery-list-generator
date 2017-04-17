package grocery.list.generator

import com.example.Ingredient
import com.example.Recipe

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                if (!Recipe.count()) createSampleData()
            }
            test {
                if (!Recipe.count()) createSampleData()
            }

        }
    }
    private createSampleData(){
        println("Creating sample data")
        //def pasta = new Ingredient(name: "Pasta", amount: 1, unitOfMeasurement: "box").save()
        //def tomatoSauce = new Ingredient(name:"Tomato Sauce", amount: 1, unitOfMeasurement: "bottle").save()
        //def groundBeef  = new Ingredient(name: "Ground Beef", amount: 1, unitOfMeasurement: "pounds").save()
        //def mozzarella  = new Ingredient(name: "Mozzarella Cheese", amount: 1, unitOfMeasurement: "8oz bag").save()
        def eggs        = new Ingredient(name: "Eggs", amount: 1, unitOfMeasurement: "dozen").save(failOnError: true)
        //def bacon       = new Ingredient(name: "Bacon", amount: 1, unitOfMeasurement: "8oz bag").save()
        //def milk        = new Ingredient(name:"Milk", amount: 1, unitOfMeasurement: "Gallons").save()
        //def coffee      = new Ingredient(name:"Coffee", amount: 1,unitOfMeasurement: "16 oz").save()

        def eggsAndBacon = new Recipe(name:"Eggs and bacon", ingredients: eggs)
        //eggsAndBacon.addToIngredients(bacon)
        eggsAndBacon.save(failOnError:true)

        //def coffeeWithMilk = new Recipe(name: "COFFEE WITH A SPLASH OF MILK")
        //coffeeWithMilk.addToIngredients(coffee)
        //coffeeWithMilk.addToIngredients(milk)
        //coffeeWithMilk.save(failOnError:true)

        //def lasagna = new Recipe(name: "Lasagna")
        //lasagna.addToIngredients(pasta)
        //lasagna.addToIngredients(tomatoSauce)
        //lasagna.addToIngredients(groundBeef)
        //lasagna.addToIngredients(mozzarella)
        //lasagna.save(failOnError:true)
    }
    def destroy = {
    }
}


