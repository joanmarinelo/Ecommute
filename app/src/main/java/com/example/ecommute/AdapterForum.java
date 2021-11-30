package com.example.ecommute;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterForum  extends RecyclerView.Adapter<AdapterForum.ViewHolder> {
    Context mContext;
    String[] mStrTitulos, mStrContenido;
    Integer[] mIntLiked, mIntIds;

    public AdapterForum(Context context, String[] strTitulos, String[] strContenido, Integer[] intLiked, Integer[] intIds){
        mContext = context;
        mStrTitulos = strTitulos;
        mStrContenido = strContenido;
        mIntLiked = intLiked;
        mIntIds = intIds;
    }

    @NonNull
    @Override
    public AdapterForum.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.item_forum, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterForum.ViewHolder holder, int position) {
        holder.textTitulo.setText(mStrTitulos[position]);
        holder.textContenido.setText(mStrContenido[position]);
        holder.id = mIntIds[position];
        holder.liked = mIntLiked[position];

        holder.setUpLike();

    }

    @Override
    public int getItemCount() {
        return mStrTitulos.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public String username = GlobalVariables.username;
        public String password = GlobalVariables.password;

        public TextView textTitulo, textContenido;
        public Integer id, liked;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitulo = itemView.findViewById(R.id.titulo);
            textContenido = itemView.findViewById(R.id.contenido);

            Button comments = itemView.findViewById(R.id.comments);
            comments.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    //abrir post / view de comentar?
                }
            });

            ImageView background = itemView.findViewById(R.id.background);
            background.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   //abrir post
                }
            });
        }

        public void setUpLike() {

        }
    }
}