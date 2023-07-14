public class Hero implements HP, MP{

    private int maxHealthPoint;
    private int currentHealthPoint;

    private int maxManaPoint;
    private int currentManaPoint;
    private int attack;

    public Hero() {
        this.maxHealthPoint = 300;
        this.maxManaPoint = 200;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
        this.attack = 150;
    }

    @Override
    public int getMaxXP() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrRndXP() {
        return currentHealthPoint;
    }

    @Override
    public int getMaxRndMP() {
        return maxManaPoint;
    }

    @Override
    public int getCurrRndMP() {
        return currentManaPoint;
    }

    @Override
    public String toString() {
        return "Hero: ";
    }

    public int setCurrentHealthPoint(int currentHealthPoint) {
        if (currentHealthPoint < 0){
            this.currentHealthPoint = 0;
        }
        else {
            this.currentHealthPoint = currentHealthPoint;
        }
        return currentHealthPoint;
    }

    public <T extends HP> void getAttack(T obj) {
        int attc = this.attack;
        System.out.println("Текущая атака: " + attc);
        int crnXP = obj.getCurrRndXP();
        int count = 0;
        while((obj.getCurrRndXP()) > 0) {
            crnXP = obj.getCurrRndXP() - attc;
            obj.setCurrentHealthPoint(crnXP);
            Render.showIndicator(obj);
            count ++;
        }
        System.out.println("Враг мертв!");
        System.out.println("Вы убили врага за " + count + " ударов");
    }
}