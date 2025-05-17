package com.example.chat_real_time;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private TextView nameText, emailText;
    private ImageView avatarImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameText = findViewById(R.id.text_profile_name);
        emailText = findViewById(R.id.text_profile_email);
        avatarImage = findViewById(R.id.image_profile_avatar);

        // Set dữ liệu mẫu (sau này bạn load từ Firebase hoặc SQLite)
        nameText.setText("Nguyễn Văn A");
        emailText.setText("nguyenvana@email.com");

        // Gắn click sự kiện
        findViewById(R.id.btn_edit_profile).setOnClickListener(view -> {
            Toast.makeText(this, "Chức năng chỉnh sửa chưa làm!", Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.btn_logout).setOnClickListener(view -> {
            Toast.makeText(this, "Bạn đã đăng xuất!", Toast.LENGTH_SHORT).show();
            // chuyển về màn hình login nếu muốn
        });
    }
}
