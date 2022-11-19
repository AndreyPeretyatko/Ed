package com.example.ed
import com.example.ed.animal.Carnivorous
import com.example.ed.animal2.Herbivore



fun main() {
        val wolf = Carnivorous (carnivorousName = "волк" ,  diet = "мясо")
        wolf.age = 2
    println(" Наше животное " + wolf.carnivorousName + " Его возвраст ${wolf.age} года"  + " Он ест ${wolf.diet} "  )

        val bear = Carnivorous (carnivorousName = "медведь" , diet = "рыбу")
        bear.age = 4
    println(" Наше животное " + bear.carnivorousName + " Его возвраст ${bear.age} года"  + " Он ест ${bear.diet} "  )

        val deer = Herbivore (herbivoreName = "олень" , artiodactyls = true)
        deer.age = 6
    println(" Наше животное " + deer.herbivoreName + " Его возвраст ${deer.age} года"  + " Оно являеться парнокопытным ${deer.artiodactyls} "  )

        val rabbit = Herbivore (herbivoreName = "кролик" , artiodactyls = false)
        rabbit.age = 1
    println(" Наше животное " + rabbit.herbivoreName + " Его возвраст ${rabbit.age} года"  + " Оно являеться парнокопытным ${rabbit.artiodactyls} "  )
}





