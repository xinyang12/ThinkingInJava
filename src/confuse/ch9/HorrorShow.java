package confuse.ch9;

interface Monster {
    void menace();
}

// 继承Monster
interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

// 实现DangerousMonster
class DragonZilla implements DangerousMonster {
    public void menace() {}
    public void destroy() {}
}

// 继承DangerousMonster, Lethal
interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

// 实现Vampire
class VeryBadVampire implements Vampire {
    public void menace() {}
    public void destroy() {}
    public void kill() {}
    public void drinkBlood() {}
}

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) {
        l.kill();
    }
    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
