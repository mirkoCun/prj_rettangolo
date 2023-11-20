import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b, h, area1, perimetro1;
        double diagonale1;
        Scanner numero = new Scanner (System.in);
        System.out.println("inserisci il primo numero");
        b = numero.nextInt();
        System.out.println("inserisci il secondo numero");
        h = numero.nextInt();
        Rettangolo r1 = new Rettangolo(b,h);
        area1 = r1.area();
        perimetro1 = r1.perimetro();
        diagonale1 = r1.diagonale();
        System.out.println("base: " + r1.getBase());
        System.out.println("altezza " + r1.getAltezza());
        System.out.println("area: " + area1);
        System.out.println("perimetro: " + perimetro1);
        System.out.println("diagonale: " + diagonale1);
    }
}