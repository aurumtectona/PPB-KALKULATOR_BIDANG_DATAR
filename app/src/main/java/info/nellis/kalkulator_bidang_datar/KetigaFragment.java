package info.nellis.kalkulator_bidang_datar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KetigaFragment extends Fragment {
    private Button btnhasil;
    private EditText txt_jarijari;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_ketiga, container, false);

        btnhasil = v.findViewById(R.id.btnhasil);
        txt_jarijari = v.findViewById(R.id.txt_jarijari);
        hasil = v.findViewById(R.id.hasil);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String nilai = txt_jarijari.getText().toString();
               if(nilai.isEmpty()){
                   txt_jarijari.setError("Masukkan Data yang Benar");
                   txt_jarijari.requestFocus();
               }else {
                   Double jari = Double.parseDouble(nilai);
                   Double luas = 3.15 * (jari * 2);
                   hasil.setText(String.format("%.2f, luas"));
               }
            }
        });

        return v;
    }
}