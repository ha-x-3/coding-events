package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity {

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

    public EventDetails(String description, String contactEmail, String address, String rsvp, int numberOfAttendees, String dateOfEvent) {
        this.description = description;
        this.contactEmail = contactEmail;
        this.address = address;
        this.rsvp = rsvp;
        this.numberOfAttendees = numberOfAttendees;
        this.dateOfEvent = dateOfEvent;
    }

    public EventDetails() {
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

}
