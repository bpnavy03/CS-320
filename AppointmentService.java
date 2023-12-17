/*
 * Bryan Pirrone
 * Professor Jacks
 * CS-320
 * 11/25/2023
 */

package Appointment;

import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<Appointment>();

    public AppointmentService() {
    this.appointments = new ArrayList<Appointment>();
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException();
        }
        this.appointments.add(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException();
        }
        this.appointments.remove(appointment);
    }
}
