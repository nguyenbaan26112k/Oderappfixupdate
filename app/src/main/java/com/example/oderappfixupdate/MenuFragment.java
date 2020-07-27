package com.example.oderappfixupdate;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuFragment extends Fragment {
    List<Dish> dishList;
    Dish dish1, dish2, dish3, dish4, dish5;
    RecyclerView menu;
    Adaptermenu adaptermenu;
    TextView textView,textView2,textView3,textView4,textView5,textView6;
    public static void xoangoac(String s)
    {
        s.replace("(","").replace(")","");
    }
    public static MenuFragment newInstance() {

        Bundle args = new Bundle();

        MenuFragment fragment = new MenuFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.menufood, container, false);

        menu = view.findViewById(R.id.menu);
        dishList = new ArrayList<>();
        textView = view.findViewById(R.id.Amount);
        textView2 = view.findViewById(R.id.pizza);
        textView3 = view.findViewById(R.id.Spagetti);
        textView4 = view.findViewById(R.id.nuoccam);
        textView5 = view.findViewById(R.id.coca);
        textView6 = view.findViewById(R.id.banhmi);


        dish1 = new Dish("Pizza", "Pizza", 0, 50000);
        dish2 = new Dish("Spaghetti", "Spaghetti", 0, 100000);
        dish3 = new Dish("Nước cam", "Nước cam", 0, 30000);
        dish4 = new Dish("Coca", "Coca", 0, 20000);
        dish5 = new Dish("Bánh Mì", "Bánh Mì", 0, 60000);

        dishList.add(dish1);
        dishList.add(dish2);
        dishList.add(dish3);
        dishList.add(dish4);
        dishList.add(dish5);

        adaptermenu = new Adaptermenu(dishList);

        adaptermenu.setIonClickContact(new IonClickContact() {
            @Override
            public void onClickName(Dish dish) {


                if (dish.getImg().toString().compareTo("Pizza")==0)
                {
                    xoangoac(textView2.getText().toString());
                    textView2.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("Spaghetti")==0)
                {
                    xoangoac(textView3.getText().toString());
                    textView3.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("nước cam")==0)
                {
                    xoangoac(textView4.getText().toString());
                    textView4.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("Coca")==0)
                {
                    xoangoac(textView5.getText().toString());
                    textView5.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("Bánh Mì")==0)
                {
                    xoangoac(textView6.getText().toString());
                    textView6.setText("("+String.valueOf(dish.getAmount())+")");
                }


                int d = dish.getAmount();
                dish.setAmount(dish.getAmount() + 1);
                if (d < dish.getAmount()) {
                    textView.setText(String.valueOf(Integer.valueOf(textView.getText().toString())+1));
                    Toast.makeText(view.getContext(), "Bạn chọn món " + dish.getName() + " thành công", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(view.getContext(), "Bạn chọn món " + dish.getName() + "không thành công", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onClickAvatar(Dish dish) {

                if (dish.getImg().toString().compareTo("Pizza")==0)
                {
                    xoangoac(textView2.getText().toString());
                    textView2.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("Spaghetti")==0)
                {
                    xoangoac(textView3.getText().toString());
                    textView3.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("nước cam")==0)
                {
                    xoangoac(textView4.getText().toString());
                    textView4.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("Coca")==0)
                {
                    xoangoac(textView5.getText().toString());
                    textView5.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("Bánh Mì")==0)
                {
                    xoangoac(textView6.getText().toString());
                    textView6.setText("("+String.valueOf(dish.getAmount())+")");
                }



                int d = dish.getAmount();
                dish.setAmount(dish.getAmount() + 1);
                if (d < dish.getAmount()) {
                    textView.setText(String.valueOf(Integer.valueOf(textView.getText().toString())+1));
                    Toast.makeText(view.getContext(), "Bạn chọn món " + dish.getName() + " thành công", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(view.getContext(), "Bạn chọn món " + dish.getName() + " không thành công thành công", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onClickItem(Dish dish) {


                if (dish.getImg().toString().compareTo("Pizza")==0)
                {
                    xoangoac(textView2.getText().toString());
                    textView2.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("Spaghetti")==0)
                {
                    xoangoac(textView3.getText().toString());
                    textView3.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("nước cam")==0)
                {
                    xoangoac(textView4.getText().toString());
                    textView4.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("Coca")==0)
                {
                    xoangoac(textView5.getText().toString());
                    textView5.setText("("+String.valueOf(dish.getAmount())+")");
                }
                else if (dish.getImg().toString().compareTo("Bánh Mì")==0)
                {
                    xoangoac(textView6.getText().toString());
                    textView6.setText("("+String.valueOf(dish.getAmount())+")");
                }


                int d = dish.getAmount();
                dish.setAmount(dish.getAmount() + 1);
                if (d < dish.getAmount()) {
                    textView.setText(String.valueOf(Integer.valueOf(textView.getText().toString())+1));
                    Toast.makeText(view.getContext(), "Bạn chọn món " + dish.getName() + " thành công", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(view.getContext(), "Bạn chọn món " + dish.getName() + " không thành công", Toast.LENGTH_LONG).show();
                }

            }
        });

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(view.getContext(), 2, RecyclerView.VERTICAL, false);

        menu.setLayoutManager(layoutManager);
        menu.setAdapter(adaptermenu);
        return view;
    }

}
