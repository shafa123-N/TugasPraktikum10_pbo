package tugas.pkg10.pbo;

public class MAHASISWA {
    private String NIM, Nama, Alamat, MK;
    private double NILAI1, NILAI2, NILAI3, NILAI4, NILAI5;
    private double NILAIAKHIR;
    
    public MAHASISWA(String NIM, String NAMA, String ALAMAT, String MK, double NILAI1, double NILAI2, double NILAI3, double NILAI4, double NILAI5) {
    this.NIM = NIM;
    this.Nama = NAMA; // Memperbaiki penulisan NAMA
    this.Alamat = ALAMAT;
    this.MK = MK;
    this.NILAI1 = NILAI1;
    this.NILAI2 = NILAI2;
    this.NILAI3 = NILAI3;
    this.NILAI4 = NILAI4;
    this.NILAI5 = NILAI5;
    HitungNA();
}

    
    private void HitungNA() {
    NILAIAKHIR = (NILAI1 * 0.1) + (NILAI2 * 0.15) + (NILAI3 * 0.25) + (NILAI4 * 0.15) + (NILAI5 * 0.35);
}

    
    public String getNIM(){
        return NIM;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
    public String getMK(){
        return MK;
    }
    
    public double getNILAI1(){
        return NILAI1;
    }
    
    public double getNILAI2(){
        return NILAI2;
    }
    
    public double getNILAI3(){
        return NILAI3;
    }
    
    public double getNILAI4(){
        return NILAI4;
    }
    
    public double getNILAI5(){
        return NILAI5;
    }
    
    public double getNILAIAKHIR(){
        return NILAIAKHIR;
    }
}

