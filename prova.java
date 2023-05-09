import java.util.Scanner;

class dados {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite o nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();
        System.out.println("Digite o seu peso atual em (kg):");
        double peso = scanner.nextDouble();
        System.out.println("Digite a quantidade de agua ingerida em litros:");
        double agua = scanner.nextDouble();

        double ideal = peso * 35.0 / 1000.0;
        double necessario = ideal - agua;

        System.out.println("Nome do Funcionário: " + nomeFuncionario);
        System.out.println("Peso do Funcionário: " + peso + " kg");
        System.out.println("Quantidade de água ingerida: " + agua + " L");
        System.out.println("Quantidade ideal de água ingerida " + ideal + " L");
        if (necessario <= 0) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária!");
        } else {
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + necessario + " litros! Você consegue!");
        }
        scanner.close();
    }
}