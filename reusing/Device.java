package reusing;

import reusing.BasicDevice.*;

class DeviceFail{
    public static void main(String[] args) {
        BasicDevice fail = new BasicDevice();
        fail.showS();
        fail.changeS("good - bye!");
        fail.showS();
    }
}
public class Device extends BasicDevice{
    public static void main(String[] args) {
        Device d = new Device();
        d.showS();
        d.changeS("Changed");
        d.showS();
        DeviceFail.main(args);
    }
}
