package com.bootcamp.demo.demo_helloworld.demo_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_helloworld.demo_helloworld.controller.ShoppingMall.Cinema;
import com.bootcamp.demo.demo_helloworld.demo_helloworld.controller.ShoppingMall.Cinema.Film;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
// @RequestMapping(value = "/api/v1")
// @RestController
public class CatController {

  @Getter
  @Setter
  @AllArgsConstructor
  @Builder
  public static class Cat {
    private String name;
    private int age;
    // private String colour;

    // public Cat(String name, int age, String colour) {
    //   this.name = name;
    //   this.age = age;
    //   this.colour = colour;
    // }

    // public String getColour() {
    //   return this.colour;
    // }

    // public String getName() {
    //   return this.name;
    // }

  }

  // Cat cats = new Cat("Tommy", 15, "RED");

  // @ResponseBody
  @GetMapping(value = "/cat") // api endpoint (avoid duplicate endpoint URL)
  public Cat getCatColour() {
    // return "Name: " + cats.getName() + ", Age: " + cats.getAge() + ", Colour: " + cats.getColour();
    return Cat.builder().name("John").age(19).colour("RED").build();
  }

  @GetMapping(value = "/number/decimal") // api endpoint (avoid duplicate endpoint URL)
  public BigDecimal getDecimal() {
    return BigDecimal.valueOf(3.7);
  }

  // @ResponseBody
  @GetMapping("/order-status")
  public String getOrderStatus() {
    return "status-page"; // Returns name of HTML template
  }

  // @GetMapping(value = "/shoppingmall") // api endpoint (avoid duplicate endpoint URL)
  // public ShoppingMall getShoppingMall() {
  //   Film releasedFilms1 = new Film();
  // }


  // public List<Cat> getAllCats() {
  //   return Arrays.asList(new Cat("Tommy", 15, "RED"), new Cat("John", 30, "YELLOW"), new Cat("Peter", 45, "BLUE"));
  // }

  // public Map<Integer, String> catMap() {
  //   HashMap<Integer, String> catMaps = new HashMap<>();
  //   catMaps.put(1, "Tommy");
  //   catMaps.put(2, "John");
  //   catMaps.put(3, "Peter");
  //   return catMaps;
  // }

  @ResponseBody
  @GetMapping(value = "/catmap")
  public Map<String, List<Cat>> getCatMap() {
    List<Cat> catList1 = List.of(new Cat("John", 13), new Cat("Peter", 20));
    List<Cat> catList2 = List.of(new Cat("Mary", 10));
    Map<String, List<Cat>> catMap = new HashMap<>();
    catMap.put("ABC", catList1);
    catMap.put("IJK", catList2);
    return catMap;
  }

  @ResponseBody
  @GetMapping(value = "/shoppingmall")
  public ShoppingMall getShoppingMall() {
    Film releasedFilm1 = new Film("ABC", "01-JAN-2025"); // or builder()
    Film releasedFilm2 = new Film("IJK", "12-JAN-2025"); // or builder()
    Cinema cinema =
        Cinema.builder().releasedFilms(List.of(releasedFilm1, releasedFilm2))
            .openedDate("14-FEB-2024").name("ABC cinema").build();
    return ShoppingMall.builder() //
        .cinema(cinema) //
        .area(100L) //
        .name("K11") //
        .shopCategories(List.of("Food", "Sport")) //
        .build();
  }

}
