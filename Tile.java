import java.awt.image.BufferedImage;


class Tile {
    private int Color;
    private BufferedImage picture;

    public Tile(int color) {
        this.Color = color;
        colorChooser(Color);
    }

    public void setTile(int color) {
        this.Color = color;
        colorChooser(Color);
    }

    public void colorChooser(int color) {
        try {
            System.out.println("test");
//            switch (color) { // add in future
//                case 1:
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    break;
//            }
        } catch (Exception e) {
            System.out.println(color + "does not work");
        }
    }

    public BufferedImage getPicture() {
        return picture;
    }

    public int getColor() {
        return Color;
    }
}
