package com.example.mathstables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("general", "Button is working");
//                Toast.makeText(MainActivity.this, "This btn is working", Toast.LENGTH_SHORT).show();
                String userNum = editText.getText().toString();
                int num = Integer.parseInt(userNum);
                textView.setText(num + " x 1   =  " + num * 1 +" \n" +num + " x 2   =  " + num * 2 +" \n" +num + " x 3   =  " + num * 3 +" \n" +num + " x 4   =  " + num * 4 +" \n" +num + " x 5   =  " + num * 5 +" \n" +num + " x 6   =  " + num * 6 +" \n" +num + " x 7   =  " + num * 7 +" \n" +num + " x 8   =  " + num * 8 +" \n" +num + " x 9   =  " + num * 9 +" \n" +num + " x 10 =  " + num * 10 +" \n");
            }
        });
    }
}