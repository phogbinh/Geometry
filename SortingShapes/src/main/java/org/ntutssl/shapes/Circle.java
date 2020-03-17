package org.ntutssl.shapes;

public class Circle implements Measurable
{
    private final String ERROR_RADIUS_IS_NONPOSITIVE = "The given radius is nonpositive";
    private double _radius;

    public Circle( double radius )
    {
        if ( radius <= 0.0 )
        {
            throw new IllegalArgumentException( ERROR_RADIUS_IS_NONPOSITIVE );
        }
        _radius = radius;
    }

    public double getArea()
    {
        return _radius * _radius * Math.PI;
    }

    public double getPerimeter()
    {
        return _radius * 2.0 * Math.PI;
    }

    public String toString()
    {
        return Definitions.CIRCLE + Definitions.SPACE + _radius;
    }
}