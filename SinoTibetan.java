public class SinoTibetan extends Language{

    static String wordOrder = "subject-object-verb";

    SinoTibetan(String nameP, int numSpeakersP){
        super(nameP, numSpeakersP,"Asia", wordOrder);
  
        if(nameP.toLowerCase().contains("chinese")){
            wordOrder = "subject-verb-object";
        };
    }



  
     
    @Override
    public String getInfo(){
        return name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The languge follows the word order: " + wordOrder + ". Fun Fact! " + " is an Ergative language!";
    }

}

