package br.unifor.mateus

fun showMatriz(matriz: Array<Array<String>>) {
    for ( i in matriz.indices) {
        for ( j in matriz[i].indices ){
            if ( (j - matriz[i].size) == -1 ) {
                println(matriz[i][j])
                continue
            }
            print(matriz[i][j].toString() + "\t\t")
        }
    }
}

fun main(args: Array<String>) {

    println("-----------[ Questão 4 ]--------------")
    val aquario1 = Aquario(2, 120, 40, 50)
    val aquario2 = Aquario(3, 120, 40, 50)

    println("Arquario #1 - " + aquario1.checarAquario())
    println("Arquario #2 - " + aquario2.checarAquario())
    println("--------------------------------------")

    // Alunos
    val aluno1 = Aluno(9.2, 8.3, 0.0, 87.0, 1600)
    val aluno2 = Aluno(9.2, 8.3, 0.0, 74.0, 1601)
    val aluno3 = Aluno(5.2, 5.3, 6.0, 87.0, 1602)
    val aluno4 = Aluno(2.2, 2.3, 0.0, 87.0, 1603)
    val aluno5 = Aluno(6.2, 2.3, 3.0, 87.0, 1604)
    val aluno6 = Aluno(3.2, 6.3, 3.0, 87.0, 1605)
    val aluno7 = Aluno(7.2, 5.3, 3.0, 87.0, 1606)
    val aluno8 = Aluno(9.2, 1.3, 3.0, 87.0, 1607)
    val aluno9 = Aluno(3.2, 8.3, 3.0, 87.0, 1608)
    val aluno10 = Aluno(10.0, 6.3, 3.0, 87.0, 1609)
    val list_alunos = arrayOf(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9, aluno10)

    // Matriz 10x4 - Notas do aluno
    val alunos = Array(10, { i -> arrayOf(
            list_alunos[i].matricula.toInt().toString(),
            list_alunos[i].notaParcial1.toString(),
            list_alunos[i].notaParcial2.toString(),
            list_alunos[i].notaProvaFinal.toString()
    ) })

    // Matriz 10x2 - Redimento academico
    val alunosRendimentoAcademico = Array(10, { i ->  arrayOf(list_alunos[i].matricula.toInt().toString(),
            list_alunos[i].rendimentoAcademico())})

    /*
    * Questão 5
    *
    */
    println("-----------[ Questão 5 ]--------------")
    println("Aluno #1 - " + aluno1.rendimentoAcademico())
    println("Aluno #2 - " + aluno2.rendimentoAcademico())
    println("Aluno #3 - " + aluno3.rendimentoAcademico())
    println("Aluno #4 - " + aluno4.rendimentoAcademico())
    println("Aluno #5 - " + aluno5.rendimentoAcademico())
    println("--------------------------------------")
    /*
    * Questão 6
    *
    *  Pesquisei mas nao consegui encontrar a formula para calcular as diagonais de uma
    *  matriz nao quadratica.
     */
    println("-----------[ Questão 6 ]--------------")
    println("Aluno\tNota 1\tNota 2\t Nota 3")
    showMatriz(alunos)
    println("--------------------------------------")
    println("Aluno\t\tRendimento academico")
    showMatriz(alunosRendimentoAcademico)

}