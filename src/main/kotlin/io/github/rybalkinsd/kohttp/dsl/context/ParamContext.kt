package io.github.rybalkinsd.kohttp.dsl.context

@HttpDslMarker
class ParamContext {
    private val params: MutableList<Pair<String, Any>> = mutableListOf()

    infix fun String.to(v: Any) {
        params += Pair(this, v)
    }

    internal fun forEach(action: (k: String, v: Any) -> Unit) =
        params.forEach { (k, v) -> action(k, v) }
}
