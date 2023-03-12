public class Cube {
    private int side = 1;

    public Cube (int a)
    {
        if (a < 1)
        {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else
        {
            side = a;
        }
    }

    public Cube ()
    {
        side = 1;
    }

    public void setSide(int i)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else
        {
            side = i;
        }
    }

    public int getSide()
    {
        return side;

    }

    public int getSurfaceArea ()
    {
        int square = side * side;
        return (6 * square);
    }

    public int getVolume ()
    {
        int vol = side * side * side;
        return (vol);
    }



}


