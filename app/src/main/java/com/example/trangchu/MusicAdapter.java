package com.example.trangchu;

import static com.example.trangchu.R.layout.music_adapter_layout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {
    private final List<MusicList> list;
    private final Context context;

    public MusicAdapter(List<MusicList> list, Context context) {
        this.list = list;
        this.context = context;
    }
// 17:40
    @SuppressLint("InflateParams")
    @NonNull
    @Override
    public MusicAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(music_adapter_layout,null));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAdapter.MyViewHolder holder, int position) {
        MusicList list2 = list.get(position);

        if(list2.isIsplay()){
                holder.rootLayout.setBackgroundResource(R.drawable.round_back_blue_10);
        }else
            holder.rootLayout.setBackgroundResource(R.drawable.round_back_10);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    static class MyViewHolder extends RecyclerView.ViewHolder {

        private final RelativeLayout rootLayout;
        private final TextView title;
        private final TextView artist;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            rootLayout = itemView.findViewById(R.id.rootLayout);
            title = itemView.findViewById(R.id.musicTitle);
            artist = itemView.findViewById(R.id.musicArtist);
        }

    }
}
