// veri çekileceği için yani öğrencilerden not girilmesi isteneceği için scanner sınıfı tanımlıyoruz.

import java.util.Scanner;

public class pratik1 {
    public static void main(String[] args) {

// sonrasında değişkenleri ve bu değişkenleri kullanabilmek için nesneleri yazıyoruz.

    int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

    Scanner input = new Scanner ( System.in);

        System.out.print("Matematik Notunuz : " );
        Matematik = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        Fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        Kimya = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        Turkce = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        Tarih = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        Muzik = input.nextInt();

// şimdi not toplamlarını yapıyoruz. bu toplam için de bir değişken tanımlıyoruz.

        int Toplam;
        Toplam = Matematik + Fizik + Kimya + Turkce + Tarih + Muzik;

// şimdi de bir sonuç değişkeni tanımlamamız gerekiyor. double kullanılması makul. zira sonuç kusüratlı olabilir.

        double Sonuc;
        Sonuc = Toplam / 6;

// burada double kullanıldığı için bölme işlemine 6.0 yazılması daha mantıklı.
// şimdi  bu sonucu yazdıralım.

        System.out.println("Ortalamanız : " + Sonuc);

// son olarak ortalama 60'ın altında ise kaldı, 60 ve üzerinde ise geçti ibaresini yazdırmamız lazım.

// ilk olarak koşul değişkenlerini oluşturuyoruz.

        boolean Kosul;
        Kosul = (Sonuc < 60);


// son olarak bu koşul operatörlerine göre son durumu geçti kaldı şeklinde hazırlamamız lazım.

        String Durumunuz;
        Durumunuz = Kosul ? "Kaldı" : "Geçti";

        System.out.println("Sınıf Durumu : " + Durumunuz);





    }
}
