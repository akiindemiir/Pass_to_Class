import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, muzik;
        double ortalama;
        int toplamnot = 0;
        int sayac = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        matematik = input.nextInt();
        if (matematik <= 0 || matematik >= 100) {
            System.out.println("Notunuz 0-100 aralığında değildir. Ortalamaya dahil edilmeyecektir.");
        } else {
            toplamnot += matematik;
            sayac +=1;
        }

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik <= 0 || fizik >= 100) {
            System.out.println("Notunuz 0-100 aralığında değildir. Ortalamaya dahil edilmeyecektir.");
        } else {
            toplamnot += fizik;
            sayac += 1;
        }

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya <= 0 || kimya >= 100) {
            System.out.println("Notunuz 0-100 aralığında değildir. Ortalamaya dahil edilmeyecektir.");
        } else {
            toplamnot += kimya;
            sayac += 1;
        }

        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce <= 0 || turkce >= 100) {
            System.out.println("Notunuz 0-100 aralığında değildir. Ortalamaya dahil edilmeyecektir.");
        } else {
            toplamnot += turkce;
            sayac += 1;
        }

        System.out.println("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik <= 0 || muzik >= 100) {
            System.out.println("Notunuz 0-100 aralığında değildir. Ortalamaya dahil edilmeyecektir.");
        } else {
            toplamnot += muzik;
            sayac += 1;
        }
        ortalama = toplamnot / sayac;
        if (ortalama > 55) {
            System.out.println("Tebrikler Geçtiniz... Not Ortalamanız: " + ortalama);
        } else {
            System.out.println("Maalesef Kaldınız!!! Not Ortalamanız: " + ortalama);
        }
    }

}