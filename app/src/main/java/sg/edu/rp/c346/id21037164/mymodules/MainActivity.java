package sg.edu.rp.c346.id21037164.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tvMod1);
        tv2 = findViewById(R.id.tvMod2);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("Module","C346");
                intent.putExtra("Name","Android Programming");
                intent.putExtra("Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue","W66M");
                startActivity(intent);

            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("Module","C349");
                intent.putExtra("Name","iPad Programming");
                intent.putExtra("Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue","W66P");
                startActivity(intent);


            }
        });



    }
}