package com.emc.test;
import com.emc.dto.Organizer;
import com.emc.dto.Event;

public class Test {

    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        organizer.id = 123l;
        organizer.name = "Apple Inc";
        System.out.println(organizer.name);

        Event event = new Event(456l,"iphone 100", "grand celebration");
        System.out.println(event.description);
    }
}
