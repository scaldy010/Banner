/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 *
 * @author Roryh
 */

    
    public  class Robot 
{
        private String name; 
        
        private String brain;
        private String mobility;
        private String vision;
        private String arms;
        private String mediaCenter;
        private String powerPlant;
        

    public Robot(String name,String brain, String mobility, String vision, String arms, String mediaCenter, String powerPlant)
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
   