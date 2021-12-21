package co.il.dmobile.newapp;

import android.view.View;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class TaskViewHolder extends RecyclerView.ViewHolder {

    public CardView card;
    public CheckBox checkbox;

    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        card = itemView.findViewById(R.id.card);
        checkbox = itemView.findViewById(R.id.title);
    }
}
