package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatViewAdapter extends RecyclerView.Adapter<CatViewAdapter.CatViewHolder> {


    Context context;
    List<Cat> data;

    CatAdapterListener listener;

    interface CatAdapterListener{
        public void CatRowClicked(Cat cat);
    }

    public CatViewAdapter(Context context, List<Cat> data,CatAdapterListener listener) {
        this.context = context;
        this.data = data;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View root = LayoutInflater.from(context).inflate(R.layout.planet_row_layout,parent,false);

        CatViewHolder holder = new CatViewHolder(root);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        holder.txtCatName.setText(data.get(position).getCatName());
        holder.imgPlanet.setImageResource(data.get(position).getImg());
        holder.root.setOnClickListener(v->{
            listener.CatRowClicked(data.get(position));


        });


        //holder.TxtViewPhone.setText(data.get(position).getOwnerPhone());
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    class CatViewHolder extends RecyclerView.ViewHolder{


        ConstraintLayout root;
        TextView txtCatName;


        ImageView imgPlanet;


        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            root = itemView.findViewById(R.id.planetrow);
            txtCatName = itemView.findViewById(R.id.txtPlanetName);
            imgPlanet = itemView.findViewById(R.id.imgPlanet);
        }

    }



}
