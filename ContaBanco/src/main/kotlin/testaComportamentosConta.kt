fun testaComportamentosConta() {

    val contaJubileu = ContaBanco(
        numConta = 30,
        tipo = "Conta Corrente",
        dono = "Jubileu",
        saldo = 0.0,
        status = false
    )

    println("Abrindo a Conta Corrente do Jubileu: ")
    println(contaJubileu.numConta)
    println(contaJubileu.getTipo())
    println(contaJubileu.getDono())
    println(contaJubileu.getSaldo())
    println(contaJubileu.getStatus())

    val contaCreuza = ContaBanco(
        numConta = 25,
        tipo = "Conta Poupança",
        dono = "Creuza",
        saldo = 0.0,
        status = false
    )

    println("Abrindo a Conta Poupança da Creuza: ")
    println("Número: ${contaCreuza.numConta}")
    println("Tipo: ${contaCreuza.getTipo()}")
    println("Nome: ${contaCreuza.getDono()}")
    println(contaCreuza.getSaldo())
    println(contaCreuza.getStatus())

}