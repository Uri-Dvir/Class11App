package co.il.dmobile.newapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {

    List<Task> tasks;

    public TaskAdapter()
    {
        tasks = new ArrayList<>();
        tasks.add(new Task("Trash","Take it out"));
    }

    public void AddTask(Task task)
    {
        tasks.add(task);
        notifyDataSetChanged();
    }

    public void DeleteTask(int pos)
    {
        tasks.remove(pos);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_layout,parent,false);
        TaskViewHolder vh = new TaskViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = tasks.get(position);
        holder.checkbox.setText(task.getTitle());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),DetailsActivity.class);
                i.putExtra("task",task);
                view.getContext().startActivity(i);
            }
        });
        holder.checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                task.setDone(b);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
