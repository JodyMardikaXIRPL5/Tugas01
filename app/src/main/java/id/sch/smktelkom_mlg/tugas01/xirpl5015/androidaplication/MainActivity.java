package id.sch.smktelkom_mlg.tugas01.xirpl5015.androidaplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Spinner spKelas;
    EditText etAbsen;
    EditText etEmail;
    EditText etTelpon;
    EditText etAlamat;
    RadioGroup rgKelamin;
    CheckBox cbapk;
    CheckBox cbroot;
    CheckBox cbcwm;
    CheckBox cbrom;
    CheckBox cbvirus;
    Button bOK;
    TextView tvHasil;
    TextView tvHasil2;
    TextView tvHasil3;
    TextView tvHasil4;
    TextView tvHasil5;
    TextView tvHasil6;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        etAbsen = (EditText) findViewById(R.id.editTextAbsen);
        etEmail = (EditText) findViewById(R.id.editTextEmail);
        etTelpon = (EditText) findViewById(R.id.editTextTelpon);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        cbapk = (CheckBox) findViewById(R.id.checkBoxAPK);
        cbroot = (CheckBox) findViewById(R.id.checkBoxROOT);
        cbcwm = (CheckBox) findViewById(R.id.checkBoxCWM);
        cbrom = (CheckBox) findViewById(R.id.checkBoxROM);
        cbvirus = (CheckBox) findViewById(R.id.checkBoxVirus);
        bOK = (Button) findViewById(R.id.Daftar);
        tvHasil = (TextView) findViewById(R.id.TextViewHasil);
        tvHasil2 = (TextView) findViewById(R.id.TextViewHasil2);
        tvHasil3 = (TextView) findViewById(R.id.TextViewHasil3);
        tvHasil4 = (TextView) findViewById(R.id.TextViewHasil4);
        tvHasil5 = (TextView) findViewById(R.id.textViewHasil5);
        tvHasil6 = (TextView) findViewById(R.id.textViewHasil6);

        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String email = etEmail.getText().toString();
                int telpon = Integer.parseInt(etTelpon.getText().toString());
                tvHasil.setText("Siswa dengan informasi di bawah ini telah berhasil mendaftar");
                tvHasil2.setText("Nama = " + nama);
                tvHasil3.setText("Email = " + email);
                tvHasil4.setText("Telpon = " + telpon);
                tvHasil5.setText("");
                doClick();

            }
        });
    }

    private void doClick() {
        String hasil = "Matreri yang Diambil = \n";
        int startlen = hasil.length();
        if (cbapk.isChecked()) hasil += cbapk.getText() + "\n"

        tvHasil6.setText("Kelas =" + spKelas.getSelect, edItem().toString());
    }

    public void clickExit(View v) {
        finish();
    }
    }
