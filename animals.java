class DomesticAnimal {
    public void behavior() {
        System.out.println("Domestic animals are friendly.");
    }
}

class WildAnimal {
    public void behavior() {
        System.out.println("Wild animals are dangerous.");
    }
}

class Birds {
    public void behavior() {
        System.out.println("Birds can fly.");
    }
}

class Carnivores {
    public void behavior() {
        System.out.println("Carnivores eat meat.");
    }
}

class Herbivores {
    public void behavior() {
        System.out.println("Herbivores eat plants.");
    }
}

class Omnivores {
    public void behavior() {
        System.out.println("Omnivores eat both plants and meat.");
    }
}

public class animals {
  public static void main(String[] args) {
      DomesticAnimal domesticAnimal = new DomesticAnimal();
      WildAnimal wildAnimal = new WildAnimal();
      Birds birds = new Birds();
      Carnivores carnivores = new Carnivores();
      Herbivores herbivores = new Herbivores();
      Omnivores omnivores = new Omnivores();

      domesticAnimal.behavior();
      wildAnimal.behavior();
      birds.behavior();
      carnivores.behavior();
      herbivores.behavior();
      omnivores.behavior();
  }
}