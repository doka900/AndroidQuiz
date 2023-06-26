package com.example.androidquiz.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidquiz.R;
import com.example.androidquiz.model.Friend;
import com.example.androidquiz.viewholders.FriendViewHolder;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendViewHolder> {

    Context context;
    List<Friend> friends;

    public FriendAdapter(Context context, List<Friend> friends) {
        this.context = context;
        this.friends = friends;
    }

    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FriendViewHolder(LayoutInflater.from(context).inflate(R.layout.listitem_friends,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder holder, int position) {
        holder.friendName.setText(friends.get(position).getName());
        holder.friendRang.setText(friends.get(position).getRang());
        holder.friendZvezde.setText(friends.get(position).getZvezde());
        holder.friendPic.setImageResource(friends.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return friends.size();
    }
}
