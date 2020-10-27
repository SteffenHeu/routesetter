package com.example.routesetter.datamodel;

import com.example.routesetter.datamodel.impl.HoldLocation;

public interface Hold extends Storable {

  public Double getX();

  public Double getY();

  public HoldLocation getLocation();
}
