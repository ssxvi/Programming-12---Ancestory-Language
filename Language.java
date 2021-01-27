//Language Program
//
//@Trevor
//
//@1/20/21
//


public class Language{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    static String output;
    


    Language(String nameP, int numSpeakersP, String regionSpokenP, String wordOrderP){
        this.name = nameP;
        this.numSpeakers = numSpeakersP;
        this.regionsSpoken = regionSpokenP;
        this.wordOrder = wordOrderP;
    }

    public String getInfo(){
        return name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The languge follows the word order: " + wordOrder + ".";
    }

    public static void main(String args[]){
    //Language Mayan = new Mayan("Yucatec", 812633);
    Language Chinese = new SinoTibetan("chwinese", 812633);
    //System.out.println(Mayan.getInfo());
    System.out.println(Chinese.getInfo());
    }

}


//Test code

    /*
    Language English = new Language("English", 1000, "West", "subject-verb-object");
    
    English.getInfo();
    System.out.println(output);
    */ 