package id.villabs.realtimefirebase;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by husnu on 01/03/18.
 */

public class PersonViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.name)
    TextView name;

    public PersonViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }
}
