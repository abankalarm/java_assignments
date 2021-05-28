import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        player batsman1 = new player(1,"karan","S");
        //player keeper1 = new player(2,"dhoni","S");
        //player allrounder = new player(3,"sehwag","S");
        int karan_wage = batsman1.batsman(100);
        System.out.println(karan_wage);
    }
}

class Defaultlol{
    int total_runs;
    int total_wickets;
    
    Defaultlol(){
        Scanner n = new Scanner(System.in);
        this.total_runs = n.nextInt();
        this.total_wickets = n.nextInt();
    }
}

class player extends Defaultlol{
    int id;
    String name;
    String star;
    int wage;
    int wicket;
    int runs;
    int catches;
    int stumps;
    int run_outs;
    player(){}
    player(int id, String name, String star){
        this.id = id;
        this.name = name;
        this.star = star;
        if (this.star=="S"){
            this.wage =1000000;
        }
        else{
            this.wage = 500000;
        }
    }
    public int batsman(int runs){
        this.runs= runs;
        this.wage += (this.runs/total_runs)*100000;
        return this.wage;
    }
    public int bowler(int wicket){
        this.wicket= wicket;
        this.wage += (this.wicket/total_wickets)*100000;
        return this.wage;
    }
    public int keeper(int catches, int stumps, int run_outs){
        this.catches = catches;
        this.stumps = stumps;
        this.run_outs = run_outs;
        this.wage += (this.catches+this.stumps+this.run_outs/4)*100000;
        return this.wage;
    }
    public int allrounder(int runs, int wicket) {
        batsman(runs);
        bowler(wicket);
        return this.wage;
    }
}