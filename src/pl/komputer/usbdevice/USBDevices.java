package pl.komputer.usbdevice;

public interface USBDevices {
    boolean connect();
    boolean disconnect();
    String getName();


}
