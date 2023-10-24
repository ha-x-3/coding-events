package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.*;

@Entity
public class Event extends AbstractEntity {

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email. Please try again.")
    private String contactEmail;

    @NotBlank(message = "Address for the event cannot be left blank.")
    private String address;

    @NotBlank(message = "RSVPs must be sent to obtain head count.")
    private String rsvp;

    @Positive(message = "Number of attendees must be greater than 0.")
    private int numberOfAttendees;

    @NotBlank(message = "Event must be scheduled in the future.")
    private String dateOfEvent;

    @ManyToOne
    @NotNull(message = "Category is required.")
    private EventCategory eventCategory;

    public Event(String name, String description, String contactEmail, String address, String rsvp, int numberOfAttendees, String dateOfEvent,EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.address = address;
        this.rsvp = rsvp;
        this.numberOfAttendees = numberOfAttendees;
        this.dateOfEvent = dateOfEvent;
        this.eventCategory = eventCategory;
    }

    public Event() {    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRsvp() {
        return rsvp;
    }

    public void setRsvp(String rsvp) {
        this.rsvp = rsvp;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return name + ": " + description;
    }

}