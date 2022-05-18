package posttest6_147;

import java.lang.reflect.Array;

public class TokoBuah implements Tampilan{
    public static int proses=0;
    protected String Nama_Toko;
    protected String Nama_Buah;
    protected int  Jumlah_StockBuah;
    
    public TokoBuah(String Nama_Toko, String Nama_Buah, int Jumlah_StockBuah){
        this.Nama_Toko = Nama_Toko;
        this.Nama_Buah = Nama_Buah;
        this.Jumlah_StockBuah = Jumlah_StockBuah;
  }
    public TokoBuah(){
        
    }
    public int displayProses(){
        return proses;
    }

    public String getNama_Toko() {
        return Nama_Toko;
    }

    public void setNama_Toko(String Nama_Toko) {
        this.Nama_Toko = Nama_Toko;
    }

    public String getNama_Buah() {
        return Nama_Buah;
    }

    public void setNama_Buah(String Nama_Buah) {
        this.Nama_Buah = Nama_Buah;
    }

    public int getJumlah_StockBuah() {
        return Jumlah_StockBuah;
    }

    public void setJumlah_StockBuah(int Jumlah_StockBuah) {
        this.Jumlah_StockBuah= Jumlah_StockBuah;
    }

    public void setProses(){
        proses += 1;
    }

 
}
