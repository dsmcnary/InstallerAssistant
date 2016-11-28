package net.northmo.dsmcnary.installerassistant;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Daniel McNary on 11/27/2016.
 */

public class tower {
    private int id;
    private String name;
    private LatLng location;

    public tower()
    {
    }

    public tower(int id, String name, LatLng loc)
    {
        this.id = id;
        this.name = name;
        this.location = loc;
    }

    public void setID(int id)
    {
        this.id = id;
    }

    public void setName(String s)
    {
        this.name = s;
    }

    public void setLocation(LatLng LL)
    {
        this.location = LL;
    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public LatLng getLocation()
    {
        return this.location;
    }
}
