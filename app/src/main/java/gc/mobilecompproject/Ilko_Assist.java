package gc.mobilecompproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Ilko_Assist extends AppCompatActivity {

    TextView call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilko__assist);
        call = (TextView) findViewById(R.id.textView12);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call();
            }
        });

    }

    private void call() {
        Intent in = new Intent(Intent.ACTION_CALL, Uri.parse("tel:08-834-020-48"));
        try {
            startActivity(in);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "Call capabilities not found", Toast.LENGTH_SHORT).show();
        }
    }

}
