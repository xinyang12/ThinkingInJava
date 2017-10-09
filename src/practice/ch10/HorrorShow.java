package practice.ch10;

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
    public static DangerousMonster getDangerousMonster() {
        return new DangerousMonster() {
            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
    }
    public static Vampire getVampire() {
        return new Vampire() {
            @Override
            public void drinkBlood() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void menace() {

            }
        };
    }
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
        // 这个是直接new的方式
        // DangerousMonster barney = new DragonZilla();
        // 这个是用匿名内部类的方式
        DangerousMonster barney = getDangerousMonster();
        u(barney);
        v(barney);
//        Vampire vlad = new VeryBadVampire();
        Vampire vlad = getVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
