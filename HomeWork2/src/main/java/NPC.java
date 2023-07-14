class NPC implements HP{
    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public NPC() {
        this.maxHealthPoint = 160;
        this.currentHealthPoint = maxHealthPoint;
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
    public int setCurrentHealthPoint(int currentHealthPoint) {
        if (currentHealthPoint < 0){
            this.currentHealthPoint = 0;
        }
        else {
            this.currentHealthPoint = currentHealthPoint;
        }
        return currentHealthPoint;
    }

    @Override
    public String toString() {
        return "NPC: ";
    }
}
