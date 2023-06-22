package oca.woof;

public enum Pet {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Pet(String s) {
        sound = s;
    }
}
