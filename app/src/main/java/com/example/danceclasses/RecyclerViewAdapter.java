package com.example.danceclasses;

import android.content.Context;
import android.content.Intent;
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

    private String[] Titles = new String[10];
    private String[] Descriptions = new String[10];

    String[] LongDescs = new String[]{
            "placeholder1",
            "placeholder2",
            "placeholder3",
            "placeholder4",
            "placeholder5",
            "placeholder6",
            "placeholder7",
            "placeholder8",
            "placeholder9",
            "placeholder10",
    };

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
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.title.setText(Titles[position]);
        holder.description.setText(Descriptions[position]);

        holder.listLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Log.d(TAG,
                // Toast.makeText.... ?

                Intent intent = new Intent(mcontext, DetailsActivity.class);
                intent.putExtra("title", Titles[position]);
                intent.putExtra("long_description", LongDescs[position]);
                mcontext.startActivity(intent);
            }
        });
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
