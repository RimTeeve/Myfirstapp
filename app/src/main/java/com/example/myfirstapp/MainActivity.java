package com.example.myfirstapp;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.example.myfirstapp.adapters.MealPlanAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mMealPlanRecyclerView;
    private RecyclerView.Adapter mMealPlanAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set main toolbar
        Toolbar main_toolbar = (Toolbar)findViewById(R.id.main_toolbar);
        setSupportActionBar(main_toolbar);
        getSupportActionBar().setTitle(R.string.app_name);

        // Set meal plan recyclerview
        String[] meals = {"Meal 1", "Meal 2", "Meal 3", "Meal 4"};
        mMealPlanRecyclerView = (RecyclerView) findViewById(R.id.plan_recyclerview);
        mMealPlanRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mMealPlanRecyclerView.setLayoutManager(mLayoutManager);
        mMealPlanAdapter = new MealPlanAdapter(meals);
        mMealPlanRecyclerView.setAdapter(mMealPlanAdapter);

        // Main activity Floating Action Button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.plan_add_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "FAB clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
