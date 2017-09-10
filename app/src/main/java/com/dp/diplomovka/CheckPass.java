package com.dp.diplomovka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CheckPass extends AppCompatActivity {
    EditText pass;
    TextView text;
    Integer count;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_pass);

        password = getIntent().getStringExtra("password");
        Button btn2 = (Button) findViewById(R.id.button2);
        text = (TextView) findViewById(R.id.editText3);
        pass = (EditText) findViewById(R.id.editText2);
        btn2.setOnClickListener(onClick);
        count = 1;

    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(password.equals(pass.getText().toString())) {
                Toast.makeText(v.getContext(), "GG", Toast.LENGTH_SHORT).show();
                count++;
                if (count >= 10) {
                    //intent dalej
                }
                text.setText("Zadaj heslo " + count + "/10.");
            }
            else {
                Toast.makeText(v.getContext(), "BB", Toast.LENGTH_SHORT).show();
            }
//            Intent i = new Intent(v.getContext(), CheckPass.class);
//            i.putExtra("password", pass.getText().toString());
//            startActivity(i);
        }
    };
}
