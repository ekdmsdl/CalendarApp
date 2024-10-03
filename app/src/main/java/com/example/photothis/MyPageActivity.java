package com.example.photothis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MyPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);

        //하단 메뉴바
        ImageButton calendarMenuButton = findViewById(R.id.calendarMenuButton);
        ImageButton todoListMenuButton = findViewById(R.id.todoListMenuButton);

        calendarMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        todoListMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, TodoListActivity.class);
                startActivity(intent);
            }
        });

        //버튼
        Button setReminderButton = findViewById(R.id.setReminderButton); // 알림 설정 버튼
        Button statisticsButton = findViewById(R.id.statisticsButton); // 통계 버튼
        Button diarySummaryButton = findViewById(R.id.diarySummaryButton);  // 요약 버튼
        Button contactAdminButton = findViewById(R.id.contactAdminButton); // 문의하기 버튼
        Button disconnectNaverButton = findViewById(R.id.disconnectNaverButton); // 네이버 연동 해제 버튼

        // 버튼 연결
        // 1. 알림 설정
        setReminderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, SetReminderActivity.class);
                startActivity(intent);
            }
        });

        // 2. 통계
        statisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, MonthlyStatActivity.class);
                startActivity(intent);
            }
        });

        // 3. 요약
        diarySummaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, DiarySummaryActivity.class);
                startActivity(intent);
            }
        });

        // 4. 문의하기
        contactAdminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, ContactAdminActivity.class);
                startActivity(intent);
            }
        });

        // 5. 네이버 연동 해제
        disconnectNaverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, DisconnectNaverActivity.class);
                startActivity(intent);
            }
        });
    }
}
