package model;

import com.example.app2.R;

public class Resep {
    private Halaman[] mHalaman;

    public Resep(){
        mHalaman = new Halaman[7];

        mHalaman[0]=new Halaman(
                R.drawable.a,
                "Hai, Namaku Dilan, Kamu %1$s yah.Aku Ramal nanti kita ketemu di kantin",
                new Pilihan("Diam",1),
                new Pilihan("Bodo Amat",2)
        );

        mHalaman[1]=new Halaman(
                R.drawable.b,
                "Boleh Lihat tanganmu? Kamu tau gak bedanya tanganmu dengan tanganku?",
                new Pilihan("Taulah, Beda Tempatkan?",3),
                new Pilihan("Gak Tau",4)
        );

        mHalaman[2]=new Halaman(
                R.drawable.c,
                "Hehehe... Iya juga sih, tapi bukan itu.",
                new Pilihan("Trus Apa?",5),
                new Pilihan("Lepas tanganku",6)
        );

        mHalaman[3]=new Halaman(
                R.drawable.d,
                "Kita mungkin baru pertama ketemu, Tapi rasanya udah lama banget",
                new Pilihan("Sudah Gombalnya",4),
                new Pilihan("Tampar",5)
        );

        mHalaman[4]=new Halaman(
                R.drawable.e,
                "Aku ramal kita akan bersama suatu hari nanti",
                new Pilihan("Diam",5),
                new Pilihan("Kabur",6)
        );

        mHalaman[5]=new Halaman(
                R.drawable.depan,
                "Aku ramal kita akan ketemu lagi %1$s"
        );

        mHalaman[6]=new Halaman(
                R.drawable.depan,
                "Jangan rindu, berat, kamu gak akan kuat %1$s"
        );
    }
    public Halaman getHalaman(int pagenumber){
        return mHalaman[pagenumber];
    }
}
