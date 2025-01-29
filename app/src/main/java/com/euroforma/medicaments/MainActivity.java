package com.euroforma.medicaments;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {


        /*MedicamentAdapter adapter;*/
        DatabaseHelper dbm;
        ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbm = new DatabaseHelper(this);

        // Initialisation du Spinner
        Spinner spinnerVoiesAdmin = findViewById(R.id.spinnerVoiesAdmin);
        setupVoiesAdminSpinner(spinnerVoiesAdmin);
    }

    private void setupVoiesAdminSpinner(Spinner spinnerVoiesAdmin) {
        List<String> voiesAdminList = dbm.getDistinctVoiesdadministration();
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, voiesAdminList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerVoiesAdmin.setAdapter(spinnerAdapter);
    }

}