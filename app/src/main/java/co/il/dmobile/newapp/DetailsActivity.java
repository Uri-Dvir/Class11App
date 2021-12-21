package co.il.dmobile.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b = getIntent().getExtras();
        Task task = (Task) b.getSerializable("task");

        TextView title = findViewById(R.id.title);
        TextView desc = findViewById(R.id.desc);
        CheckBox done = findViewById(R.id.checkBox);

        title.setText(task.getTitle());
        desc.setText(task.getDescription());
        done.setChecked(task.isDone());
    }
}