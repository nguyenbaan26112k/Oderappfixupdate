package com.example.oderappfixupdate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {
    EditText pass;
    Button button;
    ImageView img;

    public static LoginFragment newInstance() {
        
        Bundle args = new Bundle();
        
        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.login_layout,container,false);
        pass = view.findViewById(R.id.textpassword);
        button = view.findViewById(R.id.buttonLogin);
        img = view.findViewById(R.id.imglock);
        int d = 0;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CheckPass.CheckPassword(pass.getText().toString()))
                {
                    Toast.makeText(view.getContext(),"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(view.getContext(),"Mật khẩu không hợp lệ",Toast.LENGTH_LONG).show();
                }
            }
        });
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               if ()
//            }
//        });
        return view;
    }
}
