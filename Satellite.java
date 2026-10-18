package JOURNAL.Sun;

import JOURNAL.Sun.Stars;
import JOURNAL.Sun.Planet;

public class Satellite {
    public static void main(String[] args) {
        Stars starObj = new Stars();
        Planet planetObj = new Planet();

        starObj.shine();
        planetObj.orbit();
    }
}