fun main() {

    testGroup {
        runTest(Step()){
            println("test")
        }
    }
    println("================")
    testGroup {
        runTest(Step1()){
            println("test1")
        }
    }
    println("================")
    testGroup {
        runTest(Step0()){
            println("test0")
        }
    }

}