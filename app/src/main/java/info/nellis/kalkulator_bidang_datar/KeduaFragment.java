package info.nellis.kalkulator_bidang_datar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KeduaFragment extends Fragment {
    private EditText txt_alas, txt_tinggi;
    private Button btnhasil;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kedua, container, false);

        txt_alas = v.findViewById(R.id.txt_alas);
        txt_tinggi = v.findViewById(R.id.txt_tinggi);
        btnhasil = v.findViewById(R.id.btnhasil);
        hasil = v.findViewById(R.id.hasil);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txt_alas.getText().toString();
                String nilai2 = txt_tinggi.getText().toString();

                if (nilai1.isEmpty()) {
                    txt_alas.setError("Masukkan Data yang benar");
                    txt_alas.requestFocus();
                } else if (nilai2.isEmpty()) {
                    txt_tinggi.setError("Masukkan Data yang benar");
                    txt_tinggi.requestFocus();
                } else {
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);

                    Double luas = 0.5 * alas * tinggi;
                    hasil.setText(String.format("%.2f", luas));
                }
            }

        });

        return v;
    }
}