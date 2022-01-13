package com.capstone.pakigsabotbusinessowner.Chatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.capstone.pakigsabotbusinessowner.R;
import com.capstone.pakigsabotbusinessowner.Services.ServicesSpaSalon;

public class ChatbotConversation2 extends AppCompatActivity {

    TextView homeMenuTxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot_conversation2);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            if(bundle.getString("chatbotConvo2") != null){
                Toast.makeText(getApplicationContext(), "data: " + bundle.getString("chatbotConvo2"),
                        Toast.LENGTH_SHORT).show();
            }
        }

        //References:
        refs();

        homeMenuTxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chatbotConvo3();
            }
        });
    }

    public void refs(){
        homeMenuTxt2 = findViewById(R.id.homeMenuTxt2);
    }

    private void chatbotConvo3(){
        Intent intent = new Intent(getApplicationContext(), ChatbotConversation3.class);
        startActivity(intent);
    }
}