package model;

public class Pilihan {
    private String mText;
    private int mNext;

    public Pilihan(String teks, int pilLanjut){
        mText = teks;
        mNext = pilLanjut;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public int getmNext() {
        return mNext;
    }

    public void setmNext(int mNext) {
        this.mNext = mNext;
    }
}
