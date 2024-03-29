package com.capstone.pakigsabotbusinessowner.CancelReservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.capstone.pakigsabotbusinessowner.CancelReservation.CancellationSuccess;
import com.capstone.pakigsabotbusinessowner.R;

public class CancellationReason extends AppCompatActivity {

    ImageView submit, close, cancelAction, detailRect;
    TextView cancelRsrvTxt, dateTxtCancelRsrv,jan11TxtCancelRsrv,timeTxtCancelRsrv,pmTxtCancelRsrv,
            customerNameTxtCancelRsrv,janeTxtCancelRsrv,reservedTxtCancelRsrv,terraceTxtCancelRsrv,
            rfTxtCancelRsrv,pesosTxtCancelRsrv,rIDTxtCancelRsrv,idTxtCancelRsrv,confirmTxt,cancelTxt,pleaseTxt;
    EditText cancelReasonEditTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancellation_reason);

        refs();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancelSuccess();
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                close();
            }
        });

        cancelAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void refs(){
        submit = findViewById(R.id.submitImageView);
        close = findViewById(R.id.closeImageViewCancelReason);
        cancelAction = findViewById(R.id.cancelActionCancelReason);
        detailRect = findViewById(R.id.detail_rectCancelReason);
        cancelRsrvTxt = findViewById(R.id.cancelRsrvTxtCReason);
        dateTxtCancelRsrv = findViewById(R.id.dateTxtCancelReason);
        jan11TxtCancelRsrv = findViewById(R.id.jan11TxtCancelReason);
        timeTxtCancelRsrv = findViewById(R.id.timeTxtCancelReason);
        pmTxtCancelRsrv = findViewById(R.id.pmTxtCancelReason);
        customerNameTxtCancelRsrv = findViewById(R.id.customerNameTxtCancelReason);
        janeTxtCancelRsrv = findViewById(R.id.janeTxtCancelReason);
        reservedTxtCancelRsrv = findViewById(R.id.reservedTxtCancelReason);
        terraceTxtCancelRsrv = findViewById(R.id.terraceTxtCancelReason);
        rfTxtCancelRsrv = findViewById(R.id.rfTxtCancelReason);
        pesosTxtCancelRsrv = findViewById(R.id.pesosTxtCancelReason);
        rIDTxtCancelRsrv = findViewById(R.id.rIDTxtCancelReason);
        idTxtCancelRsrv = findViewById(R.id.idTxtCancelReason);
        confirmTxt = findViewById(R.id.confirmTxtCancelReason);
        cancelTxt = findViewById(R.id.cancelActionTxtCancelReason);
        cancelReasonEditTxt = findViewById(R.id.cancelReasonEditTxt);
        pleaseTxt = findViewById(R.id.pleaseTxt);
    }

    public void cancelSuccess(){
        Intent intent = new Intent(getApplicationContext(), CancellationSuccess.class);
        startActivity(intent);
    }

    public void onBackPressed(){
        super.onBackPressed();
    }

    public void close(){
        detailRect.setVisibility(View.INVISIBLE);
        close.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);
        cancelAction.setVisibility(View.INVISIBLE);
        cancelRsrvTxt.setVisibility(View.INVISIBLE);
        dateTxtCancelRsrv.setVisibility(View.INVISIBLE);
        jan11TxtCancelRsrv.setVisibility(View.INVISIBLE);
        timeTxtCancelRsrv.setVisibility(View.INVISIBLE);
        pmTxtCancelRsrv.setVisibility(View.INVISIBLE);
        customerNameTxtCancelRsrv.setVisibility(View.INVISIBLE);
        janeTxtCancelRsrv.setVisibility(View.INVISIBLE);
        reservedTxtCancelRsrv.setVisibility(View.INVISIBLE);
        terraceTxtCancelRsrv.setVisibility(View.INVISIBLE);
        rfTxtCancelRsrv.setVisibility(View.INVISIBLE);
        pesosTxtCancelRsrv.setVisibility(View.INVISIBLE);
        rIDTxtCancelRsrv.setVisibility(View.INVISIBLE);
        idTxtCancelRsrv.setVisibility(View.INVISIBLE);
        confirmTxt.setVisibility(View.INVISIBLE);
        cancelTxt.setVisibility(View.INVISIBLE);
        cancelReasonEditTxt.setVisibility(View.INVISIBLE);
        pleaseTxt.setVisibility(View.INVISIBLE);
    }
}