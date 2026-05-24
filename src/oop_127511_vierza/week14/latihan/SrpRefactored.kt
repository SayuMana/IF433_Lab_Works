package oop_127511_vierza.week14.latihan

class UserValidator {
    fun validate(user: User): Boolean =
        user.email.contains("@") && user.age >= 18

}

class UserRepository {
    fun save(user: User) {
        println("Saving ${user.name} to Database")
    }
}