package com.sand_corporation.www.dragger2basicpart2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sand_corporation.www.dragger2basicpart2.Dagger.DaggerComponent.DaggerTicketComponent;
import com.sand_corporation.www.dragger2basicpart2.Repository.TicketRepository;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    TicketRepository ticketRepository;
    private TextView txtTicket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTicket = findViewById(R.id.txtTicket);
        ticketRepository = DaggerTicketComponent.create().getTicket();
        txtTicket.setText(ticketRepository.getTicket());

    }
}
