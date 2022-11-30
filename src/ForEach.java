public class ForEach {
    public static void main(String[] args) {
        String[] anggotaKeluarga = {
                "Ayah", "Ibu", "Kaka", "Adik"
        };

        for (var anggota: anggotaKeluarga) {
            System.out.println(anggota);
        }

//        for (var i = 0; i < anggotaKeluarga.length; i++) {
//            System.out.println(anggotaKeluarga[i]);
//        }
    }
}
