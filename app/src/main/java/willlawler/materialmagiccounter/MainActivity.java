package willlawler.materialmagiccounter;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    Player[] players = new Player[10];

    int playerNum = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This forces the screen to stay on
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        //This sets the background colour
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#9E9E9E"));

        getSupportActionBar().setDisplayShowTitleEnabled(false);


        for ( int i=0;i<playerNum; i++){
            players[i] = new Player();
            players[i].playerHealth = 20;
            players[i].playerName = "Test" + Integer.toString(i);


            Log.i("Message" ,players[i].playerName + " : "+players[i].playerHealth);
        }



           }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.topmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.toggleLayer:
                return true;
            case R.id.recenter:
                return true;
            case R.id.screenshot:
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
