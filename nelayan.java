import java.io.*;

class fisherman{
    String nama;
    String alamat;
    int no; 
    String jenisKelamin;

    // constructor = input data
    fisherman(String nama, String alamat, int no, String kelamin){
        this.nama = nama;
        this.alamat = alamat;
        this.no = no;
        this.jenisKelamin = kelamin;
    }
    String getNama(){
        return this.nama;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getAlamat(){
        return this.alamat;
    }
    int getNo(){
        return this.no;
    }
    String getKelamin(){
        return this.jenisKelamin;
    }
    // method menangkap ikan
    void menangkap(int indeks){
        if (indeks==0){
            System.out.println("ikan gagal ditangkap");
        } else{
            System.out.println("nelayan berhasil menangkap : "+indeks+" ekor ikan");
        }
    }
}

class ikan{
    String jenis;
    String warna;
    String kelamin;
    String habitat;

    ikan(String jenis, String warna, String kelamin, String habitat){
        this.jenis = jenis;
        this.warna = warna;
        this.kelamin = kelamin;
        this.habitat = habitat;
    }
    String getJenis(){
        return this.jenis;
    }
    String getwarna(){
        return this.warna;
    }
    String getKelamin(){
        return this.kelamin;
    }
    String getHabitat(){
        return this.habitat;
    }
    void berenang(String move){
        if ((move.equals("r")) || (move.equals("R"))){
            System.out.println("berenang ke arah kanan");
        } else if ((move.equals("l"))||(move.equals("L"))){
            System.out.println("berenang ke arah kiri");
        } else {
            System.out.println("command not found");
        }
    }
}

public class nelayan {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            // objek 1 
            System.out.print("nama : ");
            String name = input.readLine();
            System.out.print("alamat : ");
            String alamat = input.readLine();
            System.out.print("input no telpon: ");
            int no = Integer.parseInt(input.readLine());
            System.out.print("jenis kelamin : ");
            String kelamin = input.readLine();
            fisherman nelayan = new fisherman(name,alamat,no,kelamin);
            System.out.print("input ikan : ");
            int ikan = Integer.parseInt(input.readLine());  
            nelayan.menangkap(ikan);
            System.out.println("============================================================");
            ikan lele = new ikan("lele","hitam","betina","air tawar");
            System.out.println("jenis : " + lele.getJenis());
            System.out.println("warna : "+lele.getwarna());
            System.out.println("kelamin : "+lele.getKelamin());
            System.out.println("habitat : "+lele.getHabitat());
            System.out.print("berenang ke arah : ");
            String move = input.readLine();
            lele.berenang(move);
        } catch (IOException exception) {
            System.out.println("Error input!");
        }
    } 
}
