import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import edu.neumont.pro200.vpet.R;

/**
 * Created by bwoods on 5/14/2017.
 */

public abstract class Game extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    private Pet pet = new Pet("", 0, 0, 0, null);
    private Screen screen = new Screen();
    private Menu menu = new Menu(0,0,"",0,false,null);
    private android.widget.ToggleButton pill_button = (ToggleButton) findViewById(R.id.pill_button);
    private android.widget.LinearLayout medicine_menu  = (LinearLayout) findViewById(R.id.medicine_menu);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup_menu);
        pill_button.setOnCheckedChangeListener(togglePillMenu);
    }

    final CompoundButton.OnCheckedChangeListener togglePillMenu = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            pill_button.setText("bloop");
            medicine_menu.setVisibility(View.VISIBLE);

        }
    };

    public boolean run(){
        return true;
    }
    public boolean chooseAPet(){
        return true;
    }
}
