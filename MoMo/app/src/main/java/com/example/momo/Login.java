package com.example.momo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button btndn;
    private EditText edtdn;
    private EditText edtmk;
    private ProgressBar pbXyLy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btndn = (Button) findViewById(R.id.btdn);
        edtdn = (EditText) findViewById(R.id.etdn);
        edtmk = (EditText) findViewById(R.id.etmk);
        pbXyLy = (ProgressBar) findViewById(R.id.progressBar);
        btndn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtdn.getText().toString().equals("312") && edtmk.getText().toString().equals("hien")){
                    CountDownTimer countDownTimer = new CountDownTimer(900,100) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            int  cur = pbXyLy.getProgress();
                            if(cur >= pbXyLy.getMax()){
                                cur = 0;
                            }
                            pbXyLy.setProgress(cur+40);
                        }
                        @Override
                        public void onFinish() {
                            Intent intent = new Intent(Login.this, MainActivity.class);
                            startActivity(intent);
                        }
                    }.start();
                }else{
                    CountDownTimer countDownTimer = new CountDownTimer(900,100) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            int  cur = pbXyLy.getProgress();
                            if(cur >= pbXyLy.getMax()){
                                cur = 0;
                            }
                            pbXyLy.setProgress(cur+40);
                        }
                        @Override
                        public void onFinish() {
                            Toast.makeText(getApplicationContext(), "Vui lòng kiểm tra lại tài khoản và mật khẩu !!",Toast.LENGTH_LONG).show();
                        }
                    }.start();
                }
            }
        });
    }
}