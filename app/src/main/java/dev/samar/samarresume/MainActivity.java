package dev.samar.samarresume;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBarJava, seekBarHtml, seekBarCss;
    private TextView textJava, textHtml, textCss;
    private CheckBox aboutMeCheckBox, educationCheckBox, skillCheckbox;
    private LinearLayout aboutMeContent, educationContent, skillContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize CheckBox and LinearLayout references
        aboutMeCheckBox = findViewById(R.id.aboutMeCheckBox);
        aboutMeContent = findViewById(R.id.aboutMeContent);

        skillCheckbox = findViewById(R.id.skillCheckBox);
        skillContent = findViewById(R.id.skillContent);

        educationCheckBox = findViewById(R.id.educationCheckBox);
        educationContent = findViewById(R.id.educationContent);

        // Set onCheckedChangeListener for CheckBoxes
        aboutMeCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Show the "About Me" content when the checkbox is checked
                aboutMeContent.setVisibility(LinearLayout.VISIBLE);
            } else {
                // Hide the "About Me" content when the checkbox is unchecked
                aboutMeContent.setVisibility(LinearLayout.GONE);
            }
        });

        educationCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Show the "Education" content when the checkbox is checked
                educationContent.setVisibility(LinearLayout.VISIBLE);
            } else {
                // Hide the "Education" content when the checkbox is unchecked
                educationContent.setVisibility(LinearLayout.GONE);
            }
        });

        skillCheckbox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Show the "Skills" content when the checkbox is checked
                skillContent.setVisibility(LinearLayout.VISIBLE);
            } else {
                // Hide the "Skills" content when the checkbox is unchecked
                skillContent.setVisibility(LinearLayout.GONE);
            }
        });

        // Initialize SeekBar and TextView references
        seekBarJava = findViewById(R.id.seekBarJava);
        textJava = findViewById(R.id.textJava);

        seekBarHtml = findViewById(R.id.seekBarHtml);
        textHtml = findViewById(R.id.textHtml);

        seekBarCss = findViewById(R.id.seekBarCss);
        textCss = findViewById(R.id.textCss);

        // Set SeekBar change listeners
        seekBarJava.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textJava.setText(progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // You can add actions here if needed
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // You can add actions here if needed
            }
        });

        seekBarHtml.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textHtml.setText(progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // You can add actions here if needed
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // You can add actions here if needed
            }
        });

        seekBarCss.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textCss.setText(progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // You can add actions here if needed
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // You can add actions here if needed
            }
        });
    }
}
