class Step {

    fun beforeFirst(){
       "beforeFirst".log()
    }

    fun afterFirst(){
        println("afterFirst")
    }

    fun beforeSecond(){
        println("beforeSecond")
    }

    fun runTest(){
        println("runTest")
    }

    fun afterSecond(){
        println("afterSecond")
    }

}

class Step1 {

    fun afterFirst(){
        println("afterFirst")
    }

    fun beforeFirst(){
        println("beforeFirst")
    }

    fun runTest(){
        println("runTest")
    }

    fun afterSecond(){
        println("afterSecond")
    }

    fun beforeSecond(){
        println("beforeSecond")
    }
}
class Step0 {

    fun runTest(){
        println("runTest")
    }

}

// функция расширения для String с именем .log приименяется см выше
fun String.log() {
    println("-> $this running...")
}