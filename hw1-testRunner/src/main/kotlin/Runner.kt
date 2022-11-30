import kotlin.reflect.full.declaredMemberFunctions

class Runner<T : Any> : TestRunner<T> {

    private lateinit var steps: T

    override fun runTest(steps: T, test: () -> Unit) {
        this.steps = steps
        runBefore()
        test()
        runAfter()
    }

    private fun runBefore(){
        steps::class.declaredMemberFunctions.filter { it.name.startsWith("before") }.forEach {
            steps::class.java.getMethod(it.name).invoke(steps)
        }
    }

    private fun runAfter(){
        steps::class.declaredMemberFunctions.filter { it.name.startsWith("after") }.forEach {
            steps::class.java.getMethod(it.name).invoke(steps)
        }
    }
}