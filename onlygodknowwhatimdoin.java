import java.util.*;
import java.lang.Math;

public class onlygodknowwhatimdoin { 

    public static void main(String[] args) {
        
        int i,j, tmb, krg, kali, bagi, menu, prsg, prsgp, segi3, no;
        char menu2 = 'Y';
        float a,b,c,d;
        double x1,x2, sld,bung,bln,slda;

        do {
            System.out.print("\033\143");
        System.out.println(" =============================================================\n" + 
                           "|                                                             |\n" 
                          +"|                   PROGRAM KALKULATOR UB                     |\n"
                          +"|                                                             |\n"
                          +"| ----------------------------------------------------------- |\n"
                          +"|                                                             |\n"
                          +"|                   Universitas Brawijaya                     |\n"
                          +"|                                                             |\n"
                          +" =============================================================\n" );
        System.out.println("Press Any Key To Continue...");
          new java.util.Scanner(System.in).nextLine();
          System.out.print("\033\143");
        System.out.println("              MENU UTAMA PROGRAM KALKULATOR UB" 
                         + "\n ------------------------------------------------------------- ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Segitiga");
        System.out.println("8. Kuadrat");
        System.out.println("9. Exit");
        System.out.println("Silahkan Pilih Menu NO :");
        no = input.nextInt();
        switch (no) {
            case 1:
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Bilangan 1");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Bilangan 2");
            j = input.nextInt();
            tmb = i + j;
            System.out.println("Hasil Penjumlahan : " + tmb);
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);   
                break;
            case 2: 
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Bilangan 1");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Bilangan 2");
            j = input.nextInt();
            krg = i - j;
            System.out.println("Hasil Pengurangan : " + krg);
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);   
                break;
            case 3:
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Bilangan 1");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Bilangan 2");
            j = input.nextInt();
            kali = i * j;
            System.out.println("Hasil Perkalian : " + kali);  
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);  
                break;
            case 4:
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Bilangan 1");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Bilangan 2");
            j = input.nextInt();
            bagi = i / j;
            System.out.println("Hasil Pembagian : " + bagi); 
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);  
                break;
            case 5:
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Panjang Sisi");
            i = input.nextInt();
            prsg = i*i;
            System.out.println("Hasil Persegi : " + prsg);  
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0); 
                break;
            case 6:
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Panjang Alas");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Panjang Lebar");
            j = input.nextInt();
            prsgp = i * j;
            System.out.println("Hasil Persegi Panjang : " + prsgp);   
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);
                break;
            case 7 :
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Alas");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Tinggi");
            j = input.nextInt();
            segi3 = i * j/2;
            System.out.println("Hasil Segitiga : " + segi3);   
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0); 
                break;
            case 8:
            System.out.print("\033\143");
        System.out.print("Masukkan Nilai a = "); a=input.nextFloat();
        System.out.print("Masukkan Nilai b = "); b=input.nextFloat();
        System.out.print("Masukkan Nilai c = "); c=input.nextFloat();
        d=b*b-4*a*c;
        if(d<0) {
            System.out.println("\n==============================================");
            System.out.println("================HASIL AKAR-AKAR===============");
            System.out.println("==============================================");
            System.out.printf("\n%30s","Akar Imajiner");
        }
        else {
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("\n==============================================");
            System.out.println("================HASIL AKAR-AKAR===============");
            System.out.println("==============================================\n");
            System.out.printf("x1 = %7.3f        x2 = %7.3f \n", x1,x2);
        }

            System.out.println("Kembali ke menu Y/N");
            menu = input.next().charAt(0);
            break;
            case 9:
            System.out.print("\033\143");
            System.out.println("Masukkan Saldo Awal Anda");
            sld = input.nextDouble();
            System.out.println("Masukkan Bunga per Bulan");
            bung = input.nextDouble();
            bung = bung/100;
            System.out.println("Berapa Tahunx Lama Menabung");
            bln = input.nextDouble();
            bung = bung*bln;
            slda = sld+(sld*bung);
            System.out.println("Inilah Saldo Akhir Anda "+ slda);
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);
            break;
            case 10:
            menu2 = 'n';
            break;
        
            default:
            System.out.print("\033\143");
            System.out.println("Salah Memasukkan Input data");
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);
                break;
        }
        } while (menu2 == 'Y' || menu2 == 'y');
        
    }
}
