import java.util.Scanner;
public class no3 {
    public class check{
        static int jumlahplat = 10;
        static int kudus = 0;
        static int jakarta = 0;
        static int jogja = 0;
        static int karawang = 0;
        static int solo = 0;
        static int sisakuota = 0;
        static boolean sukses = false;
        String[]infoplat = new String[]{"k-kudus","B-jakarta","AB-jogja","T-karawang","AD-solo"};

        public static void main(String[] args) {
            String[]infoplat = new String[]{"k-kudus","B-jakarta","AB-jogja","T-karawang","AD-solo"};
            for(int i = 0;i<8;i++){
                plat();
            }
        }

        public static void cekPlatnomer(String kodeplat) {
            if (kodeplat.contains("k")){
                sukses = true;
                kudus++;
            } else if (kodeplat.contains("B")) {
                sukses = true;
                jakarta++;
            } else if (kodeplat.contains("AB")) {
                sukses = true;
                jogja++;
            } else if (kodeplat.contains("T")) {
                sukses = true;
                karawang++;
            } else if (kodeplat.contains("AD")) {
                sukses = true;
                solo++;
            }
            else {
                sukses = false;
                System.out.println("kode tidak valid");
            }
        }
        static void plat(){
            Scanner inputData = new Scanner(System.in);
            System.out.println("masuk plat :");
            String plat = inputData.nextLine();
            cekPlatnomer(plat);
            if (sukses){
                printplat();
            }
        }
        public static void printplat(){
            sisakuota = jumlahplat - kudus - jakarta - jogja - karawang - solo;
            System.out.println("plat kudus"+kudus+" | "+"plat jakarta|"+jakarta+"plat jogja|"+jogja+"plat karawang|"+karawang+"plat solo|"+solo);
            System.out.println("jumlah mobil:"+jumlahplat+"sisa kuota"+sisakuota);
        }
    }
    public static void main(String[]args){
        while (true){
            check.plat();
        }
    }


    }
