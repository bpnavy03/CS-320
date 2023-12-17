/*
 * Bryan Pirrone
 * Professor Jacks
 * CS-320
 * 11/25/2023
 */

package Appointment;

import java.util.Date;

public class Appointment {
    private String appointmentID;
    private Date date;
    private String description;

    public Appointment(String appointmentID, Date date, String description) {
        if (appointmentID == null || appointmentID.isEmpty() || date == null || description == null || description.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.appointmentID = appointmentID;
        this.date = date;
        this.description = description;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

public void setAppointmentID(String appointmentID) {
    if (appointmentID == null || appointmentID.isEmpty()) {
        throw new IllegalArgumentException();
    }
    this.appointmentID = appointmentID;
}

public Date getDate() {
    return date;
}

public void setDate(Date date) {
    if (date == null) {
        throw new IllegalArgumentException();
    }
    this.date = date;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    if (description == null || description.isEmpty()) {
        throw new IllegalArgumentException();
    }
    this.description = description;
}
}


