//Ben Geary     RKB18204


import java.util.LinkedList;

public class Rides {


    public boolean minHeight;
    public boolean maxHeight;
    public boolean wheelChair;
    public boolean groupSize;
    public boolean addrenaline;
    public boolean horror;
    public boolean kids;
    public boolean water;


    public Rides(boolean wc, boolean mih, boolean mxh, boolean gs, boolean a, boolean h, boolean k, boolean w) {
        wheelChair = wc;
        minHeight = mih;
        maxHeight = mxh;
        groupSize = gs;
        addrenaline = a;
        horror = h;
        kids = k;
        water = w;
    }

    public Rides() {
    }


    public static class MedievalAttributes {
        public void main(String args[]) {
            LinkedList<Rides> m = new LinkedList<>();

            m.add(new Rides(true, true, false, true, false, true, false, true));
            m.add(new Rides(true, true, false, true, false, true, false, true));
            m.add(new Rides(true, true, false, true, false, true, false, true));
            m.add(new Rides(true, true, false, true, false, true, false, true));
        }
    }

     public class FutrusticAttributes {
        public void main(String args[]) {
            LinkedList<Rides> f = new LinkedList<>();

            f.add(new Rides(true, true, false, true, false, true, false, true));
            f.add(new Rides(true, true, false, true, false, true, false, true));
            f.add(new Rides(true, true, false, true, false, true, false, true));
            f.add(new Rides(true, true, false, true, false, true, false, true));
        }
    }


    static class JurassicAttributes {
        public static void main(String args[]) {
            LinkedList<Rides> j = new LinkedList<>();

            j.add(new Rides(true, true, false, true, false, true, false, true));
            j.add(new Rides(true, true, false, true, false, true, false, true));
            j.add(new Rides(true, true, false, true, false, true, false, true));
            j.add(new Rides(true, true, false, true, false, true, false, true));
        }
    }


    static class IndustrialAttributes {
        public static void main(String args[]) {
            LinkedList<Rides> i = new LinkedList<>();

            i.add(new Rides(true, true, false, true, false, true, false, true));
            i.add(new Rides(true, true, false, true, false, true, false, true));
            i.add(new Rides(true, true, false, true, false, true, false, true));
            i.add(new Rides(true, true, false, true, false, true, false, true));
        }
    }


}