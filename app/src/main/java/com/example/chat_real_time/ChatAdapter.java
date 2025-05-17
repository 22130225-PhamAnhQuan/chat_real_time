package com.example.chat_real_time;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ChatAdapter extends BaseAdapter {
    private Context context;
    private List<ChatItem> chatList;

    public ChatAdapter(Context context, List<ChatItem> chatList) {
        this.context = context;
        this.chatList = chatList;
    }

    @Override
    public int getCount() {
        return chatList.size();
    }

    @Override
    public Object getItem(int position) {
        return chatList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_chat, parent, false);
        }

        ChatItem item = chatList.get(position);

        ImageView imgAvatar = convertView.findViewById(R.id.imgAvatar);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvMessage = convertView.findViewById(R.id.tvMessage);

        // 🔽 Câu lệnh bạn hỏi nằm ngay đây:
        imgAvatar.setImageResource(item.getAvatarResId()); // Ví dụ: R.drawable.avatar

        tvName.setText(item.getName());
        tvMessage.setText(item.getMessage());

        return convertView;
    }

}
