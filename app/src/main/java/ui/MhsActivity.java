package ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app2.R;

import model.Halaman;
import model.Resep;

public class MhsActivity extends AppCompatActivity {

    private Resep mResep = new Resep();
    private TextView mTextView;
    private ImageView mImageView;
    private Button mPilihan1;
    private Button mPilihan2;
    private String mNama;
    private Halaman mHalamanSekarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhs);

        Intent mhs = getIntent();
        mNama = mhs.getStringExtra(getString(R.string.key_nama));
        if (mNama == null) {
            mNama = "Tanpa Nama";
        }
        mImageView = (ImageView) findViewById(R.id.resepImageView);
        mTextView = (TextView) findViewById(R.id.resepTextView);
        mPilihan1 = (Button) findViewById(R.id.pilihan1);
        mPilihan2 = (Button) findViewById(R.id.pilihan2);
        loadHalaman(0);
    }

    private void loadHalaman(int pilihan) {
        mHalamanSekarang = mResep.getHalaman(pilihan);

        Drawable drawable = getResources().getDrawable(mHalamanSekarang.getmImageId());
        mImageView.setImageDrawable(drawable);
        String halamanTeks = mHalamanSekarang.getmText();
        halamanTeks = String.format(halamanTeks, mNama);

        mTextView.setText(halamanTeks);

        if (mHalamanSekarang.ismSelesai()) {
            mPilihan1.setVisibility(View.INVISIBLE);
            mPilihan2.setText("Main Lagi");
            mPilihan2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

        } else {

            mPilihan1.setText(mHalamanSekarang.getmPilihan1().getmText());
            mPilihan2.setText(mHalamanSekarang.getmPilihan2().getmText());

            mPilihan1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int nextHalaman = mHalamanSekarang.getmPilihan1().getmNext();
                    loadHalaman(nextHalaman);
                }
            });

            mPilihan2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int nextHalaman = mHalamanSekarang.getmPilihan2().getmNext();
                    loadHalaman(nextHalaman);
                }
            });
        }
    }

}