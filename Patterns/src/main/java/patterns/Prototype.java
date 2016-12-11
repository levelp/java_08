package patterns;

/*
Шаблон Prototype позволяет создавать новые объекты на основе некоторого объекта-прототипа 
при этом совсем не обязательно знать как необходимый объект устроен.

Вот некоторые ситуации когда может помочь этот паттерн проектирования:
    1) если создание объектов (через оператор new) занимает длительный промежуток времени или требовательно к памяти;
    2) если создание объектов для клиента является нетривиальной задачей, например, когда объект составной;
    4) если клиент не знает специфики создания объекта.

    (Cloneable)
 */
public class Prototype {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();

        ComplicatedObject clone = prototype.copy();

        clone.setType(ComplicatedObject.Type.ONE);
    }
}

interface Copyable {
    Copyable copy();
}

class ComplicatedObject implements Copyable {

    Type type;

    public enum Type {
        ONE, TWO
    }

    public ComplicatedObject copy() {
        return new ComplicatedObject();
    }

    public void setType(Type type) {
        this.type = type;
    }
}