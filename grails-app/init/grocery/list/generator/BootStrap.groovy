package grocery.list.generator

import com.example.Ingredient
import com.example.Recipe
import com.example.User

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
       /* def pasta            = new Ingredient(name: "Pasta", amount: 1, unitOfMeasurement: "box").save()
        def tomatoSauce        = new Ingredient(name:"Tomato Sauce", amount: 1, unitOfMeasurement: "bottle").save()
        def groundBeef         = new Ingredient(name: "Ground Beef", amount: 1, unitOfMeasurement: "pounds").save()
        def mozzarella         = new Ingredient(name: "Mozzarella Cheese", amount: 6, unitOfMeasurement: "cups").save()
        def eggs               = new Ingredient(name: "Eggs", amount: 1, unitOfMeasurement: "dozen").save(failOnError: true)
        def bacon              = new Ingredient(name: "Bacon", amount: 4, unitOfMeasurement: "strips").save()
        def milk               = new Ingredient(name:"Milk", amount: 0.25, unitOfMeasurement: "cups").save()
        def coffeegrounds      = new Ingredient(name:"Coffee", amount: 1,unitOfMeasurement: "16 oz").save()

        def eggsAndBacon = new Recipe(name:"Eggs and bacon", ingredients: eggs)
        eggsAndBacon.addToIngredients(bacon)
        eggsAndBacon.save(failOnError:true)

        def coffeeWithMilk = new Recipe(name: "COFFEE WITH A SPLASH OF MILK")
        coffeeWithMilk.addToIngredients(coffee)
        coffeeWithMilk.addToIngredients(milk)
        coffeeWithMilk.save(failOnError:true)

        def lasagna = new Recipe(name: "Lasagna")
        lasagna.addToIngredients(pasta)
        lasagna.addToIngredients(tomatoSauce)
        lasagna.addToIngredients(groundBeef)
        lasagna.addToIngredients(mozzarella)
        lasagna.save(failOnError:true)

        def bob = new User(loginId: 'bob_b', password: 'secret')
        bob.addToRecipes(lasagna)
        bob.addToRecipes(coffeeWithMilk)
        bob.addToRecipes(eggsAndBacon)
        bob.save(failOnError:true)

        def sue = new User(loginId: 'SueSweet', password: 'candy13')
        sue.save(failOnError:true)

        def greg = new User(loginId: 'CoffeeLover3', password: 'CoffeeCoffeeCoffee')
        greg.addToRecipes(coffeeWithMilk)
        greg.save(failOnError:true)*/
    }
    def destroy = {
    }
}


