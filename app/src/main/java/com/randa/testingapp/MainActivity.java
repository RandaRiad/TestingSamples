package com.randa.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {

    TextView  text2, decryptTextView;
    EditText text1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.textranda);
        text2=findViewById(R.id.textViewranda);
        decryptTextView=findViewById(R.id.textViewdecrypt);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // text2.setText(crypto(text1.getText().toString()));
               ;
                decryptTextView.setText(decrypt( crypto(text1.getText().toString())));
            }
        });
    }

    private byte[] crypto(String text)  {
        byte[] message = text.getBytes() ;
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = md.digest(message);

        return digest;

    }

    private String decrypt(byte [] txtBytes){
        StringBuilder sb = new StringBuilder();
        for (byte b : txtBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}