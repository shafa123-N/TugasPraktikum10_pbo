package tugas.pkg10.pbo;
import java.util.ArrayList;

public class InputMHS {
    ArrayList <MAHASISWA> listMAHASISWA;
    public InputMHS (){
        listMAHASISWA = new ArrayList <> ();
    }
    
    public void Input(String NIM, String NAMA, String ALAMAT, String MK, double NILAI1, double NILAI2, double NILAI3, double NILAI4, double NILAI5) {
    MAHASISWA mhs = new MAHASISWA(NIM, NAMA, ALAMAT, MK, NILAI1, NILAI2, NILAI3, NILAI4, NILAI5);
    listMAHASISWA.add(mhs); // Menambahkan objek mhs ke listMAHASISWA
}

    
    public ArrayList<MAHASISWA> getAll(){
        return listMAHASISWA;
    }
    
    public void Hapus(int Index){
        listMAHASISWA.remove(Index);
    }
}
