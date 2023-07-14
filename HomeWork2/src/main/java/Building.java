public class Building implements HP{

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья


    public Building() {
        this.maxHealthPoint = 1500;
        this.currentHealthPoint = maxHealthPoint;
    }

    @Override
    public String toString() {
        return "Building: ";
    }

    @Override
    public int getMaxXP() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrRndXP() {
        return currentHealthPoint;
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
}
