import java.util.Scanner;

public class TugasBis{
    public static void main(String[] args) {

        int tiket=0;
        int total;
        String ruteku="";
        String kelasku="";

        for(int i=0; i<2; i++){
            Scanner Obj = new Scanner(System.in);
            System.out.print("Nama Pemesan: ");
            String pemesan = Obj.nextLine();
            System.out.println();

            System.out.println("Rute Bis");
            System.out.println("1. Jakarta-Bandung");
            System.out.println("2. Bandung-Jakarta");
            System.out.println("3. Jakarta-Tasikmalaya");
            System.out.print("Pilihan Anda: ");
            int rute = Obj.nextInt();
            System.out.println();

            System.out.println("Kelas: ");
            System.out.println("1. Non-AC ");
            System.out.println("2. AC ");
            System.out.print("Pilihan Anda: ");
            int kelas = Obj.nextInt();
            System.out.println();

            System.out.print("Jumlah Kursi: ");
            int kursi = Obj.nextInt();

            if(rute==1){
                if(kelas==1){
                    ruteku="Jakarta-Bandung";
                    kelasku="Non-AC";
                    tiket=90000;
                }else if(kelas==2){
                    ruteku="Jakarta-Bandung";
                    kelasku="AC";
                    tiket=130000;
                }else{
                    ruteku="Tidak Tersedia";
                }
            }else if(rute==2){
                if(kelas==1){
                    ruteku="Bandung-Jakarta";
                    kelasku="Non-AC";
                    tiket=70000;
                }else if(kelas==2){
                    ruteku="Bandung-Jakarta";
                    kelasku="AC";
                    tiket=150000;
                }else{
                    ruteku="Tidak Tersedia";
                }
            }else if(rute==3){
                if(kelas==1){
                    ruteku="Jakarta-Tasikmalaya";
                    kelasku="Non-AC";
                    tiket=50000;
                }else if(kelas==2){
                    ruteku="Jakarta-Tasikmalaya";
                    kelasku="AC";
                    tiket=70000;
                }else{
                    ruteku="Tidak Tersedia";
                }
            }else{
                ruteku="Tidak Tersedia";
                kelasku="Tidak Tersedia";
            }

            System.out.println();
            System.out.println("Nama Pemesan : "+pemesan);
            System.out.println("Rute         : "+ruteku);
            System.out.println("Kelas        : "+kelasku);
            System.out.println("Harga Satuan : "+tiket);
            System.out.println("Jumlah Kursi : "+kursi);
            total=kursi*tiket;
            System.out.println("Total        : "+total);
            System.out.println();
        }
        
    }
}