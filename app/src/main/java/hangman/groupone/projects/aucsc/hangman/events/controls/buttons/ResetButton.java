package hangman.groupone.projects.aucsc.hangman.events.controls.buttons;

import android.view.View;
import android.widget.TextView;

import hangman.groupone.projects.aucsc.hangman.Main;
import hangman.groupone.projects.aucsc.hangman.R;

public class ResetButton implements View.OnClickListener {

    /*---Data---*/
    private final Main mainInstance;

    /*---Constructors---*/
    public ResetButton(Main mainInstance) {
        this.mainInstance = mainInstance;
    }

    /*---Methods---*/
    @Override
    public void onClick(View v) {
        final TextView textView = (TextView) mainInstance.findViewById(R.id.outputView);
        textView.setText(mainInstance.getString(R.string.default_text));
    }
}
