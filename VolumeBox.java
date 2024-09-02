class VolumeBox {
    int length;
    int width;
    int height;

    VolumeBox(int l, int b, int h) {
        length = l;
        width = b;
        height = h;
    }

    void CalculateVolume() {
        System.out.println("Volume: " + (length * width * height));
    }
}

public class Constructor {
    public static void main(String[] args) {
        VolumeBox bx = new VolumeBox(11,5,6);
        bx.CalculateVolume();

        VolumeBox bx2 = new VolumeBox(30,11,5);
        bx2.CalculateVolume();
    }
}

