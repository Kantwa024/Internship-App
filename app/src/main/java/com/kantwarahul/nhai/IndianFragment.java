package com.kantwarahul.nhai;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class IndianFragment extends Fragment {
    private ArrayList<String> arrayList = new ArrayList<>();
    private Integer Indx = 0;
    private TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_indian,container,false);
        try {
            Indx = getArguments().getInt("indx");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        textView = view.findViewById(R.id.text_view);
        arrayList.add("In case of structurally sound pavement the cracks should be filled with low viscosity bituminous binder. If the cracks are wide enough a slurry seal or sand bituminous premix patching is to be used to fill the cracks.\n" +
                "If the cracks are fine and extending over long distances, a light cut back or an emulsified bitumen (fog seal) can be broomed into the cracks.");
        arrayList.add("In case of structurally sound pavement the cracks should be filled with low viscosity bituminous binder. If the cracks are wide enough a slurry seal or sand bituminous premix patching is to be used to fill the cracks.\n" +
                "If the cracks are fine and extending over long distances, a light cut back or an emulsified bitumen (fog seal) can be broomed into the cracks.");
        arrayList.add("In case of structurally sound pavement the cracks should be filled with low viscosity bituminous binder. If the cracks are wide enough a slurry seal or sand bituminous premix patching is to be used to fill the cracks.\n" +
                "If the cracks are fine and extending over long distances, a light cut back or an emulsified bitumen (fog seal) can be broomed into the cracks.");
        arrayList.add("In case of structurally sound pavement the cracks should be filled with low viscosity bituminous binder. If the cracks are wide enough a slurry seal or sand bituminous premix patching is to be used to fill the cracks.\n" +
                "If the cracks are fine and extending over long distances, a light cut back or an emulsified bitumen (fog seal) can be broomed into the cracks.");
        arrayList.add("");
        arrayList.add("");
        textView.setText(arrayList.get(Indx));
        return view;
    }
}