import android.os.Bundle;
import android.os.PersistableBundle;

import com.example.audioplayer.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MediaPlayer extends AppCompatActivity {

    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this.player = MediaPlayer.create(this, R.raw.bensoundbrazilsamba);
        //this.player.start();
    }
}
