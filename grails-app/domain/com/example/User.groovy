package com.example

class User {

    Date dateCreated
    Date lastUpdated
    String firstName
    String lastName
    String loginId
    String password
    String confirm
    String passwordHashed

    static transients = ['password', 'confirm']

    static hasMany = [recipes: Recipe]

    static constraints = {
        firstName blank: false
        lastName blank: false
        loginId blank: false, size: 5..15, matches: /[\S]+/, unique: true
        password blank: false, size: 5..15, matches: /[\S]+/, validator: { val, obj ->
            if(obj.password != obj.confirm)
                return 'user.password.dontmatch'
        }
        recipes nullable: true
    }
}
