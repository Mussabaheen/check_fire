package com.example.mussabaheen.check_fire;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    FirebaseFirestore db=FirebaseFirestore.getInstance();
    TextView t1;
    ArrayList<String> array1;
    ArrayList<String> a1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void data(View view) {
       a1 = new ArrayList<String>();
       a1.add("A");
       a1.add("B");
       a1.add("C");
        a1.add("PAKISTAN!!!!");
       City city = new City("Pesahawar", "KPK", "PAKISTAN",
               false, 5000000L,a1);
       city.setArray1(a1);
       db.collection("cities").document("LA").set(city);


   }


    public void retrieve(View view) {
        t1=(TextView)findViewById(R.id.textView);
        DocumentReference docRef = db.collection("Naran").document("Points");
        docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                notedata d1= documentSnapshot.toObject(notedata.class);

                Toast.makeText(MainActivity.this, d1.getSaif().get(0), Toast.LENGTH_SHORT).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(MainActivity.this, "FAILED ! ", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
