abstract class ContaBanco(
    open val numConta: Int,
    protected val tipo: String,
    private val dono: String,
    protected var saldo: Double,
    private var status: Boolean
) {

    fun abrirConta(SALDO_INICIAL: Double) {
        this.saldo = SALDO_INICIAL
        println("Seu saldo inicial é de R$ ${SALDO_INICIAL}.")
    }

    fun pagarMensal(TAXA_MENSALIDADE: Double) {
        if (this.saldo >= TAXA_MENSALIDADE) {
            diminuiSaldo(TAXA_MENSALIDADE)
            println("Pagamento da taxa de mensalidade de R$ ${TAXA_MENSALIDADE}.")
        }
    }

    fun depositar(valor: Double) {
        if (this.status == true) {
            this.saldo += valor
            println("Depósito de R$ ${valor} efetuado com sucesso.")
        } else {
            println("Impossível depositar.")
        }
    }

    fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
            println("Saque de R$ ${valor} efetuado com sucesso.")
        } else {
            println("Saldo insuficiente.")
        }
    }

    fun transferir(valor: Double, destino: ContaBanco) {
        if (this.saldo >= valor) {
            diminuiSaldo(valor)
            destino.saldo += valor
            println("Transferência de R$ ${valor} efetuada com sucesso.")
        } else {
            println("Saldo insuficiente.")
        }
    }

        fun fecharConta() {
            if (this.saldo == 0.0) {
                println("Conta encerrada com sucesso.")
            } else if (this.saldo < 0.0) {
                println("Pague seu débito antes de encerrar a conta.")
            } else {
                (this.saldo > 0.0)
                println("Saque o seu dinheiro antes de encerrar a conta.")
            }
        }

        @JvmName("getSaldo1")
        fun getSaldo(): Double {
            return this.saldo
        }

        @JvmName("setSaldo1")
        fun setSaldo(saldo: Double) {
            this.saldo = saldo
        }

        fun diminuiSaldo(valor: Double) {
            this.saldo -= valor
        }

        fun acrescentaSaldo(valor: Double) {
            this.saldo += valor
        }

        fun getDono(): String {
            return this.dono
        }

        fun getStatus(): Boolean {
            return this.status
        }

        @JvmName("getTipo1")
        fun getTipo(): String {
            return this.tipo
        }

    }
