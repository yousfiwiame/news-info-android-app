package com.example.monactivit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityLogin extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onClick(View v) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button b1=findViewById(R.id.envoyer);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                traiter(v);
            }
        });
    }

    public void traiter(View view){
        EditText login=findViewById(R.id.saisilogin);
        String loginText=login.getText().toString();

        EditText password=findViewById(R.id.saisipassword);
        String passwordText=password.getText().toString();

        TextView textlogin_error=findViewById(R.id.textlogin_error);
        String textlogin_errorText=textlogin_error.getText().toString();

        TextView textpwd_error=findViewById(R.id.textpwd_error);
        String textpwd_errorText=textpwd_error.getText().toString();

        if(loginText.equals("wiame") && passwordText.equals("wiame")){
            Intent intent=new Intent(this, MainActivityNews.class);
            intent.putExtra("wiame",loginText);
            startActivity(intent);
            finish();
        }else{
            if(!loginText.equals("wiame")){
                textlogin_error.setText("Login incorrect");
            }else{
                textlogin_error.setText("");
            }
            if(!passwordText.equals("wiame")){
                textpwd_error.setText("Mot de passe incorrect");
            }else{
                textpwd_error.setText("");
            }

    }
}

}