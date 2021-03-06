package io.committed.krill.extraction.tika;

import org.junit.Ignore;
import org.junit.Test;

import io.committed.krill.extraction.tika.helper.AbstractTikaFormatExtractorIT;

public class XlsxSimple2SheetTikaFormatExtractorIT extends AbstractTikaFormatExtractorIT {

  private static final String RESOURCE_NAME = "simple-2sheet.xlsx";

  public XlsxSimple2SheetTikaFormatExtractorIT() {
    super(RESOURCE_NAME);
  }

  @Test
  /*
   * Will fail due to previous reliance on Apache Tika fork. This should pass in the next version of Tika
   */
  @Ignore
  public void testBody() {
    assertBody("" + "<main class=\"SpreadSheet\"> \n" + " <article class=\"Sheet\"> \n"
        + "  <h1>Sheet1</h1> \n" + "  <table> \n" + "   <tbody> \n" + "    <tr> \n"
        + "     <td>1-1a</td> \n" + "     <td>1-1b</td> \n" + "     <td>1-1c</td> \n"
        + "    </tr> \n" + "    <tr> \n" + "     <td>1-2a</td> \n" + "     <td>1-2b</td> \n"
        + "     <td>1-2c</td> \n" + "    </tr> \n" + "    <tr> \n" + "     <td>1-3a</td> \n"
        + "     <td>1-3b</td> \n" + "     <td>1-3c</td> \n" + "    </tr> \n" + "   </tbody> \n"
        + "  </table> \n" + " </article> \n" + " <article class=\"Sheet\"> \n"
        + "  <h1>Sheet2</h1> \n" + "  <table> \n" + "   <tbody> \n" + "    <tr> \n"
        + "     <td>2-1a</td> \n" + "     <td>2-1b</td> \n" + "     <td>2-1c</td> \n"
        + "    </tr> \n" + "    <tr> \n" + "     <td>2-2a</td> \n" + "     <td>2-2b</td> \n"
        + "     <td>2-2c</td> \n" + "    </tr> \n" + "    <tr> \n" + "     <td>2-3a</td> \n"
        + "     <td>2-3b</td> \n" + "     <td>2-3c</td> \n" + "    </tr> \n" + "   </tbody> \n"
        + "  </table> \n" + " </article> \n" + "</main>");
  }



}
