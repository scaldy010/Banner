### tasks 
Create 5 java clases 

1. Menu
1. Search 
1. Parts 
1. Droid 
1. Setup 
1. Main

## Droid class 
All Androids have the following parts:

1. brain : 2.5GHZ / 3.5GHZ / 4.5GHZ
1. mobility :catapilar tracks  / wheels / legs
1. vision : heat vision / full colour / night vision
1. arms : claws / grippers / articulated fingers
1. media center :sony / jvc / meridian
1. Power Plant : lithium / hydrogen / plasma (40 watt range)



```java 
 public  class Droid 
{
        private String name; 

   
        
        private String brain;
        private String mobility;
        private String vision;
        private String arms;
        private String mediaCenter;
        private String powerPlant;
        
    public Droid() {}
    public Droid(String name,String brain, String mobility, String vision, String arms, String mediaCenter, String powerPlant)
    {
       this.name = name;
        this.brain = brain;
        this.mobility = mobility;
        this.vision = vision;
        this.arms = arms;
        this.mediaCenter = mediaCenter;
        this.powerPlant = powerPlant;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrain() {
        return brain;
    }

    public void setBrain(String brain) {
        this.brain = brain;
    }

    public String getMobility() {
        return mobility;
    }

    public void setMobility(String mobility) {
        this.mobility = mobility;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getArms() {
        return arms;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public String getMediaCenter() {
        return mediaCenter;
    }

    public void setMediaCenter(String mediaCenter) {
        this.mediaCenter = mediaCenter;
    }

    public String getPowerPlant() {
        return powerPlant;
    }

    public void setPowerPlant(String powerPlant) {
        this.powerPlant = powerPlant;
    }
   
        
}
```
---

## parts 

```java
public class Parts 
{
   private String[] name  ={"Android mk1 ","Android mk2 ","Android mk3 ","Android mk4 ","android mk5"};
   private String[] brain  ={"2.5GHZ", "3.5GHZ", "4.5GHZ"};
   private String[] mobility   ={"catapilar tracks", "wheels", "legs"};
   private String[] vision   ={"heat vision", "full colour", "night vision"};
   private String[] arms   ={"claws", "grippers", "articulated fingers"};
   private String[] mediaCenter   ={"sony", "jvc", "meridian"};
   private String[] powerPlant   ={"lithium", "hydrogen","plasma (40 watt range)"};
   
   
   
   

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getBrain() {
        return brain;
    }

    public void setBrain(String[] brain) {
        this.brain = brain;
    }

    public String[] getMobility() {
        return mobility;
    }

    public void setMobility(String[] mobility) {
        this.mobility = mobility;
    }

    public String[] getVision() {
        return vision;
    }

    public void setVision(String[] vision) {
        this.vision = vision;
    }

    public String[] getArms() {
        return arms;
    }

    public void setArms(String[] arms) {
        this.arms = arms;
    }

    public String[] getMediaCenter() {
        return mediaCenter;
    }

    public void setMediaCenter(String[] mediaCenter) {
        this.mediaCenter = mediaCenter;
    }

    public String[] getPowerPlant() {
        return powerPlant;
    }

    public void setPowerPlant(String[] powerPlant) {
        this.powerPlant = powerPlant;
    }
 
}
```

### Setup class 

Requirments 
1. create 500 random droids from the list of parts in hash map (old droids)
1. each droidmust have a unique 7 digit serial number which should be used as the key 


2. randomly create 400 new droids using 2 parts from the old droids (again with a unique serial number) also stored in a hashmap 

### search class 
#### A user can search for and view:
1. All available models of a particular type. (eg. View all Betty the Busibot models)
1. One model of a particular type (eg. Single Andy the Android)
1. Total counts of available types (eg how many Andy, how many Betty…etc.)
1. A model that donated a particular part (ie. output of donor model and part donated and receiving model)

### Menue class 

A class used to show users a menue 

### main class 

Class used to run 











