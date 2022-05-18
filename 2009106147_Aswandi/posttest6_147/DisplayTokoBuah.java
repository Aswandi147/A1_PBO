package posttest6_147;

public class DisplayTokoBuah extends TokoBuah {
    TambahTokoBuah toko1;
    public DisplayTokoBuah(){
        super();
    }

    public void setToko(TambahTokoBuah toko1){
        this.toko1 = toko1;
    }

    public int displayProses(){
        return proses;
    }

    public String getNama_Toko() {
        return toko1.Nama_Toko;
    }

    public String getNama_Buah() {
        return toko1.Nama_Buah;
    }

    public int getJumlah_StockBuah() {
        return toko1.Jumlah_StockBuah;
    }
}
