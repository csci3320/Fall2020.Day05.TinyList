public class Main{
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        TinyList tinyList = new TinyList();
        String word = new String("Pen");
        tinyList.setValue(word);
        Object getObject = tinyList.getValue();
        String getWord = (String)getObject;
        System.out.println(getWord);


        GenericTinyList<String> genericTinyList = new GenericTinyList<String>();
        String instrument = "sax";
        genericTinyList.setValue(instrument);
        String getInstrument = genericTinyList.getValue();
        System.out.println(getInstrument);
    }
}