package Assignment7.flyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlyWeightFactory {
    private Set<CharacterProperties> characterProperties;
    private Map<String,Color> colorSet;
    private Map<String,Font> fontSet;
    private Map<Integer,Size> sizeSet;
    public FlyWeightFactory(){
        characterProperties= new HashSet<>();
        colorSet=new HashMap<>();
        fontSet=new HashMap();
        sizeSet=new HashMap();
    }
    public CharacterProperties containCharacterProperties(String font,String color, int size) {
        if (fontSet.containsKey(font) && colorSet.containsKey(color) && sizeSet.containsKey(size)) {
            CharacterProperties temp = new CharacterProperties(
                    fontSet.get(font), colorSet.get(color), sizeSet.get(size));
            if(characterProperties.contains(temp))
            {
                return temp;
            }
        }
        return null;
    }
    public CharacterProperties getCharacterProperties(String font, String color, int size){
        CharacterProperties temp =containCharacterProperties(font,color,size);
        if(temp!=null){
            return temp;
        }
        CharacterProperties generate = new CharacterProperties();
        if(fontSet.containsKey(font)){
            generate.setFont(fontSet.get(font));
        }
        else{
            Font newFont = new Font(font);
            fontSet.put(font,newFont);
            generate.setFont(newFont);
        }
        if(colorSet.containsKey(color)){
            generate.setColor(colorSet.get(color));
        }
        else{
            Color newColor = new Color(color);
            colorSet.put(color,newColor);
            generate.setColor(newColor);
        }

        if(sizeSet.containsKey(size)){
            generate.setSize(sizeSet.get(size));
        }
        else{
            Size newSize = new Size(size);
            sizeSet.put(size,newSize);
            generate.setSize(newSize);
        }
        return generate;
    }
}
