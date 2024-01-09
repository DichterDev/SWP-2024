import at.dichter.test.AirPlay;
import at.dichter.test.Beamer;
import at.dichter.test.Cynapp;
import at.dichter.test.Miracast;

public class Main {
    public static void main(String[] args) {
        Beamer beamer = new Beamer();
        Miracast mira1 = new Miracast("mira1");
        Miracast mira2 = new Miracast("mira2");
        AirPlay ap1 = new AirPlay("ap1");
        AirPlay ap2 = new AirPlay("ap2");
        Cynapp cyn = new Cynapp(beamer);
        cyn.addDevice(mira1);
        cyn.addDevice(mira2);
        cyn.addDevice(ap1);
        cyn.addDevice(ap2);
        cyn.listDevices();
        cyn.showDevice(1);
    }
}