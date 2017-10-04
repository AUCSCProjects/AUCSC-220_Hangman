package hangman.groupone.projects.aucsc.hangman.events.controls.buttons;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import hangman.groupone.projects.aucsc.hangman.Main;
import hangman.groupone.projects.aucsc.hangman.R;

/**
 * Handles the actions taken when the CustomText button is pressed.
 */
public class CustomText implements View.OnClickListener {
    /*---Data---*/
    private final Main mainInstance;

    /*---Constructors---*/
    public CustomText(Main mainInstance) {
        this.mainInstance = mainInstance;
    }

    /*---Methods---*/
    @Override
    public void onClick(View v) {
        final TextView textView = (TextView) mainInstance.findViewById(R.id.outputView);
        final EditText editText = (EditText) mainInstance.findViewById(R.id.editText);
        textView.setText(editText.getText());
    }
}
