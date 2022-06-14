class ContaBanco(
    open val numConta: Int,
    protected val tipo: String, // CC e CP
    private val dono: String,
    private var saldo: Double,
    private var status: Boolean
) {

    fun abrirConta(tipo: Boolean) {
        if (this.tipo == "Conta Corrente") {
            this.saldo += 50.0
            println("Sua conta corrente foi criada com sucesso")
        } else if (this.tipo == "Conta Poupança") {
            this.saldo += 150.0
            println("Sua conta poupança foi criada com sucesso")
        } else {
            println("Sua conta não pôde ser criada")
        }
    }

    fun depositar(valor: Double) {
        if (this.status == true){
            this.saldo += valor
            println("Depósito efetuado com sucesso")
        }else{
            println("Impossível depositar")
        }
    }

    fun sacar(valor: Double) {
        if (this.status == true && this.saldo >= valor) {
            this.saldo - valor
            println("Saque efetuado com sucesso")
        } else {
            println("Saldo insuficiente")
        }
    }

    fun fecharConta() {
        if (this.saldo == 0.0) {
            println("Conta encerrada com sucesso")
        } else if (this.saldo < 0.0) {
            println("Pague seu débito antes de encerrar a conta")
        } else {
            (this.saldo > 0.0)
            println("Saque o seu dinheiro ")
        }

        fun pagarMensal(valor: Double) {
            if (this.tipo == "Conta Corrente" && this.saldo > valor) {
                this.saldo - 12
                println("Pagamento da taxa de R$20")
            } else if (this.tipo == "Conta Poupança" && this.saldo > valor) {
                this.saldo - 20
                println("Pagamento da taxa de R$12")
            }
        }
    }

    //criar uma função get é uma maneira de mostrar um atributo privado
    fun getSaldo(): Double {
        return this.saldo
    }

    fun getDono(): String{
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
