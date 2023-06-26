package com.example.androidquiz.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidquiz.R;

public class FriendViewHolder extends RecyclerView.ViewHolder {

    public ImageView friendPic;
    public TextView friendName;
    public TextView friendRang;
    public TextView friendZvezde;

    public FriendViewHolder(@NonNull View itemView) {
        super(itemView);

        friendPic = itemView.findViewById(R.id.friend_item_profilepic);
        friendName = itemView.findViewById(R.id.friend_item_name);
        friendRang = itemView.findViewById(R.id.friend_item_rang);
        friendZvezde = itemView.findViewById(R.id.friend_item_zvezde);

    }
}
