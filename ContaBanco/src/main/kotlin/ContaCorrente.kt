class ContaCorrente(
    numConta: Int,
    dono: String,
    saldo: Double,
    status: Boolean
) : ContaBanco(
    numConta = numConta,
    tipo = TIPO,
    dono = dono,
    saldo = saldo,
    status = status
) {

    fun abrirConta(){
        super.abrirConta(SALDO_INICIAL)
    }

    fun pagarMensal(){
        super.pagarMensal(TAXA_MENSALIDADE)
    }
    companion object {
        const val TAXA_MENSALIDADE = 12.0
        const val TIPO = "Conta Corrente"
        const val SALDO_INICIAL = 50.0
    }

}