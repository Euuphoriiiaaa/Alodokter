package com.example.alodokter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    private EditText Email;
    private EditText Sandi;
    private Button btnMulai;
    private Button btnDaftar;
    private ImageButton btnPindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Email = findViewById(R.id.Email);
        Sandi = findViewById(R.id.Sandi);
        btnMulai = findViewById(R.id.btnMulai);
        btnDaftar = findViewById(R.id.btnDaftar);
        ImageButton btnPindah = findViewById(R.id.btnPindah);
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = Email.getText().toString();
                String sandi = Sandi.getText().toString();
                // Validasi username dan password
                if (!Email.equals(Email)) {
                    Toast.makeText(LoginActivity.this, "Anda belum terdaftar", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Jika user sudah terdaftar, masuk ke halaman ketiga
                if (true) {
                    Intent intent = new Intent(LoginActivity.this, DepanActivity.class);
                    intent.putExtra("Email", email);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Email dan sandi tidak cocok", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
