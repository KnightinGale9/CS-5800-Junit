package Assignment7.flyweight;

import java.util.Objects;

public class CharacterProperties {
    private Font font;
    private Color color;
    private Size size;
    public CharacterProperties(){}
    public CharacterProperties(Font font, Color color, Size size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }
    public String getFont() {
        return font.getFont();
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public String getColor() {
        return color.getColor();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size.getSize();
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterProperties that = (CharacterProperties) o;
        return Objects.equals(font, that.font) && Objects.equals(color, that.color) && Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(font, color, size);
    }
}
