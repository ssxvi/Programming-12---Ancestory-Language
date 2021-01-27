public class Mayan extends Language{

    Mayan(String nameP, int numSpeakersP){
        super(nameP, numSpeakersP,"Central America", "verb-object-subject");
  
    }
     
    @Override
    public String getInfo(){
        return name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ". The languge follows the word order: " + wordOrder + ". Fun Fact! " + " is an Ergative language!";
    }

}
