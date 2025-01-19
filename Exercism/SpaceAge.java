package Exercism;

class SpaceAge {
    double seconds;
    double earthYear = 365.25;
    double earthSeconds = earthYear*24*60*60;
    double earthAge;
    
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth(){
        return seconds/earthSeconds;
    }

    double onMercury() {
        return onEarth()/0.2408467;
    }

    double onVenus() {
        return onEarth()/0.61519726;
    }

    double onMars() {
        return onEarth()/1.8808158;
    }

    double onJupiter() {
        return onEarth()/11.862615;
    }

    double onSaturn() {
        return onEarth()/29.447498;
    }

    double onUranus() {
        return onEarth()/84.016846;
    }

    double onNeptune() {
        return onEarth()/164.79132;
    }

    public static void main(String[] args) {
        SpaceAge space = new SpaceAge(365.25*24*60*60);
        double neptune = space.onNeptune();
        System.out.println(neptune);
        
    }
}