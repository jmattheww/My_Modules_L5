package sg.edu.rp.c346.id21037164.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tvmod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvmod = findViewById(R.id.textView);


        Intent intentReceived = getIntent();
        String modCode = intentReceived.getStringExtra("Module");
        String modName = intentReceived.getStringExtra("Name");
        String modYear = intentReceived.getStringExtra("Year");
        String modSem = intentReceived.getStringExtra("Semester");
        String modCredit = intentReceived.getStringExtra("Credit");
        String modVenue = intentReceived.getStringExtra("Venue");

        tvmod.setText("Module Code: " + modCode +"\n" +
                "Module Name: " + modName + "\n" +
                "Academic Year: " + modYear + "\n" +
                "Semester: " + modSem + "\n" +
                "Module Credit: " + modCredit + "\n" +
                "Venue: " + modVenue);


    }
}