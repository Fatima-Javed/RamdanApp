package com.example.ramadan_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    Context context;
    private RecyclerViewClickListener listener;
    ArrayList<contact>Contacts=new ArrayList<>();
    RecyclerAdapter(Context context, ArrayList<contact> Contacts)
    {
        this.context=context;
        this.Contacts=Contacts;
    }

    public RecyclerAdapter(Context context, List<contact> Contacts) {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(context).inflate(R.layout.contact_view,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }



    @Override
    public int getItemCount() {
        return Contacts.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View view,int position);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {

        holder.txt_name.setText(Contacts.get(i).Name);
        holder.txt_day.setText(Contacts.get(i).Day);
        holder.txt_suhoor.setText(Contacts.get(i).Suhoor);
        holder.txt_iftar.setText(Contacts.get(i).Iftar);
    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {

        public TextView txt_name;
        TextView txt_day;
        TextView txt_suhoor;
        TextView txt_iftar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_name= itemView.findViewById(R.id.textView1);
            txt_day= itemView.findViewById(R.id.textView2);
            txt_suhoor= itemView.findViewById(R.id.textView3);
            txt_iftar= itemView.findViewById(R.id.textView4);
        }


    }
}
