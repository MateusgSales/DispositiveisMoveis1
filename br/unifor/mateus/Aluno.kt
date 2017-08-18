package br.unifor.mateus

import com.sun.xml.internal.fastinfoset.util.StringArray

class Aluno {

    var notaParcial1: Double
    var notaParcial2: Double
    var notaProvaFinal: Double
    var media: Double
    var mediaFinal: Double
    var frequencia: Double
    var matricula: Int

    constructor(notaParcial1: Double, notaParcial2: Double, notaProvaFinal: Double,
                frequencia: Double, matricula: Int  ) {
        this.notaParcial1 = notaParcial1
        this.notaParcial2 = notaParcial2
        this.notaProvaFinal = notaProvaFinal
        this.frequencia = frequencia
        this.media = this.calcularMedia()
        this.mediaFinal = this.calcularMediaFinal()
        this.matricula = matricula
    }

    private fun calcularMedia(): Double {
        return (this.notaParcial1 + this.notaParcial2) / 2
    }

    private fun calcularMediaFinal(): Double {
        return (this.media + this.notaProvaFinal) / 2
    }

    public fun rendimentoAcademico(): String {
        var resultado: String = "Indefinido"

        if (this.frequencia < 75.0) return "Reprovado por frequencia"
        if (this.media >= 8.0) return  "Aprovado por Média"
        if (this.mediaFinal > 5.0 ) return  "Aprovado por Média Final"
        if (this.media < 4.0 ) return  "Reprovado por Média"
        if (this.mediaFinal < 5.0 ) return  "Reprovado por Média Final"

        return resultado
    }

}