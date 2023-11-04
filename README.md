LaunchCode exercise to practice Thymeleaf forms

Notes for adding Person class:

Person:

-id (int) = unique user ID

-firstName (String) = user's first name

-lastName (String) = user's last name

-email (String) = user's email - also used for username

-password (String) = user's password

-Getters for all, Setters for everything but id

-PersonProfile could be used to hold profile information about user - O2O relationship Person->PersonProfile

-List eventsAttending = store events user wants to attend - M2M relationship Person->Event

-List eventsOwned = store events user has created - O2M relationship Person->Event
