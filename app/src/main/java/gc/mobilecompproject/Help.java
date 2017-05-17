package gc.mobilecompproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Help extends AppCompatActivity {

    Button violence;
    Button weapon;
    ImageButton map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        violence = (Button) findViewById(R.id.violence);
        weapon = (Button) findViewById(R.id.weapon);
        map = (ImageButton) findViewById(R.id.btn_map);

        violence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Threat.class);
                startActivity(intent);
            }
        });

        weapon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),Weapon.class);
                startActivity(intent);
            }
        });

    }
}
