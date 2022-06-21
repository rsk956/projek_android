package model;

public class Halaman {
    private int mImageId;
    private String mText;
    private Pilihan mPilihan1;
    private Pilihan mPilihan2;
    private boolean mSelesai = false;

    public Halaman(int gambarId, String teks, Pilihan pilihan1, Pilihan pilihan2){
        mImageId = gambarId;
        mText = teks;
        mPilihan1 = pilihan1;
        mPilihan2 = pilihan2;
    }

    public Halaman(int gambarId, String teks){
        mImageId = gambarId;
        mText = teks;
        mPilihan1 = null;
        mPilihan2 = null;
        mSelesai = true;
    }

    public boolean ismSelesai() {
        return mSelesai;
    }

    public void setmSelesai(boolean mSelesai) {
        this.mSelesai = mSelesai;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public Pilihan getmPilihan1() {
        return mPilihan1;
    }

    public void setmPilihan1(Pilihan mPilihan1) {
        this.mPilihan1 = mPilihan1;
    }

    public Pilihan getmPilihan2() {
        return mPilihan2;
    }

    public void setmPilihan2(Pilihan mPilihan2) {
        this.mPilihan2 = mPilihan2;
    }
}
