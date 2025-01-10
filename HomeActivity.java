package com.example.alodokter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    private EditText editTextPhone;
    private EditText editTextDate;
    private EditText editTextPostalAddress;
    private ImageButton btnKembali;
    private Button btnSelanjutnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        editTextPhone = findViewById(R.id.editTextPhone);
        editTextDate = findViewById(R.id.editTextDate);
        editTextPostalAddress = findViewById(R.id.editTextPostalAddress);
        btnSelanjutnya = findViewById(R.id.btnSelanjutnya);
        ImageButton btnKembali =findViewById(R.id.btnKembali);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = editTextPhone.getText().toString();
                String date = editTextDate.getText().toString();
                String postalAddress = editTextPostalAddress.getText().toString();

                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
            });
        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, DepanActivity.class);
                startActivity(intent);
            }
        });
    }

    public void openArtikel(View view) {
        Intent intent = new Intent(this, ArtikelActivity.class);
        startActivity(intent);
    }
}

