package com.chanhee.project1115;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class SimpleTextAdapter extends RecyclerView.Adapter<SimpleTextAdapter.ViewHolder>{
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textview);
        }
    }
    private ArrayList<String> mdata=null;
    SimpleTextAdapter(ArrayList<String> list){
        mdata=null;
    }

    @NonNull
    @Override
    public SimpleTextAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=(LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= inflater.inflate(R.layout.reycle_item,parent,false);

        return new SimpleTextAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleTextAdapter.ViewHolder holder, int position) {
        String text=mdata.get(position);
        holder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }
}
