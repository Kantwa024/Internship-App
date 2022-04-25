package com.kantwarahul.nhai;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AmericanFragment extends Fragment {
    private ArrayList<String> arrayList = new ArrayList<>();
    private Integer Indx = 0;
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_american,container,false);
        try {
            Indx = getArguments().getInt("indx");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        textView = view.findViewById(R.id.text_view);
        arrayList.add("Treatment of these cracks depend on the severity and intensity. In the case of low severity nothing is there but in the medium severity resort to fill the cracks. In the case of high severity use overlays surface, or implementing a thin overlay.");
        arrayList.add("Treatment based on the severity and intensity of cracks starting using overlays, surface patching or reconstruction.");
        arrayList.add("Treatment based on the severity and intensity of cracks starting using overlays, surface patching or re-construction.");
        arrayList.add("Treatments to these cracks depend on the severity and intensity. In the case of low severity, doing something in the medium severity resort to fill the cracks leads to worse. In the case of high severity use overlays surface, or implementing to thin overlay");
        arrayList.add("The treatments are surface patching or deep depending on depth of the hole. No matter what cure is chosen, it is important to fix the situation which caused the pothole.");
        arrayList.add("If the cause is superficial, a surface treatment will solve the problem. If poor drainage is causing a stripping problem, the drainage should be corrected.");
        textView.setText(arrayList.get(Indx));
        return view;
    }
}