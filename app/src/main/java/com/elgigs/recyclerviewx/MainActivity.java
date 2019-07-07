package com.elgigs.recyclerviewx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView newLeadsRecyclerView;
    NewLeadsAdapter newLeadsAdapter;
    List<NewLeads> myListHai = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newLeadsRecyclerView = findViewById(R.id.new_leads_recycler_view);
        putDataOnArrayList();
        newLeadsAdapter = new NewLeadsAdapter(MainActivity.this, myListHai);
        newLeadsRecyclerView.setAdapter(newLeadsAdapter);
        newLeadsRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, RecyclerView.HORIZONTAL, false));

    }

    public void putDataOnArrayList(){
        for (int i = 0; i < 12; i++) {
            NewLeads newLeads = new NewLeads();

            switch (i) {
                case 0:
                    newLeads.serviceKaName = "Head and Shoulders Massage";
                    newLeads.customerKaName = "Sahil Khan";
                    newLeads.serviceKaTime = "16:00PM";
                    myListHai.add(newLeads);
                    break;

                case 1:
                    newLeads.serviceKaName = "Plumber";
                    newLeads.customerKaName = "Asif Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;
                case 2:
                    newLeads.serviceKaName = "Graphics Designer";
                    newLeads.customerKaName = "Mahira Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;
                case 3:
                    newLeads.serviceKaName = "Cleaner";
                    newLeads.customerKaName = "Sahil Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;
                case 4:
                    newLeads.serviceKaName = "Maid";
                    newLeads.customerKaName = "Asif Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;
                case 5:
                    newLeads.serviceKaName = "Cook";
                    newLeads.customerKaName = "Mahira Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;
                case 6:
                    newLeads.serviceKaName = "Haircut";
                    newLeads.customerKaName = "Sahil Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;
                case 7:
                    newLeads.serviceKaName = "Plumber";
                    newLeads.customerKaName = "Asif Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;
                case 8:
                    newLeads.serviceKaName = "Plumber";
                    newLeads.customerKaName = "Asif Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;
                case 9:
                    newLeads.serviceKaName = "Plumber";
                    newLeads.customerKaName = "Asif Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;
                case 10:
                    newLeads.serviceKaName = "Plumber";
                    newLeads.customerKaName = "Asif Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;
                case 11:
                    newLeads.serviceKaName = "Plumber";
                    newLeads.customerKaName = "Asif Khan";
                    newLeads.serviceKaTime = "11:00AM";
                    myListHai.add(newLeads);
                    break;

                    default:
                        newLeads.serviceKaName = "Plumber";
                        newLeads.customerKaName = "Asif Khan";
                        newLeads.serviceKaTime = "11:00AM";
                        myListHai.add(newLeads);
                        break;

            }
        }
    }
}
