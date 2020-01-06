import java.util.Scanner;

public class TugasParkir {
    public static void main(String []args) {
        int lamaparkir;
        int biayaparkir=0;
        int biayaparkirnext=0;
        String tipe="";
        int total=0;

        for (int i=0; i<2; i++){
            Scanner Obj=new Scanner(System.in);
            System.out.print("Plat        : ");
            String plat = Obj.nextLine();
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.print("Jenis       : ");
            int jenis = Obj.nextInt();
            System.out.print("Jam Masuk   : ");
            int jmasuk = Obj.nextInt();
            System.out.print("Jam Keluar  : ");
            int jkeluar = Obj.nextInt();
   
            if(jmasuk>jkeluar){
                jkeluar=jkeluar+24;
            }
            
            if(jenis==1){
                tipe="Mobil";
                biayaparkir = 5000;
                biayaparkirnext = 3000;
            }else if(jenis==2){
                tipe="Motor";
                biayaparkir = 3000;
                biayaparkirnext = 1500;
            }else{
                System.out.println("Jenis Kendaraan Tidak Terdaftar");
            }

            lamaparkir=jkeluar-jmasuk;
            if(lamaparkir==1){
                total = biayaparkir;
            }
            else if(lamaparkir>1){
                total = biayaparkir+((lamaparkir-1)*biayaparkirnext);    
            }else if(lamaparkir==0){
                lamaparkir = 1;
                total = biayaparkir;
            }

            System.out.println();
            System.out.println("Plat            : " +plat);
            System.out.println("Jenis Kendaraan : "+tipe);
            System.out.println("Lama Parkir     : "+lamaparkir+" Jam");
            System.out.println("Biaya Parkir    : "+total);
            System.out.println();
        }
    }
}