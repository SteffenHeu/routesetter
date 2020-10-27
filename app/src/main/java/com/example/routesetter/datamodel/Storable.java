package com.example.routesetter.datamodel;

import org.w3c.dom.Element;

public interface Storable {

  /**
   * @param thisElement The element the data shall be loaded from
   */
  public void load(Element thisElement);

  /**
   * @param parentElement A parent element the data shall be appended to. Create sub element
   *                      containing data in this method.
   */
  public void save(Element parentElement);

}
