package com.sand_corporation.www.dragger2basicpart2.Dagger.DaggerModule;

import com.sand_corporation.www.dragger2basicpart2.Repository.TicketRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class TicketModule {

    @Provides
    public TicketRepository getTicketRepository(){
        return new TicketRepository();
    }
}
