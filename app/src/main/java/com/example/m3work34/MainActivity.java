package com.example.m3work34;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycleViewSecond;
    private final ArrayList<String> namePersonContact = new ArrayList<>();
    private final ArrayList<Integer> image = new ArrayList<>();
    private AdapterPerson adapterPersonContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recycleViewSecond = findViewById(R.id.recycleViewSecond);
        loadData();
        adapterPersonContact = new AdapterPerson(namePersonContact, image);
        recycleViewSecond.setAdapter(adapterPersonContact);
     //   initGame();

    }

  /*  private final String DATA_NAME[]= {"C#", "C++", "Java", "Android", "Kotlin", "HTML",};

    private final int[] IMAGE = {R.drawable.csharp, R.drawable.cplusplus, R.drawable.java,
            R.drawable.android, R.drawable.kotlin, R.drawable.html};
    private ArrayList<Languages> initGame() {
        ArrayList<Languages> birds = new ArrayList<>();

        for (int i = 0; i < DATA_NAME.length; ++i) {
            Languages bird = new Languages();
            bird.setImageUrl(IMAGE[i]);
            bird.setName(DATA_NAME[i]);
            birds.add(bird);
        }
        return birds;
    }*/
    private void loadData() {
        namePersonContact.add("C");
        image.add(R.drawable.csharp);
        namePersonContact.add("C++");
        image.add(R.drawable.cplusplus);
        namePersonContact.add("Java");
        image.add(R.drawable.java);
        namePersonContact.add("Android");
        image.add(R.drawable.android);
        namePersonContact.add("Kotlin");
        image.add(R.drawable.kotlin);
        namePersonContact.add("HTML");
        image.add(R.drawable.html);
    }
}