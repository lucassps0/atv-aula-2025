import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner senha = new Scanner(System.in);
        int senhaCorreta = 1234;
        int senhaDigitar = 0;
        while (senhaDigitar != senhaCorreta) {
            System.out.print("digite sua semha de 4 numeros: ");
            senhaDigitar = senha.nextInt();
            if (senhaDigitar == senhaCorreta) {
                System.out.println("senha correta! ");
            }
            else {
                System.out.println("senha incorreta. Tente novamente! ");
            }
        }
        senha.close();
    }
}
