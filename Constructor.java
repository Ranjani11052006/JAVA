class VolumeBox {
    int length;
    int width;
    int height;

    VolumeBox(int l, int b, int h) {
        length = l;
        width = b;
        height = h;
    }
   void CalculateVolume1() {
        System.out.println("Volume of Box1: " + (length * width * height));
    }
   void CalculateVolume2() {
        System.out.println("Volume of Box2: " + (length * width * height));
    }

}

public class Constructor {
    public static void main(String[] args) {
        VolumeBox bx = new VolumeBox(11,5,6);
        bx.CalculateVolume1();

        VolumeBox bx2 = new VolumeBox(30,11,5);
        bx2.CalculateVolume2();
    }
}

