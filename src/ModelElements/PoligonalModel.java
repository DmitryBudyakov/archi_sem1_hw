package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {

    public List<Texture> textures;
    public List<Poligon> poligons;

    /**
     * Конструктор с Textures
     * @param textures
     */
    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<>();

        poligons.add(new Poligon());
    }

    /**
     * Конструктор без Textures
     */
    public PoligonalModel() {
        this.poligons = new ArrayList<>();

        poligons.add(new Poligon());
    }

    /**
     * Добавление Poligon
     * @param poligon
     */
    public void addPoligon(Poligon poligon){
        poligons.add(poligon);
    }

    /**
     * Добавление Textures
     * @param texture
     */
    public void addTextures(Texture texture){
        textures.add(texture);
    }
}
