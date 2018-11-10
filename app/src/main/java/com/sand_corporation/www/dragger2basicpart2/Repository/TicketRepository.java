package com.sand_corporation.www.dragger2basicpart2.Repository;

import javax.inject.Inject;

public class TicketRepository {

    @Inject
    public TicketRepository() {

    }

    public String getTicket(){
        return "Grand Stand E05";
    }
}
