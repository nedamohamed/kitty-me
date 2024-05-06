package com.example.planetsapp;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cat implements Serializable {

    private String id;
    private String  catName;
    private Location location;
    private String description;
    private String ownerPhone;
    private int img;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Cat(String catName, Location location, String description, String ownerPhone, int image) {
        this.catName = catName;
        this.location = location;
        this.description = description;
        this.ownerPhone = ownerPhone;
        this.img = image;
    }
@NonNull
    public static List <Cat> getallCat(){
        Location address1 = new Location("Istanbul", "33458", "Kadikoy");
        Location address2 = new Location("Istanbul", "47292", "Tuzla");
        Location address3 = new Location("Istanbul", "46829", "Uskudar");
        Location address4 = new Location("Istanbul", "90283", "Beyoglu");
        Location address5 = new Location("Bursa", "47924", "Bursa");
        Location address6 = new Location("Ankara", "06520", "Cankaya");
        Location address7 = new Location("Izmir", "35100", "Konak");
        Location address8 = new Location("Antalya", "07070", "Konyaalti");

        Cat cat1 = new Cat("Simba", address1, "2-month-old grey cat. Enjoys being cuddled. Loves playing with toy mice.", "0531 193 19 23", R.drawable.cat2);
        Cat cat2 = new Cat("Leo", address2, "1-year-old orange tabby. Enjoys lounging in sunny spots. Playful and curious.", "0555 555 55 55", R.drawable.cat3);
        Cat cat3 = new Cat("Sam", address3,  "3-month-old black and white kitten. Loves chasing laser pointers. Very energetic.", "0544 321 98 76", R.drawable.cat4);
        Cat cat4 = new Cat("Selim", address4, "5-year-old Siamese cat. Enjoys napping in warm laps. Gentle and affectionate.", "0502 987 65 43", R.drawable.cat5);
        Cat cat5 = new Cat("Wayne",  address5,"4-month-old calico cat. Friendly and social. Enjoys meeting new people.", "0567 890 12 34", R.drawable.cat6);
        Cat cat6 = new Cat("Mittens", address6, "6-month-old fluffy Persian cat. Enjoys grooming sessions. Playful and graceful.", "0530 111 22 33",  R.drawable.cat7);
        Cat cat7 = new Cat("Whiskers", address7,  "2-year-old tuxedo cat. Enjoys birdwatching. Independent and curious.", "0541 333 44 55", R.drawable.cat8);
        Cat cat8 = new Cat("Oliver", address8,  "8-month-old gray and white kitten. Loves climbing on cat trees. Playful and mischievous.", "0552 678 90 12", R.drawable.cat9);

        List<Cat> cat = new ArrayList<>();
        cat.add(cat1);
        cat.add(cat2);
        cat.add(cat3);
        cat.add(cat4);
        cat.add(cat5);
        cat.add(cat6);
        cat.add(cat7);
        cat.add(cat8);

        return cat;


    }



}

