package com.example.myfirstapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myfirstapp.R;


public class MealPlanAdapter extends RecyclerView.Adapter<MealPlanAdapter.ViewHolder> {

    private String[] mMeals;

    public MealPlanAdapter(String[] meals) {
        mMeals = meals;
    }

    @Override
    public MealPlanAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.plan_item_row, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String meal = mMeals[position];
        holder.mTextView.setText(meal);
    }

    @Override
    public int getItemCount() {
        return mMeals.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        ViewHolder(View view) {
            super(view);

            mTextView = (TextView) view.findViewById(R.id.plan_item_label);
        }
    }
}
