package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {   private CustomList list;

  public CustomList MockCityList(){
    list = new CustomList(null,new ArrayList<>());
    return list;
  }


  @Test
  public void addCityTest(){
    list = MockCityList();
    int listSize = list.getCount();
    list.addCity(new City("Estevan", "SK"));
    assertEquals(list.getCount(),listSize + 1);
  }

  @Test
  public void testHasCity() {
    list = MockCityList();
    City city = new City("Edmonton", "AB");
    assertFalse(list.hasCity(city));
    list.addCity(city);
    assertTrue(list.hasCity(city));
  }

  @Test
  public void testDeleteCity() {
    list = MockCityList();
    City city = new City("Vancouver", "BC");
    list.addCity(city);
    list.delete(city);
    assertFalse(list.hasCity(city));
  }
//
//  @Test
//  public void testGetCount() {
//    list = MockCityList();
//    assertEquals(0, list.getCount());
//    City city = new City("Vancouver", "BC");
//    list.addCity(city);
//    assertEquals(1, list.getCount());
//    list.delete(city);
//    assertEquals(0, list.getCount());
//  }
}
