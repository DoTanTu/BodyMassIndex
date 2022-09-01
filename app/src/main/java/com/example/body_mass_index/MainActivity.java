package com.example.body_mass_index;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText height;
    EditText weight;
    Button results;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = (EditText)findViewById(R.id.soThuNhat);
        weight = (EditText)findViewById(R.id.soThuHai);
        results = (Button)findViewById(R.id.buttonClick);
        display = (TextView)findViewById(R.id.hienThi);
        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String height_value = height.getText().toString();
                String weight_value = weight.getText().toString();

                if (height_value.equals("") || weight_value.equals("")) {
                    display.setText(String.valueOf("Bạn phải điền thông tin đầy đủ!"));
                }
                else {
                    double so1 = Double.parseDouble(height_value);
                    double so2 = Double.parseDouble(weight_value);
                    double ketQuaTinh = (so2 / Math.pow(so1, 2));
                    System.out.println(ketQuaTinh);
                    if (ketQuaTinh < 18)
                        display.setText(String.valueOf("Người gầy"));
                    else if (18 <= ketQuaTinh && ketQuaTinh < 24.9)
                        display.setText(String.valueOf("Bình thường"));
                    else if (25 <= ketQuaTinh && ketQuaTinh < 29.9)
                        display.setText(String.valueOf("Người béo phì mức độ I"));
                    else if (30 <= ketQuaTinh && ketQuaTinh < 34.9)
                        display.setText(String.valueOf("Người béo phì mức độ II"));
                    else if (ketQuaTinh > 35)
                        display.setText(String.valueOf("Người béo phì mức độ III"));

                }
            }
        });
    }
}