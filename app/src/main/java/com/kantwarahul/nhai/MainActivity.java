package com.kantwarahul.nhai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private List<Data> dataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList = new ArrayList<>();
        Data data = new Data(R.drawable.n_1,"Longitudinal Cracks","Longitudinal cracking is cracking in the surface of road that runs longitudinally along the pavement. It can consist of a single crack or as a series of parallel cracks.");
        Data data1 = new Data(R.drawable.n_2,"Alligator/Fatigue Cracking","Fatigue cracking is an asphalt pavement distress most often instigated by failure of the surface due to traffic loading. However, fatigue cracking can be greatly influenced by environmental and other effects while traffic loading remains the direct cause.");
        Data data2 = new Data(R.drawable.n_3,"Shrinkage Cracking/Block Cracking","These types of cracking are interconnected cracks that divide the pavement up into rectangular Pieces. These are hairline cracks that are less than 2m in length. They do not cross the entire slab. The setting and curing process of the concrete slab results in such cracks. Improper curing can also create shrinkage cracks in rigid pavements.");
        Data data3 = new Data(R.drawable.n_4,"Transverse Cracks","A transverse crack, as its name suggests, is a crack that extends along the cross-section of a material or object, usually perpendicular to its centerline. It is typically the result of axial loading from external forces or shrinkage due to temperature changes.");
        Data data4 = new Data(R.drawable.n_5,"Potholes","A pothole is a large hole in the surface of a road, caused by traffic and bad weather. Potholes often lead to underground caves and tunnels.");
        Data data5 = new Data(R.drawable.n_6,"Raveling/Weathering","Raveling is the disintegration of an asphalt road surface. It is due to the dislodgment of the aggregate materials (gravel, sand, and crushed stone). It reduces skid resistance, roughens the road surface, and exposes the layers underneath to further deterioration.");
        dataList.add(data);
        dataList.add(data1);
        dataList.add(data2);
        dataList.add(data3);
        dataList.add(data4);
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new Adapter(this,dataList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

    }
}