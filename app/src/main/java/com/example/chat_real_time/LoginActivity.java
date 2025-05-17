//package com.example.chat_real_time;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.google.firebase.inappmessaging.model.Button;
//
//public class LoginActivity extends AppCompatActivity {
//    private EditText etEmail, etPassword;
//    private Button btnLogin;
//    private TextView tvRegister;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        etEmail = findViewById(R.id.etEmail);
//        etPassword = findViewById(R.id.etPassword);
//        btnLogin = findViewById(R.id.btnLogin);
//        tvRegister = findViewById(R.id.tvRegister);
//
//        // Xử lý khi nhấn "Đăng ký"
//        tvRegister.setOnClickListener(v -> {
//            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
//            startActivity(intent);
//        });
//
//        // Xử lý khi nhấn "Đăng nhập"
//        btnLogin.setOnClickListener(v -> {
//            String email = etEmail.getText().toString().trim();
//            String password = etPassword.getText().toString().trim();
//
//            if (email.isEmpty() || password.isEmpty()) {
//                Toast.makeText(LoginActivity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
//            } else {
//                // Chỗ này sẽ xử lý đăng nhập Firebase sau
//                Toast.makeText(LoginActivity.this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}
