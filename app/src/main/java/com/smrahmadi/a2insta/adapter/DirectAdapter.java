package com.smrahmadi.a2insta.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.smrahmadi.a2insta.R;
import com.smrahmadi.a2insta.object.Person;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;

public class DirectAdapter extends RecyclerView.Adapter<DirectAdapter.ViewHolder> {

    private Context context ;
    private ArrayList<Person> person;

    public DirectAdapter(Context context, ArrayList<Person> person) {
        this.context = context;
        this.person = person;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {

        private ImageView image ;
        private TextView name;
//        private TextView lastMessage ;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.direct_item_image);
            name = itemView.findViewById(R.id.direct_item_name);
//            lastMessage = itemView.findViewById(R.id.direct_item_last);
        }
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.direct_ltem,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        String namePerson = person.get(position).getName() ;



        Picasso.get().load(person.get(position).getProfileImage())
                .transform(new CropCircleTransformation())
                .into(holder.image);

        holder.name.setText(namePerson);

    }

    @Override
    public int getItemCount() {
        return person.size();
    }


}

