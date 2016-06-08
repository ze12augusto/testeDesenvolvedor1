package br.com.zup.testedesenvolvedor1;

/**
 *
 * @author ze12augusto
 */
public class Map {
    private Integer maxX;
    private Integer maxY;
    private Integer minY;
    private Integer minX;

    public Map(Integer maxX, Integer maxY, Integer minY, Integer minX) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.minY = minY;
        this.minX = minX;
    }

    public Integer getMaxX() {
        return maxX;
    }

    public void setMaxX(Integer maxX) {
        this.maxX = maxX;
    }

    public Integer getMaxY() {
        return maxY;
    }

    public void setMaxY(Integer maxY) {
        this.maxY = maxY;
    }

    public Integer getMinY() {
        return minY;
    }

    public void setMinY(Integer minY) {
        this.minY = minY;
    }

    public Integer getMinX() {
        return minX;
    }

    public void setMinX(Integer minX) {
        this.minX = minX;
    }
}
