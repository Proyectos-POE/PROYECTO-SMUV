package modelo;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/* 
 * @author Nicolas Herrera <herrera.nicolas@correounivalle.edu.co>
 * @author Samuel Galindo Cuevas <samuel.galindo@correounivalle.edu.co>
 * @author Julian Rendon <julian.david.rendon@correounivalle.edu.co>
 */

public class Hora implements Serializable
{
    private int id;
    private LocalTime inicio;
    private LocalTime fin;
    private Duration duracion;
    private boolean asignado;
    private static final long serialVersionUID = 1L;

    public Hora(int auxId, LocalTime auxInicio, Duration auxDuracion)
    {
        this.id = auxId;
        this.inicio = auxInicio;
        this.duracion = auxDuracion;
        this.fin = (LocalTime)duracion.addTo(inicio);
        formatearHora();
    }

    public Hora(LocalTime auxInicio)
    {
        this.inicio = auxInicio;
        this.fin = auxInicio;
        formatearHora();
    }

    public void formatearHora()
    {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        inicio.format(formato);
        fin.format(formato);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int auxId)
    {
        this.id = auxId;
    }

    public LocalTime getInicio()
    {
        return inicio;
    }

    public void setInicio(LocalTime auxInicio)
    {
        this.inicio = auxInicio;
    }

    public LocalTime getFin()
    {
        return fin;
    }

    public void setFin(LocalTime auxFin)
    {
        this.fin = auxFin;
    }

    public Duration getDuracion()
    {
        return duracion;
    }

    public void setDuracion(Duration auxDuracion)
    {
        this.duracion = auxDuracion;
    }

    public boolean isAsignado()
    {
        return asignado;
    }

    public void setAsignado(boolean auxAsignado)
    {
        this.asignado = auxAsignado;
    }

    public String toString()
    {
        String auxDatos;
        auxDatos = inicio + " - " + fin;
        return auxDatos;
    }
}
