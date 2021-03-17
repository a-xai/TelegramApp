package com.example.telegramapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{

    private List<ChatModel> list;
    private LayoutInflater inflater;


    public RecyclerAdapter(Context context, List<ChatModel> list){
        this.inflater = LayoutInflater.from(context);
        this.list = list;
    }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_chat,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        ChatModel chatModel = list.get(position);
        holder.userName.setText(chatModel.chatName);
        holder.lastMessage.setText(chatModel.lastMassage);
        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(),chatModel.chatName + " " + chatModel.lastMassage,Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView userName;
        private TextView lastMessage;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.item_user_name_txt);
            lastMessage = itemView.findViewById(R.id.item_chat_last_massage_txt);
        }
    }
}
