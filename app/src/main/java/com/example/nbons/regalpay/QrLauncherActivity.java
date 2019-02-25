package com.example.nbons.regalpay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class QrLauncherActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {


    private static final int REQUEST_CODE_QR_SCAN = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_launcher);


    }
}
