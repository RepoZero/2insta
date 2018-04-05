package com.smrahmadi.a2insta.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.smrahmadi.a2insta.R;
import com.smrahmadi.a2insta.object.Story;
import com.smrahmadi.a2insta.utils.CircleTransformation;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    Context context ;
    ArrayList<Story> stories ;


    public StoryAdapter(Context context, ArrayList<Story> stories) {
        this.context = context;
        this.stories = stories;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

       private ImageView img ;
       private TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.story_item_image);
            name = itemView.findViewById(R.id.story_item_name);
        }
    }


    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story_item,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final StoryAdapter.ViewHolder holder, int position) {


        String namePerson = stories.get(position).getName() ;



        Picasso.get().load(stories.get(position).getImageProfile())
                .transform(new CircleTransformation(context.getResources().getColor(R.color.instagram)))
                .into(holder.img);

        holder.name.setText(namePerson);

        YoYo.with(Techniques.Shake).duration(1000).playOn(holder.img);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Flash).duration(500).repeat(4).playOn(holder.img);
            }
        });

    }

    @Override
    public int getItemCount() {
        return stories.size();
    }
}
