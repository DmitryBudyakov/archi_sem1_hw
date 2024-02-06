package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Camera {
    public Point3D location;
    public Angle3D angle;

    public void rotate(Angle3D angle){
        System.out.println("Вращение на угол " + angle);
    }

    public void move(Point3D point){
        System.out.println("Перемещение на координаты " + point);
    }
}
