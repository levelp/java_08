/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.io.File;

import org.w3c.dom.Document;

/*
Требования к разного рода програмным продуктам постоянно растут.
Отчеты по выполнению операций приложения должны формироваться в разном виде: XML, HTML, текст и т.д.
Это как раз тот случай, когда удобно использовать паттерн Factory.
*/
public class FactoryMethod {
    public AbstractWriter getWriter(Object object) {
        AbstractWriter writer = null;
        if (object instanceof File) {
            writer = new ConcreteFileWriter();
        } else if (object instanceof Document) {
            writer = new ConcreteXmlWriter();
        }
        return writer;
    }
}

abstract class AbstractWriter {
    public abstract void write(Object context);
}

class ConcreteFileWriter extends AbstractWriter {
    public void write(Object context) {
        // method body
    }
}

class ConcreteXmlWriter extends AbstractWriter {
    public void write(Object context) {
        // method body
    }
}
