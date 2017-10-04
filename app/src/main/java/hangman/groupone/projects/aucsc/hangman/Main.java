package hangman.groupone.projects.aucsc.hangman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import hangman.groupone.projects.aucsc.hangman.events.controls.buttons.CustomText;
import hangman.groupone.projects.aucsc.hangman.events.controls.buttons.ResetButton;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        applyWindowSettings();
        setContentView(R.layout.activity_main);

        registerListeners();
    }

    /**
     * Applies any required settings to allow the view to render correctly in fullscreen.
     */
    private void applyWindowSettings() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    /**
     * Registers any required listeners to allow control functionality.
     */
    private void registerListeners() {
        findViewById(R.id.resetButton).setOnClickListener(new ResetButton(this));
        findViewById(R.id.customButton).setOnClickListener(new CustomText(this));
    }
}
