public class Main {

    public static void main(String[] args) {

        Menu menu1 = new Menu(
                "M001",
                "Ayam Geybok Original",
                25000,
                20);

        menu1.tampilData();

        System.out.println("\nSetelah Update\n");

        menu1.updateData(
                "Ayam Geybok Level 5",
                28000,
                15);

        menu1.tampilData();

        menu1.cekStok();
    }
}