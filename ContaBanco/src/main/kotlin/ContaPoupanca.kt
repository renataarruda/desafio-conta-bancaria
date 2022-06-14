class ContaPoupanca(
    val numConta: Int,
    protected val tipo: String,
    private val dono: String,
    private var saldo: Double,
    private var status: Boolean
) {

}