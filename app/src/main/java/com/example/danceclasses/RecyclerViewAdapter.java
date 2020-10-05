package com.example.danceclasses;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";

    private String[] Titles = new String[6];
    private String[] Descriptions = new String[6];
    private Context mcontext;

    public RecyclerViewAdapter(Context mcontext, String[] TitlesArray, String[] DescriptionsArray) {
        this.Titles = TitlesArray;
        this.Descriptions = DescriptionsArray;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_layout,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.title.setText(Titles[position]);
        holder.description.setText(Descriptions[position]);
    }

    @Override
    public int getItemCount() { return Titles.length; }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        LinearLayout listLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.listTitle);
            description = itemView.findViewById(R.id.listDescription);
            listLayout = itemView.findViewById(R.id.listItemLayout);
        }
    }
}
