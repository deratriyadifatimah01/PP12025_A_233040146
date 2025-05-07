package pertemuan8;

public class Strukturlisttest {
    public static void main(String[] args) {
        // Membuat instance dari StrukturList
        Strukturlist list = new Strukturlist();
        Strukturlist test1 = new Strukturlist();
        Strukturlist tes4 = new Strukturlist();

        //LATIHAN 4
        // Menambahkan elemen ke list pertama
        list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 3));
        list.addHead(new Matakuliah("IF002", "Basis Data", 3));
        System.out.println("List 1:");
        list.displayElement();

        //TES 1
        // Menambahkan elemen ke list kedua
        test1.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        test1.addHead(new Matakuliah("IF003", "Struktur Dekrit", 3));
        test1.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
        test1.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        System.out.println("List 2:");
        test1.displayElement();

        //TES 4
        // Menambahkan elemen ke list ketiga
        tes4.addTail(new Matakuliah("IF002", "Pemrograman Web", 3));
        tes4.addTail(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        tes4.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        tes4.addMid(new Matakuliah("IF003", "Struktur Dekrit", 3), 2);
        System.out.println("List 3:");
        tes4.displayElement();
    }
}
