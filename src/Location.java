import java.util.ArrayList;
public class Location {
        private ArrayList<Creature>creatures=new ArrayList<Creature>();
        public void AddCreature(Creature newCreature){
            creatures.add(newCreature);
        }

        public void PringCreatures(){
            if (creatures.size()>0){
                System.out.println(creatures.get(0).GetName());
            }
        }
        public Creature GetCreature(int index){
            return creatures.get(index);
        }
}