package CreationalDesignPatterns.Factory.FactoryMethod;

class PointFactory {
    static Point newCartesianPoint()
    {
        return new Point((double) 1, (double) 2);
    }

    static Point newPolarPoint()
    {
        return new Point((double) 1 *Math.cos((double) 2), (double) 1 *Math.sin((double) 2));
    }
}
