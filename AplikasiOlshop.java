package aplikasiolshop;

import java.util.Scanner;

public class AplikasiOlshop {

   public static void main(String[] args) {
     System.out.println("Aplikasi OLshop Momi "+2018);
     System.out.println("Kami menjual Paperbag seharga Rp.10.000/pcs");
     System.out.println("Kami menjual Wrappingpaper seharga Rp. 5.000/pcs");
     System.out.println("Kami menjual Greetingcards seharga Rp. 2.000/pcs");
     /*
     int A;
     int B;
     int C;
     A = 10000;
     B = 5000;
     C = 2000;

     System.out.println("Paperbag 2 pcs = "+A*2);
     System.out.println("Wrappingpaper 2 pcs = "+B*2);
     System.out.println("Greetingcards 2 pcs = "+C*2);
     */
     Scanner ask = new Scanner (System.in);
     System.out.print("Anda ingin Memesan Ya/Tidak ? ");
     String tanya = ask.nextLine();

            if ("Ya".equals (tanya)) {

            Scanner in = new Scanner (System.in) ;
            System.out.println ("Nama Barang Pesanan : ");
            System.out.println ("Jumlah Barang Pesanan : ");
            System.out.print("Harga Barang Pesanan : ");
            String nama package aplikasiolshop;

import java.util.Scanner;

public class AplikasiOlshop {

   public static void main(String[] args) {
     System.out.println("Aplikasi OLshop Momi "+2018);
     System.out.println("Kami menjual Paperbag seharga Rp.10.000/pcs");
     System.out.println("Kami menjual Wrappingpaper seharga Rp. 5.000/pcs");
     System.out.println("Kami menjual Greetingcards seharga Rp. 2.000/pcs");
     /*
     int A;
     int B;
     int C;
     A = 10000;
     B = 5000;
     C = 2000;

     System.out.println("Paperbag 2 pcs = "+A*2);
     System.out.println("Wrappingpaper 2 pcs = "+B*2);
     System.out.println("Greetingcards 2 pcs = "+C*2);
     */
     Scanner ask = new Scanner (System.in);
     System.out.print("Anda ingin Memesan Ya/Tidak ? ");
     String tanya = ask.nextLine();

            if ("Ya".equals (tanya)) {

            Scanner in = new Scanner (System.in) ;
            System.out.println ("Nama Barang Pesanan : ");
            System.out.println ("Jumlah Barang Pesanan : ");
            System.out.print("Harga Barang Pesanan : ");
            String nama = in.nextLine();
            }
        else{
                System.out.println("Terima Kasih");
            }

        if ("Paperbag".equals (tanya)){
            int harga = 10000;
            Scanner a = new Scanner (System.in);
            System.out.print ("Masukkan Jumlah pcs Paperbag : ");
            int jumlah = a.nextInt();
            int biaya = jumlah*harga;
            System.out.println("Biaya Untuk "+jumlah+" pcs Paperbag adalah = Rp. "+biaya+",-");
        }
        if ("Wrappingpaper".equals (tanya)){
            int harga = 5000;
            Scanner a = new Scanner (System.in);
            System.out.print ("Masukkan Jumlah pcs Wrapppingpaper : ");
            int jumlah = a.nextInt();
            int biaya = jumlah*harga;
            System.out.println("Biaya Untuk "+jumlah+" pcs Wrappingpaper adalah = Rp. "+biaya+",-");
        }
        if ("Greetingcards".equals (tanya)){
            int harga = 2000;
            Scanner a = new Scanner (System.in);
            System.out.print ("Masukkan Jumlah pcs Greetingcards : ");
            int jumlah = a.nextInt();
            int biaya = jumlah*harga;
            System.out.println("Biaya Untuk "+jumlah+" pcs Greetingcards adalah = Rp. "+biaya+",-");
        }
    }
}= in.nextLine();
            }
        else{
                System.out.println("Terima Kasih");
            }

        if ("Paperbag".equals (tanya)){
            int harga = 10000;
            Scanner a = new Scanner (System.in);
            System.out.print ("Masukkan Jumlah pcs Paperbag : ");
            int jumlah = a.nextInt();
            int biaya = jumlah*harga;
            System.out.println("Biaya Untuk "+jumlah+" pcs Paperbag adalah = Rp. "+biaya+",-");
        }
        if ("Wrappingpaper".equals (tanya)){
            int harga = 5000;
            Scanner a = new Scanner (System.in);
            System.out.print ("Masukkan Jumlah pcs Wrapppingpaper : ");
            int jumlah = a.nextInt();
            int biaya = jumlah*harga;
            System.out.println("Biaya Untuk "+jumlah+" pcs Wrappingpaper adalah = Rp. "+biaya+",-");
        }
        if ("Greetingcards".equals (tanya)){
            int harga = 2000;
            Scanner a = new Scanner (System.in);
            System.out.print ("Masukkan Jumlah pcs Greetingcards : ");
            int jumlah = a.nextInt();
            int biaya = jumlah*harga;
            System.out.println("Biaya Untuk "+jumlah+" pcs Greetingcards adalah = Rp. "+biaya+",-");
        }
    }
}