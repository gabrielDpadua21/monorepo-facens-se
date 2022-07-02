import Funcionario from '../src/Funcionario';

describe('Testando Funcionario', () => {

    test('Deve criar um funcionario maior que 18 anos e menor que 55', () => {
        const funcionario = new Funcionario('Fulano', 25);
        expect(funcionario.validateWorkTime()).toBe('Periodo integral');
    })

    test('Deve criar um funcionario entre 16 e 18 anos', () =>{
        const funcionario = new Funcionario('Fulano', 18);
        expect(funcionario.validateWorkTime()).toBe('Meio periodo');
    })

    test('Não deve criar um funcionario menor de 18', () =>{
        const funcionario = new Funcionario('Fulano', 13);
        expect(() => funcionario.validateWorkTime()).toThrow(new Error('Invalid age'));
    })

    test('Não deve criar um funcionario maior que 55 anos', () =>{
        const funcionario = new Funcionario('Fulano', 60);
        expect(() => funcionario.validateWorkTime()).toThrow(new Error('Invalid age'));
    })

})