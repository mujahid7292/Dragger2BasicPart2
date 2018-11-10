package com.sand_corporation.www.dragger2basicpart2.Dagger.DaggerComponent;

import com.sand_corporation.www.dragger2basicpart2.Dagger.DaggerModule.TicketModule;
import com.sand_corporation.www.dragger2basicpart2.MainActivity;
import com.sand_corporation.www.dragger2basicpart2.Repository.TicketRepository;

import dagger.Component;

@Component(modules = {TicketModule.class})
public interface TicketComponent {
    void inject(MainActivity mainActivity);
    TicketRepository getTicket();
}
