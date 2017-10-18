package com.zufaralam02.ada;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {
    Button btn2_1, btn2_2;
    TextView txt2;


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);

        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);

        txt2 = (TextView) view.findViewById(R.id.txt2);
        btn2_1 = (Button) view.findViewById(R.id.btn2_1);
        btn2_2 = (Button) view.findViewById(R.id.btn2_2);

        txt2.setAnimation(animation);
        btn2_1.setAnimation(animation);
        btn2_2.setAnimation(animation);

        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, new FragmentThree());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        btn2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, new FragmentFour());
                fragmentTransaction.commit();
                fragmentTransaction.addToBackStack(null);
            }
        });


        return view;
    }

}
