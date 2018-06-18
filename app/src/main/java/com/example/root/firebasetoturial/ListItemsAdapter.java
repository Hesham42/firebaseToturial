package com.example.root.firebasetoturial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemsAdapter extends RecyclerView.Adapter<ListItemsAdapter.ListItemsHolder> {
    private ArrayList<ListItem> mListItems;
    Context context;

    public ListItemsAdapter(ArrayList<ListItem> ListItems, Context context) {
        mListItems = ListItems;
        this.context = context;
    }


    @NonNull
    @Override
    public ListItemsHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.category_list_item_1, parent, false);

        return new ListItemsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemsHolder holder, int i) {

        ListItem s = mListItems.get(i);
        holder.bindData(s);

    }

    @Override
    public int getItemCount() {
        return mListItems.size();
    }

    public class ListItemsHolder extends RecyclerView.ViewHolder {

        public TextView mNameTextView;


        public ListItemsHolder(@NonNull View itemView) {
            super(itemView);
            mNameTextView = (TextView) itemView.findViewById(R.id.textview_name);

        }

        public void bindData(ListItem s) {
            mNameTextView.setText(s.getListItemText());

        }
    }
}
