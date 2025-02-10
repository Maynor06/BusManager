package org.example;

public class Asientos {

    private int idAsiento;
    private Usuarios user;
    private String type;

    public Asientos(int idAsiento, Usuarios user, String type) {
        this.idAsiento = idAsiento;
        this.user = user;
        this.type = type;
    }

    public Asientos() {

    }

    public int getIdAsiento() {
        return idAsiento;
    }
    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public Usuarios getUser() {
        return user;
    }
    public void setUser(Usuarios user) {
        this.user = user;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Id Asiento: " + idAsiento + ", Usuario: " + user + ", Tipo: " + type;
    }

}
