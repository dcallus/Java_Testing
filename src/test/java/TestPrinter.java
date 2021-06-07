import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaper(){
        assertEquals(30, printer.getSheetCount());
    }

    @Test
    public void print(){
        printer.print(5, 4);
        assertEquals(10, printer.getSheetCount());
    }

    @Test
    public void dontPrint(){
        printer.print(10, 4);
        assertEquals(30, printer.getSheetCount());
    }

    @Test
    public void reducesToner(){
        printer.print(5, 4);
        assertEquals(0, printer.getTonerCount());
    }

    @Test
    public void doesntReduceToner(){
        printer.print(10, 4);
        assertEquals(30, printer.getSheetCount());
    }

}
