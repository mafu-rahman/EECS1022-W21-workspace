package eecs1022.tutorial.greeting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* This method is invoked when the app is first launched */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* 3 Helper methods you can assume */
    /* This mutator sets the output label */
    private void setContentOfTextView(int id, String newContents){
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    /* This accessor retrieves input entered on the text view  */
    private String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    /* This accessor retrieves input chosen from some spinner (drop-down menu) */
    private String getItemSelected(int id) {
        View view = findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;
    }

    // Controller method to be attached to some GUI component(s)
    public void computeButtonSayGreetingsClicked(View view){
        //Retrieve input values from GUI components
        String textName = getInputOfTextField(R.id.inputName);
        String textTitle = getItemSelected(R.id.optionTitles);

        //Do computations on the retrieved input
        String greetingMessage = "Hello, " + textTitle + " " + textName;

        //Display output on the text view
        setContentOfTextView(R.id.labelOutput, greetingMessage);
    }
}