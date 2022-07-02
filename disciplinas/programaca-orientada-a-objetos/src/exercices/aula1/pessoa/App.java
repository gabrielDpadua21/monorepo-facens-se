package exercices.aula1.pessoa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<People> list = new ArrayList<People>();
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Criar pessoa \n 2 - Imprimir pessoa \n 0 - Sair"));

        do {
            switch (op) {
                case 1:
                    list.add(createPeople());
                    break;
                case 2:
                    printPeople(list);
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? uma opcao: \n 1 - Criar pessoa \n 2 - Imprimir pessoa \n 0 - Sair"));
        } while(op != 0);


        JOptionPane.showMessageDialog(new JFrame(), "Bye!!!", "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

    static People createPeople() {
        People p = new People();
        int opSex;

       p.setCpf(JOptionPane.showInputDialog("Digite o cpf da pessoa"));

       p.setName(JOptionPane.showInputDialog("Digite o nome da pessoa"));

       opSex = Integer.parseInt(JOptionPane.showInputDialog("Digite o sexo da pessoa ->  \n 1(M) \n 2(F)"));
       if(opSex == 1) {
           p.setSex("M");
       } else {
           p.setSex("F");
       }

       p.setAge(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa")));

       return p;
    }

    static void printPeople(List<People> peoples) {
        String name;

        name = JOptionPane.showInputDialog("Digite o nome da pessoa: ");

        List<People> people = peoples.stream()
                                .filter(p -> p.getName().equals(name)).collect(Collectors.toList());


        JOptionPane.showMessageDialog(new JFrame(), people.get(0).printPeople(), "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
