public class Menu {

    String idMenu;
    String namaMenu;
    int harga;
    int stok;

    // Constructor
    public Menu(String idMenu, String namaMenu, int harga, int stok) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.stok = stok;
    }

    // Menampilkan data
    public void tampilData() {
        System.out.println("ID Menu : " + idMenu);
        System.out.println("Nama Menu : " + namaMenu);
        System.out.println("Harga : Rp" + harga);
        System.out.println("Stok : " + stok);
    }

    // Mengubah data
    public void updateData(String namaBaru, int hargaBaru, int stokBaru) {
        namaMenu = namaBaru;
        harga = hargaBaru;
        stok = stokBaru;
    }

    // Mengecek stok
    public void cekStok() {
        if(stok > 0){
            System.out.println("Stok tersedia");
        } else {
            System.out.println("Stok habis");
        }
    }
}