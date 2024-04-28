package Assignment7.flyweight;

public class flyweightDriver {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();

        DocServer docServer = new DocServer("sample.docx");
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

        docServer.saveDocument();
        System.out.println(docServer.getDocument());
    }
}
