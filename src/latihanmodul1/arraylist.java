package latihanmodul1;

import java.util.ArrayList;

public class arraylist {


        public static void main(String[] args) {
            ArrayList<String> Hewan = new ArrayList<String >();
            Hewan.add("sapi");
            Hewan.add("Kelinci");
            Hewan.add("Kambing");
            Hewan.add("unta");
            Hewan.add("Domba");

            ArrayList<String>DeleteHewan = new ArrayList<String >();
            DeleteHewan.add("Kelinci");
            DeleteHewan.add("Kambing");
            DeleteHewan.add("unta");

            // menghapus data pada objek Hewan yang sama dengan data warna pada objek DeleteHewan
            for (String warna : DeleteHewan) {
                Hewan.removeIf(h -> h.equals(warna));
            }

            // menampilkan isi objek Hewan setelah penghapusan
            System.out.println("Isi objek Hewan setelah penghapusan:");
            for (String hewan : Hewan) {
                System.out.println(hewan);
            }
        }
    }

