fun <T : Any> testGroup(func: Runner<T>.() -> Unit): Runner<T> {
    return Runner<T>().apply(func)
}