package dao;

import modelo.Servicio;

import java.util.ArrayList;

/* 
 * @author Nicolas Herrera <herrera.nicolas@correounivalle.edu.co>
 * @author Samuel Galindo Cuevas <samuel.galindo@correounivalle.edu.co>
 * @author Julian Rendon <julian.david.rendon@correounivalle.edu.co>
 */

public class ServicioDao
{
    private final ArrayList<Servicio> servicios;

    public ServicioDao()
    {
        servicios = new ArrayList<Servicio>();;
    }

    public Servicio getServicio(int auxId)
    {
        Servicio auxServicio = null;
        for(Servicio servicio: servicios)
        {
            if(servicio.getId() == auxId)
            {
                auxServicio = servicio;
                break;
            }
        }
        return auxServicio;
    }

    public boolean anhadirServicio(Servicio auxServicio)
    {
        servicios.add(auxServicio);
        return true;
    }

    public boolean eliminarServicio(Servicio auxServicio)
    {
        servicios.remove(auxServicio);
        return true;
    }

    public boolean actualizarServicio(Servicio auxServicio)
    {
        if(servicios.contains(auxServicio))
        {
            int pos = servicios.indexOf(auxServicio);
            servicios.set(pos, auxServicio);
            return true;
        }
        return false;
    }

    public ArrayList<Servicio> getServicios()
    {
        return servicios;
    }
}


