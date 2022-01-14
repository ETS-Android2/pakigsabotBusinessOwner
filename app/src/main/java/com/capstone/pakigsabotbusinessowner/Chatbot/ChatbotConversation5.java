package com.capstone.pakigsabotbusinessowner.Chatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.capstone.pakigsabotbusinessowner.R;

public class ChatbotConversation5 extends AppCompatActivity {

    TextView homeMenuTxt2CC5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot_conversation5);

        //References:
        refs();

        homeMenuTxt2CC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chatbotConversation6();
            }
        });
    }

    public void refs(){
        homeMenuTxt2CC5 = findViewById(R.id.homeMenuTxt2CC5);
    }

    private void chatbotConversation6(){
        Intent intent = new Intent(getApplicationContext(), ChatbotConversation6.class);
        startActivity(intent);
    }
}