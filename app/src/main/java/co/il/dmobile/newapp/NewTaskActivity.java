package co.il.dmobile.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText title = findViewById(R.id.title_e);
                EditText desc = findViewById(R.id.desc);
                Task task = new Task(title.getText().toString(),desc.getText().toString());
                Intent i = new Intent();
                i.putExtra("task",task);
                setResult(1,i);
                finish();

            }
        });

    }
}