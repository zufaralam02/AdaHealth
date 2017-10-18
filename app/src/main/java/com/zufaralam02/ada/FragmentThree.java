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
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentThree extends Fragment {
    Button btn3_1, btn3_2;
    EditText edt3;
    TextView txt3_1, txt3_2;


    public FragmentThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_three, container, false);

        btn3_1 = (Button) view.findViewById(R.id.btn3_1);
        btn3_2 = (Button) view.findViewById(R.id.btn3_2);
        edt3 = (EditText) view.findViewById(R.id.edt3);
        txt3_1 = (TextView) view.findViewById(R.id.txt3_1);
        txt3_2 = (TextView) view.findViewById(R.id.txt3_2);

        animationWidget();

        btn3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = edt3.getText().toString();

                if (email.isEmpty()) {
                    edt3.setError("tidak boleh kosong");
                } else {

                    FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                    FragmentFive fragmentFive = new FragmentFive();
                    Bundle bundle = new Bundle();
                    bundle.putString("email", email);
                    fragmentTransaction.replace(R.id.container, fragmentFive);
                    fragmentFive.setArguments(bundle);
                    fragmentTransaction.commit();
                    fragmentTransaction.addToBackStack(null);

                }

            }
        });

        return view;
    }

    private void animationWidget() {
        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);

        btn3_1.setAnimation(animation);
        btn3_2.setAnimation(animation);
        edt3.setAnimation(animation);
        txt3_1.setAnimation(animation);
        txt3_2.setAnimation(animation);
    }


}
