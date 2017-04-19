package com.example

class User {

    String loginId
    String password

    static hasMany = [recipes: Recipe]

    static constraints = {
        loginId size: 3..20, unique: true, nullable: false
        password size: 6..20, nullable: false, validator: { passwd, user ->
            passwd != user.loginId
        }
        recipes nullable: true
    }
}
