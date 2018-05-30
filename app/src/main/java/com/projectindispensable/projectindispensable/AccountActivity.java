package com.projectindispensable.projectindispensable;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class AccountActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    intent = new Intent(AccountActivity.this, HomeActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_medication:
                    mTextMessage.setText(R.string.title_medication);
                    intent = new Intent(AccountActivity.this, MedicationActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_scan:
                    mTextMessage.setText(R.string.title_scan_medication);
                    intent = new Intent(AccountActivity.this, ScanPrescriptionActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_account:
                    mTextMessage.setText(R.string.title_account);
                    intent = new Intent(AccountActivity.this, AccountActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_settings:
                    mTextMessage.setText(R.string.title_settings);
                    intent = new Intent(AccountActivity.this, SettingsActivity.class);
                    startActivity(intent);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
