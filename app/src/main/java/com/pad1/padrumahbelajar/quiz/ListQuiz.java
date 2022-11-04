//package com.pad1.padrumahbelajar.quiz;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.ListAdapter;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.bumptech.glide.Glide;
//import com.bumptech.glide.request.RequestOptions;
//import com.pad1.padrumahbelajar.R;
//
//public class ListQuiz extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
//    private final ArrayList<News> listItem;
//
//
//    @NonNull
//    @Override
//    public ListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_news, viewGroup, false);
//        return new ListViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ListAdapter.ListViewHolder holder, int position) {
//        final News news = listNews.get(position);
//        Glide.with(holder.itemView.getContext())
//                .load(news.getImage())
//                .apply(new RequestOptions().override(55, 55))
//                .into(holder.imgPhoto);
//        holder.tvName.setText(news.getTitle());
//        holder.tvDetail.setText(news.getDesc());
//
//        holder.itemView.setOnClickListener(v -> {
//
//            Intent intent = new Intent(v.getContext(), DetailActivity.class);
//            Bundle bundle = new Bundle();
//
//            bundle.putString("title", news.getTitle());
//            bundle.putString("desc", news.getDesc());
//            bundle.putInt("picture", news.getImage());
//            intent.putExtras(bundle);
//            v.getContext().startActivity(intent);
//
//            Toast.makeText(holder.itemView.getContext(), "" + listNews.get(holder.getAdapterPosition()).getTitle(), Toast.LENGTH_SHORT).show();
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return listItem.size;
//    }
//
//    public static class ListViewHolder extends RecyclerView.ViewHolder {
//        ImageView imgPhoto;
//        TextView tvName, tvDetail;
//
//        public ListViewHolder(@NonNull View itemView) {
//            super(itemView);
//            imgPhoto = itemView.findViewById(R.id.img_item_photo);
//            tvName = itemView.findViewById(R.id.tv_item_title);
//            tvDetail = itemView.findViewById(R.id.tv_item_desc);
//        }
//    }
//}
