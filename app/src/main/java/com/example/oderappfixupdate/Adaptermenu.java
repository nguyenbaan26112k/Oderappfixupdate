package com.example.oderappfixupdate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Adaptermenu extends RecyclerView.Adapter<Adaptermenu.Viewhoder> {
    private static Locale localeEN = new Locale("en", "EN");
    private static NumberFormat en = NumberFormat.getInstance(localeEN);
    List<Dish> dishList = new ArrayList<>();
    IonClickContact ionClickContact;

    public Adaptermenu(List<Dish> dishList) {
        this.dishList = dishList;
    }

    public void setIonClickContact(IonClickContact ionClickContact) {
        this.ionClickContact = ionClickContact;
    }

    @NonNull
    @Override
    public Adaptermenu.Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_menu,parent,false);
        Viewhoder viewhoder = new Viewhoder(view);
        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull final Adaptermenu.Viewhoder holder, final int position) {
        final Dish dish = dishList.get(position);
        holder.tvName.setText(dish.getName());
        holder.tvPrice.getText().toString().replace("Đ","");
        holder.tvPrice.setText(en.format(dish.getPrice())+"Đ");
        if (dish.getImg().toString().compareTo("Pizza")==0)
        {
            holder.avatar.setImageResource(R.drawable.pizza);
        }
        else if (dish.getImg().toString().compareTo("Spaghetti")==0)
        {
            holder.avatar.setImageResource(R.drawable.spaghetti);
        }
        else if (dish.getImg().toString().compareTo("nước cam")==0)
        {
            holder.avatar.setImageResource(R.drawable.nuoccam);
        }
        else if (dish.getImg().toString().compareTo("Coca")==0)
        {
            holder.avatar.setImageResource(R.drawable.coca);
        }
        else if (dish.getImg().toString().compareTo("Bánh Mì")==0)
        {
            holder.avatar.setImageResource(R.drawable.banhmi);
        }
        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ionClickContact.onClickName(dish);
            }
        });
        holder.avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ionClickContact.onClickAvatar(dish);

            }
        });
    }

    @Override
    public int getItemCount() {
        return dishList.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {
        TextView tvName,tvPrice;
        ImageView avatar;
        RelativeLayout relativeLayout;
        public Viewhoder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            avatar = itemView.findViewById(R.id.avatar);
            relativeLayout = itemView.findViewById(R.id.contentheader);
        }
    }
}
