package gc.mobilecompproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Weapon extends AppCompatActivity {

    Button guard;
    Button ilko;
    Button police;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon);

        guard = (Button) findViewById(R.id.btn_guard);
        ilko = (Button) findViewById(R.id.btn_ilko);
        police = (Button) findViewById(R.id.btn_police);

        guard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Security.class);
                startActivity(intent);
            }
        });

        ilko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ilko_Assist.class);
                startActivity(intent);
            }
        });

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Police.class);
                startActivity(intent);
            }
        });
    }
}
