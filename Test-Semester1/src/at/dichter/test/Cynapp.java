package at.dichter.test;

import java.util.LinkedList;
import java.util.List;

public class Cynapp {
    final static int MAX_NUMBER_OF_DEVICES = 4;
    private List<Device> devices = new LinkedList<Device>();
    private Beamer connectedBeamer;

    public Cynapp(Beamer connectedBeamer) {
        this.connectedBeamer = connectedBeamer;
    }

    public void setActive(int index) {
        for (int i = 0; i < this.devices.size(); i++) {
            if(i == index) {
                devices.get(index).setActive(true);
                continue;
            }
            this.devices.get(i).setActive(false);
        }
    }

    public void addDevice(Device d) {
        if(this.devices.size() <= MAX_NUMBER_OF_DEVICES) {
            this.devices.add(d);
        }
    }

    public void showDevice(int index) {
        connectedBeamer.show(this.devices.get(index).getContent());
    }

    public void listDevices() {
        for (int i = 0; i < this.devices.size(); i++) {
            String string = String.format("%d. %s", i, this.devices.get(i).getContent());
            System.out.println(string);
        }
    }
}
