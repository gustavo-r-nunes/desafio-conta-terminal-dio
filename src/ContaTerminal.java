import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBanco contaBanco = new ContaBanco();

        System.out.println("Digite o número da conta: ");
        contaBanco.setNumero(scanner.nextInt());

        System.out.println("Digite o número da agência: ");
        contaBanco.setAgencia(scanner.next());

        System.out.println("Digite o nome do cliente: ");
        contaBanco.setNomeCliente(scanner.next());

        System.out.println("Digite o número do saldo: ");
        contaBanco.setSaldo(scanner.nextInt());

        System.out.println("Olá, " + contaBanco.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + contaBanco.getAgencia()
                + " , conta " + contaBanco.getNumero() +
                " e seu saldo " + contaBanco.getSaldo() + " já está disponível para saque");

    }
}