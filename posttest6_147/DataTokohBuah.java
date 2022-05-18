package posttest6_147;

import java.util.ArrayList;
import java.util.Scanner;
public class DataTokohBuah {
     public static void main(String[] args){
         TambahTokoBuah toko1 = new TambahTokoBuah("", "", 0);
         DisplayTokoBuah display1 = new DisplayTokoBuah();
        ArrayList<TambahTokoBuah> dataToko = new ArrayList<>();

        int pilih;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("||==Data Toko Buah==||");
            System.out.println("[1] Lihat Data Toko Buah");
            System.out.println("[2] Tambah Data Toko Buah");
            System.out.println("[3] Edit Data Toko Buah");
            System.out.println("[4] Hapus Data Toko Buah");
            System.out.println("[5] Exit ");
            System.out.println("------------------------------");
            System.out.println("Pilih menu yang ingin anda pilih");
            pilih = scan.nextInt();
            if (pilih == 1){
                System.out.println("Menu Tampilkan Data Toko Buah");
                if(dataToko.isEmpty()) System.out.println("Data Kosong!");
                else {
                    
                    for(int i = 0; i < dataToko.size(); i++) {
                        display1.setToko(dataToko.get(i));
                        System.out.println("=======================================");
                        System.out.println("Data ke-" + (i+1));
                        System.out.println("Nama_Toko    : " + display1.getNama_Toko());
                        System.out.println("Nama_Buah   : " + display1.getNama_Buah());
                        System.out.println("Jumlah_StockBuah : " + display1.getJumlah_StockBuah());
                        System.out.println("=======================================");
                    }                      
                }
                toko1.setProses();
                System.out.println("Proses yang telah dilakukan : " + TambahTokoBuah.proses);   
            }if (pilih == 2){
                Scanner scancreate = new Scanner(System.in);
                String Nama_Toko, Nama_Buah;
                int jumlah_StockBuah;

                System.out.println("Menu Tambah Data Toko");
                System.out.print("Masukkan Nama_Toko    : ");
                Nama_Toko = scancreate.nextLine();
                System.out.print("Masukkan Nama_Buah   : ");
                Nama_Buah = scancreate.nextLine();
                System.out.print("Masukkan Jumlah_StockBuah : ");
                jumlah_StockBuah = scancreate.nextInt();
                dataToko.add(new TambahTokoBuah (Nama_Toko, Nama_Buah, jumlah_StockBuah));
                System.out.println("Data Berhasil Ditambahkan!");
                
                toko1.setProses();
                System.out.println("Proses yang telah dilakukan : " + TambahTokoBuah.proses);
            }if (pilih == 3){
                Scanner input = new Scanner(System.in);
                Scanner scanupdate = new Scanner(System.in);
                String nama_Toko,Nama_Buah;
                int jumlah_StockBuah;
        
                System.out.println("Menu Ubah Data Toko Buah");
                if(dataToko.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < dataToko.size(); i++) {
                        System.out.println("=======================================");
                        System.out.println("Data ke-" + (i+1));
                        System.out.println("Nama_Toko    : " + dataToko.get(i).getNama_Toko());
                        System.out.println("Nama_Buah   : " + dataToko.get(i).getNama_Buah());
                        System.out.println("Jumlah_StockBuah  : " + dataToko.get(i).getJumlah_StockBuah());
                        System.out.println("=======================================");
                    }                    
                }
                System.out.print("Masukkan Nomor Data yang ingin diubah: ");
                int no = input.nextInt();
                System.out.print("Masukkan Nama Toko : ");
                nama_Toko = scanupdate.nextLine();
                System.out.print("Masukkan Nama Buah : ");
                Nama_Buah = scanupdate.nextLine();
                System.out.print("Masukkan Jumlah Stok : ");
                jumlah_StockBuah = scanupdate.nextInt();
                dataToko.set(no-1, new TambahTokoBuah(nama_Toko, Nama_Buah,jumlah_StockBuah));
                System.out.println("Data Berhasil Diubah!");        
                
                toko1.setProses();
                System.out.println("Proses yang telah dilakukan : " + TambahTokoBuah.proses);        
            }if (pilih == 4){
                System.out.println("Menu Hapus Data Toko Buah");
                Scanner input = new Scanner(System.in);
        
                System.out.println("Menu Ubah Data Toko Buah");
                if(dataToko.isEmpty()) System.out.println("Data Kosong!");
                else {
                    for(int i = 0; i < dataToko.size(); i++) {
                        System.out.println("=======================================");
                        System.out.println("Data ke-" + (i+1));
                        System.out.println("Nama_Toko    : " + dataToko.get(i).getNama_Toko());
                        System.out.println("Nama_Buah   : " + dataToko.get(i).getNama_Buah());
                        System.out.println("Stok Buah : " + dataToko.get(i).getJumlah_StockBuah());
                        System.out.println("=======================================");
                    }
                }
                System.out.print("Masukkan Nomor Data yang ingin dihapus: ");
                int no = input.nextInt();
                dataToko.remove(no-1);
                System.out.println("Data Berhasil Dihapus!");
                
                toko1.setProses();
                System.out.println("Proses yang telah dilakukan : " + TambahTokoBuah.proses);
            }if (pilih == 5){
                toko1.setProses();
                System.out.println("Proses yang telah dilakukan : " + TambahTokoBuah.proses);
                System.out.println("Terima Kasih");
            }
        } while(pilih != 5);      
     }
    }
// } TokoBuah {
    
// }
