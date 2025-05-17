//package com.example.chat_real_time;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class RegisterActivity extends AppCompatActivity {
//    private EditText etEmail, etPassword;
//    private Button btnRegister;
//    private TextView tvLogin;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
//
//        etEmail = findViewById(R.id.etEmail);
//        etPassword = findViewById(R.id.etPassword);
//        btnRegister = findViewById(R.id.btnRegister);
//        tvLogin = findViewById(R.id.tvLogin);
//
//        // Xử lý khi nhấn "Đăng nhập"
//        tvLogin.setOnClickListener(v -> {
//            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
//            startActivity(intent);
//            finish();
//        });
//
//        // Xử lý khi nhấn "Đăng ký"
//        btnRegister.setOnClickListener(v -> {
//            String email = etEmail.getText().toString().trim();
//            String password = etPassword.getText().toString().trim();
//
//            if (email.isEmpty() || password.isEmpty()) {
//                Toast.makeText(RegisterActivity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
//            } else {
//                // Chỗ này sẽ tích hợp Firebase để đăng ký sau
//                Toast.makeText(RegisterActivity.this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}
