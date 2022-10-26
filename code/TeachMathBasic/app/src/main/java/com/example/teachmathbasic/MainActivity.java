package com.example.teachmathbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvMessage;
    private EditText etName,etPassword;
    private Button btnSignin;
    private String name,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=etName.getText()+"";
                password=etPassword.getText()+"";

                if(name.equals("Edgar")&&password.equals("123")){
                    tvMessage.setText("Welcome: "+name);
                }else{
                    Toast.makeText(MainActivity.this,"Password or username not right",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void initView(){
        tvMessage=findViewById(R.id.tv_message);
        etName=findViewById(R.id.et_name);
        etPassword=findViewById(R.id.et_password);
        btnSignin=findViewById(R.id.btn_signin);
    }
}