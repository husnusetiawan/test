package id.villabs.realtimefirebase;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by husnu on 01/03/18.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    private List<Person> list;

    public void setList(List<Person> list) {
        this.list = list;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_itemlist, null, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.name.setText(list.get(position).name);
    }

    @Override
    public int getItemCount() {
        return (list == null)? 0 : list.size();
    }
}
