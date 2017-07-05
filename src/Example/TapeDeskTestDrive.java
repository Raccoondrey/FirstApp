package Example;

/**
 * Created by Kuznetsov on 12.03.2017.
 */
class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void PlayShare() {
        System.out.println("бах бах ба-бах");

    }


    void playTopHat() {
        System.out.println("динь динь ди-динь");
    }

}

class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.PlayShare();
        d.snare = false;
        if (d.snare == true) {
            d.PlayShare();

        }
        d.playTopHat();
    }
}