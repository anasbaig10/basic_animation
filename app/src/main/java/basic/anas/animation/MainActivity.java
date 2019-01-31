package basic.anas.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void animate (View view){
        ImageView tom =(ImageView)findViewById(R.id.tom);
        tom.animate().alpha(0f).setDuration(2000);
        ImageView jerry=(ImageView)findViewById(R.id.jerry);
        jerry.animate().alpha(1f).setDuration(2000);
    }
}
