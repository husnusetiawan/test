package id.villabs.realtimefirebase;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by husnu on 01/03/18.
 */

public class PersonViewModel extends ViewModel{

    private FirebaseDatabaseRepository repository;
    MutableLiveData<List<Person>> data;
    private List<Person> list;

    public PersonViewModel(){
        repository = new FirebaseDatabaseRepository();
    }

    public LiveData<List<Person>> getPersons(){
        data = new MutableLiveData<>();
        list = new ArrayList<>();
        loadData();
        return data;
    }

    private void loadData() {

        repository.getPerson().addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Person person = dataSnapshot.getValue(Person.class);
                Log.d("DATA", person.name);
                Log.d("SIZE", String.valueOf(list.size()));
                list.add(person);
                data.postValue(list);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                dataSnapshot.getKey();
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

}
