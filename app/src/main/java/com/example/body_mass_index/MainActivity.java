package com.example.body_mass_index;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText soThuNhat;
    EditText soThuHai;
    Button tinhTong;
    TextView hienThi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soThuNhat = (EditText)findViewById(R.id.soThuNhat);
        soThuHai = (EditText)findViewById(R.id.soThuHai);
        tinhTong = (Button)findViewById(R.id.buttonClick);
        hienThi = (TextView)findViewById(R.id.hienThi);
        tinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chieuCao = soThuNhat.getText().toString();
                String canNang = soThuHai.getText().toString();
                int so1 = Integer.parseInt(chieuCao);
                int so2 = Integer.parseInt(canNang);
                double ketQuaTinh = (so1 / Math.pow(so2,2));
                if(ketQuaTinh < 18 )
                    hienThi.setText(String.valueOf("Người gầy"));
                else
                    if(18 <= ketQuaTinh && ketQuaTinh < 24.9)
                        hienThi.setText(String.valueOf("Bình thường"));
                    else
                        if(25<= ketQuaTinh && ketQuaTinh < 29.9)
                            hienThi.setText(String.valueOf("Người béo phì mức độ I"));
                        else
                            if(30<= ketQuaTinh && ketQuaTinh < 34.9)
                                hienThi.setText(String.valueOf("Người béo phì mức độ II"));
                            else
                                if(ketQuaTinh > 35)
                                    hienThi.setText(String.valueOf("Người béo phì mức độ III"));

            }
        });
    }
}