public class Main {

    public static void main(String[] args) {

        Render render = new Render();

        Building building = new Building();
        System.out.println(building);
        render.showIndicator(building);

        Hero hero = new Hero();
        System.out.println(hero);
        render.showIndicator(hero);

        NPC npc = new NPC();
        System.out.println(npc);
        render.showIndicator(npc);

        System.out.println("Наш враг - " + npc + "\n");
        hero.getAttack(npc);

        System.out.println("Наш враг - " + building + "\n");
        hero.getAttack(building);

        System.out.println("Наш враг - " + hero);
        hero.getAttack(hero);

    }

}
