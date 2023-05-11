// Тогда уж так:
fun <T : Any> testGroup(func: Runner<T>.() -> Unit): Runner<T> = Runner<T>().apply(func)

//fun <T : Any> testGroup(func: Runner<T>.() -> Unit): Runner<T> {
//    return Runner<T>().apply(func)
//}