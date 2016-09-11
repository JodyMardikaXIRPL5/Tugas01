package id.sch.smktelkom_mlg.tugas01.xirpl5015.androidaplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    EditText etAbsen;
    Button bOK;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etAbsen = (EditText) findViewById(R.id.editTextAbsen);
        bOK = (Button) findViewById(R.id.Daftar);
        tvHasil = (TextView) findViewById(R.id.TextViewHasil);

        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                int Absen = Integer.parseInt(etAbsen.getText().toString());
                tvHasil.setText(nama + "nama : " + Absen + "Absen");
            }
        });

    }


    public void clickExit(View v) {
        finish();
    }
    }
