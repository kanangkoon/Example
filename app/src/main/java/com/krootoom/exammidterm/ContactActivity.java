package com.krootoom.exammidterm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ContactActivity extends AppCompatActivity {
    private ImageButton contant;
    private ImageButton contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        contant = (ImageButton) findViewById(R.id.contant);
        contact = (ImageButton) findViewById(R.id.contact);

        contant.setOnClickListener(onClickAddcontact);
        contact.setOnClickListener(onClickContact);
    }

    private View.OnClickListener onClickAddcontact = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), AddContactActivity.class);
            startActivity(i);
        }
    };

    private View.OnClickListener onClickContact = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), ContactListActivity.class);
            startActivity(i);
        }
    };
}
