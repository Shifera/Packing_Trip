package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Closet {

  private ArrayList<Jacket> jackets=new ArrayList<>();
  private ArrayList<Shirt>shirts=new ArrayList<>();
  private ArrayList<Pant> pants=new ArrayList<>();
  private ArrayList<FootWear> footWears=new ArrayList<>();

public Closet(){
}
public void addJacket(){
        Jacket jacket1=new Jacket(12, "red", "new","thick" );
        Jacket jacket2=new Jacket(13, "blue", "old","thin" );
        Jacket jacket3=new Jacket(14, "yellow", "new","thick" );
        jackets.add(jacket1);
        jackets.add(jacket2);
        jackets.add(jacket3);
    }
    public String getJacket(){
        Random r= new Random();
        int myRan;
        myRan = r.nextInt(3);
        return jackets.get(myRan).toString();

    }
    public void addShirt(){
        Shirt shirt1=new Shirt(16, "yellow", "new","thin", "long",true);
        Shirt shirt2=new Shirt(17, "red", "new","thick", "long",true);
        Shirt shirt3=new Shirt(18, "red", "new","thick", "long",true);
        shirts.add(shirt1);
        shirts.add(shirt2);
        shirts.add(shirt3);
    }
    public String getShirt(){
        Random r= new Random();
        int myRan;
        myRan = r.nextInt(3);
        return shirts.get(myRan).toString();

    }
    public void addPant(){
        Pant pant1=new Pant(16, "yellow", "new","thin",true);
        Pant pant2=new Pant(17, "red", "new","thick", true);
        Pant pant3=new Pant(18, "red", "new","thick",true);
        pants.add(pant1);
        pants.add(pant2);
        pants.add(pant3);
    }
    public String getPant(){
        Random r= new Random();
        int myRan;
        myRan = r.nextInt(3);
        return pants.get(myRan).toString();
    }
    public void addFootWear(){
        FootWear footWear1=new FootWear(6, "red", "new","thick" );
        FootWear footWear2=new FootWear(5, "red", "new","thick" );
        FootWear footWear3=new FootWear(7, "red", "new","thick" );
        footWears.add(footWear1);
        footWears.add(footWear2);
        footWears.add(footWear3);
    }
    public String getFootWear(){
        Random r= new Random();
        int myRan;
        myRan = r.nextInt(3);
        return footWears.get(myRan).toString();
    }
}
