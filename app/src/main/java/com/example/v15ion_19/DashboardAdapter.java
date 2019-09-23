package com.example.v15ion_19;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.MyViewHolder> {

    private List<ModelDashboard> models;
    private Context context;

    public DashboardAdapter(final List<ModelDashboard> models, final Context context) {
        this.models = models;
        this.context = context;
//        Log.v("size$$$$$$$$$$$$$$$","" + models.size());
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(context).inflate(R.layout.card1, parent,false);
        MyViewHolder cvh = new MyViewHolder(cardView);
        Log.i("viewType$$$$$$$$$$$",""+ viewType);
        Log.v("viewType$$$$$$$$$$$",""+ viewType);
        System.out.println(viewType);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.balance.setText(models.get(position).getBalance());
        holder.cardNumber.setText(models.get(position).getCardNumber());
        holder.cardType.setText(models.get(position).getCardType());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView balance;
        TextView cardNumber;
        TextView cardType;
        public MyViewHolder(View view) {
            super(view);
            this.balance = view.findViewById(R.id.balance);
            this.cardNumber = view.findViewById(R.id.cardNumber);
            this.cardType = view.findViewById(R.id.cardType);
        }
    }
}
