package com.bootcamp.demo.demo_helloworld.demo_helloworld.controller;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

// ! reflection

@Getter
@AllArgsConstructor
@Builder
@JsonPropertyOrder({"shopCategory1", "area", "name", "cinema"})
public class ShoppingMall {
  private String name;
  private Long area;
  private Cinema cinema;
  @JsonProperty(value = "shopCategory1")
  private List<String> shopCategories;
  // ! List is same as Array, in Serialization perspective

  @Getter
  @AllArgsConstructor
  @Builder
  public static class Cinema {
    private String name;
    private String openedDate;
    private List<Film> releasedFilms;

    @Getter
    @AllArgsConstructor
    @Builder
    public static class Film {
      private String name;
      private String releaseDate;
    }
  }
}
