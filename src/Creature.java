public class Creature{
    public Creature (String newname){
        name = newname ;
    }
    public static void Print(Creature creature){
        creature.PrintName();
    }

    private String name = "mon";
        private int health = 100;
        private int damage = 15;
        private Position positionCreature=new Position(0,0);




        public String GetName () {
            return name;
        }

        public void SetName ( String rety){
            name = rety;
        }

        public void PrintName () {
            System.out.println(name);
        }

        public int GetHealth () {
            return health;
        }

        public void SetHealtch ( int number){
            health = number;
        }

        public void PrintHealtch () {
            System.out.println(health);
        }

        public int GetDamage () {
            return damage;
        }

        public void SetDamage ( int number){
            damage = number;
        }

        public void PrintDamage () {
            System.out.println(damage);
        }
        public Position GetpositionCreature (){
            return positionCreature;
        }
        public void SetpositionCreature(Position yugr){
            positionCreature =yugr;
        }
        public void PrintpositionCreature(){
            System.out.println(positionCreature.GetPositionString());
        }

        class Player extends Creature{
            public Player(String newname){
                super(newname);
            }
        }
        class Monster extends Creature{
            public Monster(String newname){
                super(newname);
            }
        }

    }