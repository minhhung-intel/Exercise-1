package funix.prm.challengeintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CreateContact extends AppCompatActivity implements View.OnClickListener{

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

        ivSad.setOnClickListener(this);
        ivOk.setOnClickListener(this);
        ivHappy.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (etName.getText().toString().isEmpty() || etNumber.getText().toString().isEmpty() ||
                etWeb.getText().toString().isEmpty() || etMap.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter all fields!", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent();
            intent.putExtra("name", etName.getText().toString().trim());
            intent.putExtra("number", etNumber.getText().toString().trim());
            intent.putExtra("web", etWeb.getText().toString().trim());
            intent.putExtra("map", etMap.getText().toString().trim());

            if (view.getId() == R.id.ivHappy) {
                intent.putExtra("mood", "happy");
            } else if (view.getId() == R.id.ivOk) {
                intent.putExtra("mood", "ok");
            } else {
                intent.putExtra("mood", "sad");
            }

            setResult(RESULT_OK, intent);
            CreateContact.this.finish();
        }
    }
}