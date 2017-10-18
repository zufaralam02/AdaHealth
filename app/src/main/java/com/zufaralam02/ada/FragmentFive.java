package com.zufaralam02.ada;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFive extends Fragment {
    TextView txt5;

    public FragmentFive() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_five, container, false);

        txt5 = (TextView) view.findViewById(R.id.txt5);

        Bundle bundle = getArguments();
        txt5.setText(String.valueOf(bundle.getString("email")));

        return view;
    }

}
