package pl.komputer;

import pl.komputer.drive.Drive;
import pl.komputer.usbdevice.USBDevices;

import java.util.LinkedList;
import java.util.List;

public class Computer { //stąd się wszystko zaczyna :)
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

    private List<USBDevices> usbDevices = new LinkedList<>();

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public List<USBDevices> getUsbDevices() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevices usbDevice) {
        boolean isConnect = usbDevice.connect();
        if(isConnect) {
            usbDevices.add(usbDevice);
        }
    }

    public void removeUSBDevice(USBDevices usbDevice) {
        boolean isDisconnected = usbDevice.disconnect();
        if(isDisconnected) {
            usbDevices.remove(usbDevice);
        }


    }
}
