
public class Football implements Team {

    String TeamName;

    int points;

    String sponser;

    //Constructor

    public Football(String teamName,int points,String sponser){
        this.TeamName=teamName;
        this.points=points;
        this.sponser=sponser;

    }
    //Overrirding methods to interface

    @Override
    public int getPoints(){

        return points;
    }
    //Method to update points
    @Override
    public void updatePoints(String result){
        if (result.equals("Win"))points+=3;
        else if (result.equals("Draw")) points+=1;

    }
    @Override
    public String getTeamName(){
        return TeamName;

    }
    public String getSponser(){
        return sponser;
    }
}
