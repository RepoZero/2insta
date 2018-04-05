package com.smrahmadi.a2insta.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smrahmadi.a2insta.R;
import com.smrahmadi.a2insta.object.Post;
import com.smrahmadi.a2insta.xView.SquareImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private Context context ;
    private ArrayList<Post> posts ;

    public UserAdapter(Context context , ArrayList<Post> posts){
        this.context=context;
        this.posts=posts;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private SquareImageView xImage ;
        public ViewHolder(View itemView) {
            super(itemView);
            xImage = itemView.findViewById(R.id.squareImage);
        }

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.square_post,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Post post = posts.get(position);

        String imageUrl = post.getContent().get(0).getImageUrl();

        if(imageUrl == null){
            imageUrl = post.getContent().get(0).getVideoImage() ;
        }

        Picasso.get().load(imageUrl).into(holder.xImage);


    }

    @Override
    public int getItemCount() {
        return posts.size();
    }





}
