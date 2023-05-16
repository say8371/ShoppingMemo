package com.myiy.shoppingmemo.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.myiy.shoppingmemo.R;
import com.myiy.shoppingmemo.main.model.ShoppingList;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private ArrayList<ShoppingList> mData = null;
    private OnItemLongClickListener mListener = null;

    public void MainAdapter(ArrayList<ShoppingList> data) {
        mData = data;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener listener) {
        this.mListener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.adapter_main, parent, false);
        MainAdapter.ViewHolder viewHolder = new MainAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ShoppingList item = mData.get(position);

        holder.pumNameTextView.setText(item.getPumName());
        holder.amtEditText.setText(Long.toString(item.getAmt()));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(View v, Long id);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        AppCompatTextView pumNameTextView;
        AppCompatEditText amtEditText;
        AppCompatButton urlButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            pumNameTextView = itemView.findViewById(R.id.pumNameTextView);
            amtEditText = itemView.findViewById(R.id.amtEditText);
            urlButton = itemView.findViewById(R.id.urlButton);

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    return false;
                }
            });
        }
    }
}
