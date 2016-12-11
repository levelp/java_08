package patterns;

/*
Используйте паттерн Абстрактная Фабрика в таких случаях:
    1) система не должна зависеть от способа создания объектов;
    2) система работает с одним из нескольких семейств объектов;
    3) объекты внутри семейства взаимосвязаны.
*/
public class AbstractFactory {
    public void createSquadron(CharactersFactory factory) {
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();
    }
}

interface Mage {
    public void cast();
}

interface Archer {
    public void shoot();
}

interface Warrior {
    public void attack();
}

interface CharactersFactory {
    abstract Mage createMage();

    abstract Archer createArcher();

    abstract Warrior createWarrior();
}

class ElfCharactersFactory implements CharactersFactory {
    public Mage createMage() {
        return new ElfMage();
    }

    public Archer createArcher() {
        return new ElfArcher();
    }

    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}

class ElfMage implements Mage {
    public void cast() {
        // использовать магию эльфов
    }
}

class ElfArcher implements Archer {
    public void shoot() {
        // использовать лук эльфов
    }
}

class ElfWarrior implements Warrior {
    public void attack() {
        // использовать меч эльфов
    }
}
