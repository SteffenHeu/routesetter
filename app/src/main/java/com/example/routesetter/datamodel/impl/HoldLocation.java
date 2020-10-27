package com.example.routesetter.datamodel.impl;

import androidx.databinding.ObservableDouble;

public class HoldLocation {

  private final ObservableDouble obsX;
  private final ObservableDouble obsY;

  public HoldLocation(Double x, Double y) {
    this.obsX = new ObservableDouble(x);
    this.obsY = new ObservableDouble(y);
  }

  public HoldLocation(ObservableDouble x, ObservableDouble y) {
    this.obsX = x;
    this.obsY = y;
  }

  public ObservableDouble getObsX() {
    return obsX;
  }

  public ObservableDouble getObsY() {
    return obsY;
  }

  public double getX() {
    return obsX.get();
  }

  public double getY() {
    return obsY.get();
  }
}
