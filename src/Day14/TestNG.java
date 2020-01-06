package Day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {
    @Test
    public void test(){
        String actual = "string";
        String expected ="string";
        Assert.assertEquals(actual, expected);
       // String actual = {"" ,"string"};
      //  String expected ={"string",""};
      //  Assert.assertEqualsNoOrder(actual,expected);    // eger stringlere bisey eklersek ama orderlari farkli olursa assertEqualsnoorder kullanicaz
    }

}
