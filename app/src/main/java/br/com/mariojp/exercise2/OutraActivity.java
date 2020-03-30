package br.com.mariojp.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class OutraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outra);
    }

    public void btnConfirm(View view) {
        EditText txt = findViewById(R.id.editText);
        TextView txtVi = findViewById(R.id.textView);
        Intent inti = new Intent(this, MainActivity.class);

        if(txt.getText().toString() == "") {
            txtVi.setText("Oi!");
        } else {
            txtVi.setText("Oi, " + txt.getText().toString());
        }
        startActivity(inti);
    }

    public void btnCancel(View view) {
        Intent inti = new Intent(this, MainActivity.class);
        startActivity(inti);
    }
}
