package uz.abdulbosit.gita.testexamineapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.sharedImageView).setOnClickListener(v -> {
            Intent intent = new Intent(this, SharedActivity.class);
            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                    this,
                    findViewById(R.id.sharedImageView),
                    "shared_element_transition"  // Transition name
            );
            startActivity(intent, options.toBundle());
        });

    }
}