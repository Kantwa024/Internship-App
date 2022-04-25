package com.kantwarahul.nhai;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import java.util.HashMap;
import java.util.List;

class ItemViewHolder extends RecyclerView.ViewHolder
{
    public ImageView Image;
    public TextView textView,textView2;
    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        Image = itemView.findViewById(R.id.store_image);
        textView = itemView.findViewById(R.id.text_id);
        textView2 = itemView.findViewById(R.id.text_id_2);
    }
}

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    Activity activity;
    List<Data> items;

    public Adapter(Activity activity, List<Data> items)
    {
        this.activity = activity;
        this.items = items;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity)
                .inflate(R.layout.types_layout,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final ItemViewHolder viewHolder = (ItemViewHolder)holder;
        Data data = items.get(position);
        viewHolder.Image.setImageResource(data.getDrawableid());
        viewHolder.textView.setText(data.getType());
        viewHolder.textView2.setText(data.getAbout());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, TabActivity.class);
                intent.putExtra("indx",position);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}