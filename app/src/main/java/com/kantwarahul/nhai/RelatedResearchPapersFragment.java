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


public class RelatedResearchPapersFragment extends Fragment {
    private ArrayList<String> arrayList = new ArrayList<>();
    private Integer Indx = 0;
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_related_research_papers,container,false);
        try {
            Indx = getArguments().getInt("indx");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        textView = view.findViewById(R.id.text_view);
        arrayList.add("Longitudinal Cracking in Widened\n" +
                "Portland Cement Concrete Pavements \nSamuel Owusu-Ababio, Ph.D., P.E.\n" +
                "Robert Schmitt, Ph.D., P.E.\n" +
                "\n" +
                "Department of Civil and Environmental Engineering\n" +
                "University of Wisconsin - Platteville");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        textView.setText(arrayList.get(Indx));
        return view;
    }
}