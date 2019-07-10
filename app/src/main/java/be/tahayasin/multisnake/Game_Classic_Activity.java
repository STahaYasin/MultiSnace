package be.tahayasin.multisnake;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Game_Classic_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game__classic_);
    }

    @Override
    protected void onResume() {
        super.onResume();

        ((SnakeView) findViewById(R.id.game)).Init();
    }
}
