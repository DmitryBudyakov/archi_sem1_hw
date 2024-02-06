package ModelElements;

import java.util.List;

public class Scene {

    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene(int id, List<PoligonalModel> models, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.cameras = cameras;
    }

    /**
     * Метод на основе 1-го параметра
     * @param t
     * @return
     * @param <T>
     */
    public <T> T method1(T t){
        return t;
    }


    /**
     * Метод на основе 2-х параметров
     * @param t1
     * @param t2
     * @return
     * @param <T>
     */
    public <T> T method2(T t1, T t2){
        return null;
    }
}
