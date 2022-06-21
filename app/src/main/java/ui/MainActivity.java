package ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.app2.R;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private Button btnMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.formName);
        btnMasuk = (Button)findViewById(R.id.btnMasuk);

        btnMasuk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String nama = name.getText().toString();
                HomeMhs(nama);
            }
        });
    }
    private void HomeMhs(String nama){
        Intent mhs = new Intent(this, MhsActivity.class);
        mhs.putExtra(getString(R.string.key_nama),nama);
        startActivity(mhs);
    }

    @Override
    protected void onResume() {
        super.onResume();
        name.setText("");
    }
}