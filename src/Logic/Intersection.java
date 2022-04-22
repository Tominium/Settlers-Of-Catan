package Logic;

import Structures.City;
import Structures.Settlement;
import Structures.Structure;

import javax.sound.sampled.Port;

public class Intersection {

    private Structure structure;
    private Port port;
    private IntersectionPosition pos;


    public Intersection(IntersectionPosition ip) {
        pos = ip;
        structure = null;
        port = null;

    }

    public Port getPort() {
        return port;
    }

    public IntersectionPosition getPosition() {
        return pos;
    }

    public void placeSettlement(Player p) {
        structure = new Settlement("settlement", p.getColor(), pos);
    }

    public void placeCity(Player p) {
        structure = new City("city", p.getColor(), pos);
    }

    public Structure getStructure() {
        return structure;
    }

    public void setPort(Port p) {
        port = p;
    }




}
