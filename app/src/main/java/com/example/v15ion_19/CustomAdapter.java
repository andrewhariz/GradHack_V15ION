package com.example.v15ion_19;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class CustomAdapter extends PagerAdapter {

    List<ModelDashboard> models;
    Context context;
    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==((LinearLayout) object);
    }

    CustomAdapter(List<ModelDashboard> models, Context context){
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View cardView = LayoutInflater.from(context).inflate(R.layout.card1, container,false);

        TextView balance = cardView.findViewById(R.id.balance);
        TextView cardNumber = cardView.findViewById(R.id.cardNumber);
        TextView cardType = cardView.findViewById(R.id.cardType);

        balance.setText("$ " + models.get(position).getBalance());
        cardNumber.setText(models.get(position).getCardNumber());
        cardType.setText(models.get(position).getCardType());

        container.addView(cardView, 0);
        return cardView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
