import java.util.ArrayList;
public class Planet {
    private int orbitTime;
    private ArrayList<Moon> moons = new ArrayList<>();
    private String designation;

    public Planet(){

    }

    public Planet(int orbitTime, String designation){
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

    public void setMoons(ArrayList<Moon> moons) {
        this.moons = moons;
    }

    public void addMoon(Moon moon){
        moons.add(moon);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Planet){
            Planet other = (Planet) obj;
            if(this.orbitTime == other.orbitTime){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Orbit Time: " + orbitTime;
    }
}
