package Assignment7;

import Assignment7.flyweight.DocServer;
import Assignment7.flyweight.FlyWeightFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FlyweightDesignPatternTest {
    @Test
    public void MakeDocument(){
        FlyWeightFactory factory = new FlyWeightFactory();
        String expectedOutput ="HelloWorldCS5800";
        DocServer docServer = new DocServer("test.docx");
        docServer.addText('H',factory.getCharacterProperties("Times","0000FF",80));
        docServer.addText('e',factory.getCharacterProperties("Times","0000FF",80));
        docServer.addText('l',factory.getCharacterProperties("Times","0000FF",80));
        docServer.addText('l',factory.getCharacterProperties("Times","0000FF",80));
        docServer.addText('o',factory.getCharacterProperties("Times","0000FF",80));

        docServer.addText('W',factory.getCharacterProperties("Arial","FF0000",60));
        docServer.addText('o',factory.getCharacterProperties("Arial","FF0000",60));
        docServer.addText('r',factory.getCharacterProperties("Arial","FF0000",60));
        docServer.addText('l',factory.getCharacterProperties("Arial","FF0000",60));
        docServer.addText('d',factory.getCharacterProperties("Arial","FF0000",60));

        docServer.addText('C',factory.getCharacterProperties("Calibri","000000",40));
        docServer.addText('S',factory.getCharacterProperties("Calibri","000000",40));

        docServer.addText('5',factory.getCharacterProperties("Verdana","00FF00",20));
        docServer.addText('8',factory.getCharacterProperties("Verdana","00FF00",20));
        docServer.addText('0',factory.getCharacterProperties("Verdana","00FF00",20));
        docServer.addText('0',factory.getCharacterProperties("Verdana","00FF00",20));
        assertEquals(expectedOutput,docServer.getDocument());
    }
    @Test
    public void equivelentCharacterPropertiesTest()
    {
        FlyWeightFactory factory = new FlyWeightFactory();
        assertEquals(factory.getCharacterProperties("Times","0000FF",80),
        factory.getCharacterProperties("Times","0000FF",80));
    }
    @Test
    public void notEquivelentChacterPropertiesTest()
    {
        FlyWeightFactory factory = new FlyWeightFactory();
        assertNotEquals(factory.getCharacterProperties("Arial","0000FF",80),
                factory.getCharacterProperties("Times","0000FF",80));
    }
}

