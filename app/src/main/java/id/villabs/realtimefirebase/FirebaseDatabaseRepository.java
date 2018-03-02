package id.villabs.realtimefirebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

/**
 * Created by husnu on 01/03/18.
 */

public class FirebaseDatabaseRepository {

    public DatabaseReference getPerson(){
        return FirebaseDatabase.getInstance().getReference("person");
    }
}
