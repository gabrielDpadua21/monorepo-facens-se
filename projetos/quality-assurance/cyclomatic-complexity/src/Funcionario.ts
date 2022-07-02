export default class Funcionario {

    private nome: string;
    private idade: number;

    constructor(nome: string, idade: number) {
        this.nome = nome;
        this.idade = idade;
    }

    validateWorkTime() { 
        if(this.idade < 16 || this.idade > 55) //#1
            throw new Error('Invalid age'); // #2
        if(this.idade > 15 && this.idade < 19) // #3
            return 'Meio periodo'; // 4
        return 'Periodo integral'; // 5
    } // 6

}