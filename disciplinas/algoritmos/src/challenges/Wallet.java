package challenges;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Wallet {

    static void validateSuccessOperation(boolean operationResult) {
        if(operationResult) {
            System.out.println("Operaçao realizada com sucesso");
        } else {
            System.out.println("ERRO AO REALIZAR OPERAÇAO");
        }
    }

    static boolean validateCpf(String cpf) {

        return true;
    }

    static void validateUser(String cpf, String password) {
        if(validationAdminsUsers(cpf, password)) {
            administratorMenu();
        } else if(validationUsers(cpf, password)) {
            userMenu(cpf);
        } else {
            System.out.println("USUARIO INVALIDO");
        }
    }

    static boolean validationAdminsUsers(String cpf, String password) {
        String path = new File(".").getAbsolutePath();

        File users = new File(path + "/src/challenges/users/admins.txt");

        try {
            Scanner myObject = new Scanner(users);

            while (myObject.hasNextLine()) {
                String data = myObject.nextLine();
                String[] userData = data.split(" ");
                if(userData.length >= 2 && userData[0].equals(cpf) && userData[1].equals(password)) {
                    return true;
                }
            }

            myObject. close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler arquivo de usuarios admins");
        }

        return false;
    }

    static boolean validationUsers(String cpf, String password) {
        try {
            String path = new File(".").getAbsolutePath();
            File users = new File(path + "/src/challenges/users/users.txt");
            List<String> userFind = Files.lines(users.toPath())
                                        .filter(line -> line.contains(cpf))
                                        .collect(Collectors.toList());

            for (String line: userFind) {
                String[] arrayData = line.split(" ");

                if(cpf.equals(arrayData[0]) && password.equals(arrayData[1])) {
                    return true;
                }
            }

            return false;

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo de usuarios usuario");
            return false;
        }
    }

    static void administratorMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione uma opçao: ");
        System.out.println("(1) - Listar usuarios");
        System.out.println("(2) - Cadastre novo usuario");
        System.out.println("(3) - Atualizar dados de um usuario");
        System.out.println("(4) - Remover usuario");
        System.out.println("(0) - Sair");
        int op = sc.nextInt();
        boolean result;

        switch (op) {
            case 1:
                result = listUsers();
                validateSuccessOperation(result);
                administratorMenu();
                break;
            case 2:
                result = createUser();
                validateSuccessOperation(result);
                administratorMenu();
                break;
            case 3:
                result = updateUser();
                validateSuccessOperation(result);
                administratorMenu();
                break;
            case 4:
                result = deleteUser();
                validateSuccessOperation(result);
                administratorMenu();
                break;
            case 0:
                System.out.println("Obrigado volte sempre!!!");
                break;
            default:
                System.out.println("OPÇAO INVALIDA");
                administratorMenu();
                break;
        }
    }

    static void userMenu(String cpf) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione uma opçao: ");
        System.out.println("(1) - Saldo");
        System.out.println("(2) - Deposito");
        System.out.println("(3) - Saque");
        System.out.println("(4) - Transferencia");
        System.out.println("(5) - Extrato");
        System.out.println("(0) - Sair");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                operationBalance(cpf);
                userMenu(cpf);
                break;
            case 2:
                operationCredit(cpf);
                userMenu(cpf);
                break;
            case 3:
                operationDebit(cpf);
                userMenu(cpf);
                break;
            case 4:
                operationTransfer(cpf);
                userMenu(cpf);
                break;
            case 5:
                operationHistory(cpf);
                userMenu(cpf);
                break;
            case 0:
                System.out.println("Obrigado volte sempre!!!");
                break;
            default:
                System.out.println("OPERAÇAO INVALIDA");
                userMenu(cpf);
                break;
        }
    }

    // OPERAÇOES DE USUARIOS COMUNS

    static boolean operationBalance(String cpf) {
        System.out.println("OPERAÇAO DE SALDO");
        System.out.println("\n----------------------");
        try {
            String path = new File(".").getAbsolutePath();
            File users = new File(path + "/src/challenges/users/users.txt");
            List<String> userFind = Files.lines(users.toPath())
                    .filter(line -> line.contains(cpf))
                    .collect(Collectors.toList());

            String[] userData = userFind.get(0).split(" ");

            System.out.println("USUARIO: " + cpf);
            System.out.println("SALDO: " + userData[2]);
            System.out.println("----------------------\n");

            return true;
        } catch (IOException e) {
            System.out.println("Erro a ler arquivo de usuarios");
            System.out.println("----------------------\n");
            return false;
        }
    }

    static boolean operationDebit(String cpf) {
        System.out.println("OPERAÇAO DE DEBITO");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que deseja debitar: ");
        double value = sc.nextDouble();

        System.out.println("\n----------------------");
        try {
            String path = new File(".").getAbsolutePath();
            File users = new File(path + "/src/challenges/users/users.txt");
            List<String> userFind = Files.lines(users.toPath())
                    .filter(line -> line.contains(cpf))
                    .collect(Collectors.toList());

            String[] userData = userFind.get(0).split(" ");
            double saldo = Double.parseDouble(userData[2]);

            if(value > saldo) {
                System.out.println("SALDO INSUFICIENTE PARA FINALIZAR A TRANSAÇAO");
                System.out.println("----------------------\n");
                return false;
            }

            List<String> userDelete = Files.lines(users.toPath())
                                           .filter(line -> !line.contains(cpf))
                                           .collect(Collectors.toList());

            Files.write(users.toPath(), userDelete, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

            String newSaldo = String.valueOf(saldo - value);

            String line = userData[0] + " " + userData[1] + " " + newSaldo;

            Path filePath  = Paths.get(path + "/src/challenges/users/users.txt");
            Files.write(filePath, line.getBytes(), StandardOpenOption.APPEND);
            System.out.println("----------------------\n");
            generateHistory(cpf, "DEBITO", String.valueOf(value), newSaldo, "");
            return true;
        } catch (IOException e) {
            System.out.println("Erro a ler arquivo de usuarios");
            System.out.println("----------------------\n");
            return false;
        }
    }

    static boolean operationCredit(String cpf) {
        System.out.println("OPERAÇAO DE CREDITO");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que deseja creditar: ");
        double value = sc.nextDouble();

        System.out.println("\n----------------------");
        try {
            String path = new File(".").getAbsolutePath();
            File users = new File(path + "/src/challenges/users/users.txt");
            List<String> userFind = Files.lines(users.toPath())
                    .filter(line -> line.contains(cpf))
                    .collect(Collectors.toList());

            String[] userData = userFind.get(0).split(" ");
            double saldo = Double.parseDouble(userData[2]);

            List<String> userDelete = Files.lines(users.toPath())
                    .filter(line -> !line.contains(cpf))
                    .collect(Collectors.toList());

            Files.write(users.toPath(), userDelete, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

            String newSaldo = String.valueOf(saldo + value);

            String line = userData[0] + " " + userData[1] + " " + newSaldo;

            Path filePath  = Paths.get(path + "/src/challenges/users/users.txt");
            Files.write(filePath, line.getBytes(), StandardOpenOption.APPEND);
            System.out.println("----------------------\n");
            generateHistory(cpf, "CREDITO", String.valueOf(value), newSaldo, "");
            return true;
        } catch (IOException e) {
            System.out.println("Erro a ler arquivo de usuarios");
            System.out.println("----------------------\n");
            return false;
        }
    }

    static boolean operationTransfer(String cpf) {
        System.out.println("OPERAÇAO DE DEBITO");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que deseja debitar: ");
        double value = sc.nextDouble();
        System.out.println("Digite o numero da conta para transferencia: ");
        String number = sc.next();

        System.out.println("\n----------------------");
        try {
            String path = new File(".").getAbsolutePath();
            File users = new File(path + "/src/challenges/users/users.txt");
            List<String> userFind = Files.lines(users.toPath())
                    .filter(line -> line.contains(cpf))
                    .collect(Collectors.toList());

            String[] userData = userFind.get(0).split(" ");
            double saldo = Double.parseDouble(userData[2]);

            if(value > saldo) {
                System.out.println("SALDO INSUFICIENTE PARA FINALIZAR A TRANSAÇAO");
                System.out.println("----------------------\n");
                return false;
            }

            List<String> userDelete = Files.lines(users.toPath())
                    .filter(line -> !line.contains(cpf))
                    .collect(Collectors.toList());

            Files.write(users.toPath(), userDelete, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

            String newSaldo = String.valueOf(saldo - value);

            String line = userData[0] + " " + userData[1] + " " + newSaldo;

            Path filePath  = Paths.get(path + "/src/challenges/users/users.txt");
            Files.write(filePath, line.getBytes(), StandardOpenOption.APPEND);
            System.out.println("----------------------\n");
            generateHistory(cpf, "TRANSFERENCIA", String.valueOf(value), newSaldo, number);
            return true;
        } catch (IOException e) {
            System.out.println("Erro a ler arquivo de usuarios");
            System.out.println("----------------------\n");
            return false;
        }
    }

    static boolean operationHistory(String cpf) {
        System.out.println("\n\n-----------------------------------------------------------");
        System.out.println("EXTRATO");
        try {
            String path = new File(".").getAbsolutePath();
            File log = new File(path + "/src/challenges/logs/" + cpf + ".txt");

            List<String> lines = Files.lines(log.toPath())
                                .collect(Collectors.toList());

            for (String line : lines) {
                System.out.println(line);
            }

            System.out.println("-----------------------------------------------------------\n\n");

            return true;

        } catch (IOException e) {
            System.out.println("ERRO AO LER EXTRATO DO USUARIO");
            System.out.println("-----------------------------------------------------------\n\n");
            return false;
        }
    }

    // operaçoes axiliares ...
    static void generateHistory(String cpf, String operation, String value, String saldo, String number) {
        try {
            String path = new File(".").getAbsolutePath();
            File log = new File(path + "/src/challenges/logs/" + cpf + ".txt");

            if(!log.exists()) {
                log.createNewFile();
            }

            String line;

            if(number.isEmpty()) {
                line = "\nOPERACAO: " + operation + " | VALOR: " + value + " | SALDO: " + saldo;
            } else {
                line = "\nOPERACAO: " + operation + " | PARA: " + number + " | VALOR: " + value + " | SALDO: " + saldo;
            }

            Path pathFile = Paths.get(path + "/src/challenges/logs/" + cpf + ".txt");
            Files.write(pathFile, line.getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println("Erro to create history");
        }
    }

    // OPERAÇOES DE USUARIOS ADMINISTRADORES
    static boolean listUsers() {
        System.out.println("LISTA DE USUARIOS");
        String path = new File(".").getAbsolutePath();
        File users = new File(path + "/src/challenges/users/users.txt");

        try {
            Scanner myObject = new Scanner(users);

            if(!myObject.hasNextLine()) {
                System.out.println("Nenhum usuario cadastrado");
                return true;
            }

            System.out.println("\n-----------------------------------------------------");
            while (myObject.hasNextLine()) {
                String data = myObject.nextLine();
                String[] userData = data.split(" ");

                if(userData.length >= 2) {
                    System.out.println("CPF: " + userData[0] + " | SENHA: " + userData[1] + " | SALDO: " + userData[2]);
                }
            }

            System.out.println("-----------------------------------------------------\n");

            myObject. close();
            return true;

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler arquivo de usuarios admins");
            System.out.println("-----------------------------------------------------\n");
            return false;
        }
    }

    static boolean createUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("CADASTRAR USUARIO");
        System.out.println("Digite o cpf do usuario:");
        String cpf = sc.next();
        System.out.println("Digite a senha do usuario:");
        String password = sc.next();

        String line = "\n" + cpf + " " + password + " 0.0" ;

        try {
            String pathAbsolute = new File(".").getAbsolutePath();
            Path path = Paths.get(pathAbsolute + "/src/challenges/users/users.txt");
            Files.write(path, line.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo de usuarios admins");
            return false;
        }
    }

    static boolean updateUser() {
        System.out.println("ATUALIZAR USUARIO");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o cpf do usuario");
        String cpf = sc.next();

        System.out.println("Escolha a opçao de atualizaçao");
        System.out.println("(1) - Atualizar CPF");
        System.out.println("(2) - Atualizar Senha");
        System.out.println("(3) - Atualizar CPF E Senha");
        int op = sc.nextInt();

        String newCpf = "";
        String newPassword = "";
        ArrayList<String> userData = new ArrayList<>();

        switch (op) {
            case 1:
                System.out.println("Digite o novo cpf do usuario");
                newCpf = sc.next();
                break;
            case 2:
                System.out.println("Digite a nova senha");
                newPassword = sc.next();
                break;
            case 3:
                System.out.println("Digite o novo cpf");
                newCpf = sc.next();
                System.out.println("Digite a nova senha");
                newPassword = sc.next();
                break;
            default:
                System.out.println("Opçao invalida, Reiniciando operaçao...");
                updateUser();
                break;
        }

        try {
            String path = new File(".").getAbsolutePath();
            File users = new File(path + "/src/challenges/users/users.txt");

            List<String> objFind = Files.lines(users.toPath())
                                    .filter(line -> line.contains(cpf))
                                    .collect(Collectors.toList());

            List<String> objDelete = Files.lines(users.toPath())
                                          .filter(line -> !line.contains(cpf))
                                          .collect(Collectors.toList());

            for (String line: objFind) {
                if(line.contains(cpf)) {
                    String[] arrayData = line.split(" ");
                    userData.add(arrayData[0]);
                    userData.add(arrayData[1]);
                    userData.add(arrayData[2]);
                    break;
                }
            }

            String dataCpf      = !newCpf.isEmpty() ? newCpf : userData.get(0);
            String dataPassword = !newPassword.isEmpty() ? newPassword : userData.get(1);
            String dataSaldo    = userData.get(2);

            String line = dataCpf + " " + dataPassword + " " + dataSaldo;

            Files.write(users.toPath(), objDelete, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

            Path filePath  = Paths.get(path + "/src/challenges/users/users.txt");
            Files.write(filePath, line.getBytes(), StandardOpenOption.APPEND);
            return true;

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo de usuarios");
            return false;
        }
    }

    static boolean deleteUser() {
        System.out.println("DELETAR USUARIO");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o cpf do usuario");
        String cpf = sc.next();

        try {
            String path = new File(".").getAbsolutePath();
            File users = new File(path + "/src/challenges/users/users.txt");

            List<String> obj = Files.lines(users.toPath())
                                    .filter(line -> !line.contains(cpf))
                                    .collect(Collectors.toList());

            Files.write(users.toPath(), obj, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

            return true;

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo de usuarios");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cpf;
        String password;

        System.out.println("--------------------");
        System.out.println("| JAVA WALLET - CLI |");
        System.out.println("--------------------");

        System.out.println("LOGIN");

        System.out.println("Informe seu usuario (cpf): ");
        cpf = sc.next();

        System.out.println("Informa sua senha: ");
        password = sc.next();

        validateUser(cpf, password);
    }

}
