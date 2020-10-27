package com.example.routesetter.datamodel;

import android.media.Image;
import android.os.Build.VERSION_CODES;
import androidx.annotation.RequiresApi;
import java.util.Map;

public interface Wall extends Storable {

  public Integer getWallId();

  public Image getImage();

  public Map<Integer, Route> getRoutes();

  @RequiresApi(api = VERSION_CODES.N)
  public static Wall createWall() {
    // TODO
    return null;
  }
}
