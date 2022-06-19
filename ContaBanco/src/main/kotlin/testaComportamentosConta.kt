fun testaComportamentosConta() {

    val contaJubileu = ContaCorrente(
        numConta = 30,
        dono = "Jubileu",
        saldo = 0.0,
        status = true
    )

    val contaCreuza = ContaPoupanca(
        numConta = 25,
        dono = "Creuza",
        saldo = 0.0,
        status = true
    )

    println("Abrindo a Conta Corrente do Jubileu: ")
    println("Número: ${contaJubileu.numConta}")
    println("Tipo: ${contaJubileu.getTipo()}")
    println("Dono: ${contaJubileu.getDono()}")
    println("Seu saldo é de R$: ${contaJubileu.getSaldo()}")
    println("Status: ${contaJubileu.getStatus()}")

    contaJubileu.abrirConta()
    contaJubileu.depositar(100.0)
    println("Seu saldo é de R$: ${contaJubileu.getSaldo()}")
    contaJubileu.pagarMensal()
    println("Seu saldo é de R$: ${contaJubileu.getSaldo()}")
    contaJubileu.sacar(20.0)
    println("Seu saldo é de R$: ${contaJubileu.getSaldo()}")
    contaJubileu.fecharConta()
    contaJubileu.transferir(118.0, contaCreuza)
    println("Seu saldo é de R$: ${contaJubileu.getSaldo()}")
    contaJubileu.fecharConta()

    println("Abrindo a Conta Poupança da Creuza: ")
    println("Número: ${contaCreuza.numConta}")
    println("Tipo: ${contaCreuza.getTipo()}")
    println("Nome: ${contaCreuza.getDono()}")
    println("Saldo: ${contaCreuza.getSaldo()}")
    println("Status: ${contaCreuza.getStatus()}")

    contaCreuza.abrirConta()
    contaCreuza.depositar(500.0)
    println("Seu saldo é de R$: ${contaCreuza.getSaldo()}")
    contaCreuza.pagarMensal()
    println("Seu saldo é de R$: ${contaCreuza.getSaldo()}")
    contaCreuza.sacar(40.0)
    println("Seu saldo é de R$: ${contaCreuza.getSaldo()}")
    contaCreuza.fecharConta()
    println("Seu saldo é de R$: ${contaCreuza.getSaldo()}")

}