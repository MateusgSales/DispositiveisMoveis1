package br.unifor.mateus

class Aquario {

    val litrosAguaMinimo: Int =  20
    val comprimentoMinimo: Int = 60

    var quantidadePeixes: Int
    var altura: Int
    var largura: Int
    var comprimento: Int
    var volume: Int

    constructor(quantidadePeixes: Int, comprimento: Int, largura: Int, altura: Int) {
        this.quantidadePeixes = quantidadePeixes
        this.comprimento = comprimento
        this.largura = largura
        this.altura = altura
        this.volume = this.calcularVolume()
    }

    public fun calcularVolume(): Int{
        return (( this.comprimento * this.largura ) * this.altura) / 1000
    }

    private fun checarVolume(): Boolean = this.volume >= (this.litrosAguaMinimo * this.quantidadePeixes)

    private fun checarComprimento(): Boolean = (this.comprimento >= (this.comprimentoMinimo * this.quantidadePeixes))

    public fun checarAquario(): String {
        if (!this.checarVolume() || !this.checarComprimento()) return "Aquario inadequado!"
        return "Aquario adequado!"
    }

}