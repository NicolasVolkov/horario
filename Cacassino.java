import java.util.Random;
public class Cacassino {
    public static void main (String[] args) throws InterruptedException {
        Random gerador = new Random();
        int[] numeroSorteado = {1, 2, 3};
        int num = 0;

        do {
            num += 1;

            numeroSorteado[0] = gerador.nextInt(7) + 1;
            numeroSorteado[1] = gerador.nextInt(7) + 1;
            numeroSorteado[2] = gerador.nextInt(7) + 1;
            System.out.println("Sorteio: " + numeroSorteado[0] + " " + numeroSorteado[1] + " " + numeroSorteado[2]);

            Thread.sleep(200);
        } while (!(numeroSorteado[0] == numeroSorteado[1] && numeroSorteado[1] == numeroSorteado[2] && numeroSorteado[0] == numeroSorteado[2])); //|| !(dado == 20)//);
        System.out.println("Você conseguiu um Jackpot! Parabéns!");
        System.out.println("Número de tentativas: "+num);
    }

}