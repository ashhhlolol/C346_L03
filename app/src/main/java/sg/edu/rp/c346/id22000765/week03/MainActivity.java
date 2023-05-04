package sg.edu.rp.c346.id22000765.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    // Step 1: Declare variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender =findViewById(R.id.rgGender);


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for the action
                String stringResponse=etInput.getText().toString();
                tvDisplay.setText((stringResponse));
                tbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Add your code for the action

                        // get the state of the toggle button
                        //when the toggle button is unchecked, disable the EditText
                        //when the toggle button is checked enable the EditText to false
                        //enable it when it is checked
                        boolean isChecked = tbtn.isChecked();
                        if (isChecked) {
                            etInput.setEnabled(true);
                        }else{
                            etInput.setEnabled(false);
                        }


                        btnDisplay.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Code for the action
                                String stringResponse = etInput.getText().toString();
                                int checkedRadioId = rgGender.getCheckedRadioButtonId();

                                String Display;
                                if(checkedRadioId == R.id.radioButtonGenderMale){
                                    // Write the code when male selected
                                    Display = "He says ";

                                } else{
                                    // Write the code when female selected
                                    Display ="She says ";

                                }
                                String displayText =  Display + stringResponse;

                                tvDisplay.setText(displayText);
                            }
                        });













                    }
                });


            }
        });



        }

    }

