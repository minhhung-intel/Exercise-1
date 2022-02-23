package funix.prm.challengeintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class CreateContact extends AppCompatActivity {

    EditText etName, etNumber, etWeb, etMap;
    ImageView ivHappy, ivOk, ivSad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact);

        etName = findViewById(R.id.etName);
        etNumber = findViewById(R.id.etNumber);
        etWeb = findViewById(R.id.etWeb);
        etMap = findViewById(R.id.etMap);

        ivHappy = findViewById(R.id.ivHappy);
        ivOk = findViewById(R.id.ivOk);
        ivSad = findViewById(R.id.ivSad);

        ivHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ivOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ivSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}