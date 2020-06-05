package pt.ipg.covidtrack2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewProfileActivity extends AppCompatActivity {

    private EditText TextEditProfileName;

    private EditText TextEditDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_profile);


        TextEditProfileName= (EditText) findViewById(R.id.editTextName);

        TextEditDate = (EditText) findViewById(R.id.editTextDate);
        SimpleDateFormat formatadata= new SimpleDateFormat("dd-MM-yyyy");
        Date data =  new Date();
        String dataFormatada =  formatadata.format(data);

        TextEditDate.setText(dataFormatada);
    }
}