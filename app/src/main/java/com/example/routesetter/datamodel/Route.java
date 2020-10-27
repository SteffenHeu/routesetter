package com.example.routesetter.datamodel;

import android.os.Build.VERSION_CODES;
import androidx.annotation.RequiresApi;
import java.util.List;

public interface Route extends Storable {

  public Integer getRouteId();

  public List<Hold> getHolds();

  @RequiresApi(api = VERSION_CODES.N)
  public static Route createRoute() {
    // TODO
    return null;
  }
}
