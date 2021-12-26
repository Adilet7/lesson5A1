package com.example.lesson5a1.SecondFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.lesson5a1.R;
import com.example.lesson5a1.fragment.first_fragment.First_Fragment;

public class SecondFragment extends Fragment {
    EditText etInput;
    Button btnData;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seccond_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etInput = view.findViewById(R.id.et_input);
        btnData = view.findViewById(R.id.btn_data);
        listener();
        getData();
    }

    private void listener() {
        btnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = etInput.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("Key", title);
                First_Fragment first_fragment = new First_Fragment();
                first_fragment.setArguments(bundle);
                getParentFragmentManager().beginTransaction().replace(R.id.container_fragment, first_fragment).commit();

            }
        });

    }

    private void getData() {
        if (getArguments() != null) {
            String s = getArguments().getString("KeyA");
            etInput.setText(s);
        }
    }
}
