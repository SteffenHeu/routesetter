package com.example.routesetter.datamodel;

import android.os.Build.VERSION_CODES;
import androidx.annotation.RequiresApi;
import com.google.common.collect.ImmutableMap;

public interface Gym extends Storable {

  public static final Integer UNKNOWN_ERROR = 0;
  public static final Integer ID_TAKEN = -1;
  public static final Integer SUCCESS = 1;

  /**
   *
   * @return The gym name
   */
  public String getName();

  // TODO Gym Location, Unique ID

  public Integer getGymId();

  public String getZipCode();

  public String getStreet();

  public String getCity();

  /**
   *
   * @return Immutable map of all the {@link Wall}s in this {@link Gym}
   */
  public ImmutableMap<Integer, Wall> getWalls();

  /**
   *
   * @param wall The wall to add
   * @return {@link Gym#UNKNOWN_ERROR}, {@link Gym#ID_TAKEN} or {@link Gym#SUCCESS}
   */
  public Integer addWall(Wall wall);

  @RequiresApi(api = VERSION_CODES.N)
  public static Gym createGym() {
    // TODO
    return null;
  }
}
