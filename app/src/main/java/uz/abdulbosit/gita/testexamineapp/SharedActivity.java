package uz.abdulbosit.gita.testexamineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionSet;
import android.widget.ImageView;

public class SharedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);

//        TransitionSet transitionSet = new TransitionSet();
//        transitionSet.addTransition(new ChangeBounds());
//        transitionSet.addTransition(new ChangeTransform());
//        transitionSet.addTransition(new ChangeImageTransform());
//
//        getWindow().setSharedElementEnterTransition(transitionSet);
//        getWindow().setSharedElementReturnTransition(transitionSet);
//
//
//        ImageView imageView = findViewById(R.id.sharedImageView);
    }
}