public class Cube {
    //Properties
    private int side;

    public Cube(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        side = length;
    }
    public Cube(){
        this.side=1;
    }
    public void setSide(int side)throws IllegalArgumentException{
        if (side < 1 ){
            throw new IllegalArgumentException ("A cube’s side length cannot be less than 1!");
        }
        this.side=side;
    }
    public int getSide(){
        return side;
    }

    public int getSurfaceArea(){
        int SurfaceArea = side*side*6;
        return SurfaceArea;
    }
    public int getVolume(){
        int volume = side*side*side;
        return volume;
    }
    public void toStrinb(){
        System.out.println("Cube(side="+side+"}");
    }

}
