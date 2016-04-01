package com.gabiksoft.tests;

public class Animal extends Parent {

  private AnimalType type;

  public AnimalType getType() {
    return type;
  }

  public void setType(AnimalType type) {
    this.type = type;
  }

  public enum AnimalType {
    FISH("Fish"), BIRD("Bird"), MAMMAL("Mammal");

    private String animalType;

    private AnimalType(String animalType) {
      this.animalType = animalType;
    }

    @Override
    public String toString() {
      return animalType;
    }

  }

}
