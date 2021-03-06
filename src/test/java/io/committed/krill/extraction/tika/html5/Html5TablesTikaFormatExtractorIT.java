package io.committed.krill.extraction.tika.html5;

import org.junit.Test;

import io.committed.krill.extraction.tika.helper.AbstractTikaFormatExtractorIT;

public class Html5TablesTikaFormatExtractorIT extends AbstractTikaFormatExtractorIT {

  private static final String RESOURCE_NAME = "html5-tables.html";

  public Html5TablesTikaFormatExtractorIT() {
    super(RESOURCE_NAME);
  }


  @Test
  public void testBody() {
    assertBody("" + "<main class=\"Document\"> \n" + " <section> \n" + "  <h2>Tables</h2> \n"
        + "  <p>Tables can be simple text:</p> \n" + "  <table> \n" + "   <tbody> \n"
        + "    <tr> \n" + "     <td>1a</td> \n" + "     <td>1b</td> \n" + "     <td>1c</td> \n"
        + "     <td>1d</td> \n" + "    </tr> \n" + "    <tr> \n" + "     <td>2a</td> \n"
        + "     <td>2b</td> \n" + "     <td>2c</td> \n" + "     <td>2d</td> \n" + "    </tr> \n"
        + "    <tr> \n" + "     <td>3a</td> \n" + "     <td>3b</td> \n" + "     <td>3c</td> \n"
        + "     <td>3d</td> \n" + "    </tr> \n" + "   </tbody> \n" + "  </table> \n"
        + "  <p>Have headings:</p> \n" + "  <table> \n" + "   <tbody> \n" + "    <tr> \n"
        + "     <th>a</th> \n" + "     <th>b</th> \n" + "     <th>c</th> \n" + "     <th>d</th> \n"
        + "    </tr> \n" + "    <tr> \n" + "     <td>1a</td> \n" + "     <td>1b</td> \n"
        + "     <td>1c</td> \n" + "     <td>1d</td> \n" + "    </tr> \n" + "    <tr> \n"
        + "     <td>2a</td> \n" + "     <td>2b</td> \n" + "     <td>2c</td> \n"
        + "     <td>2d</td> \n" + "    </tr> \n" + "    <tr> \n" + "     <td>3a</td> \n"
        + "     <td>3b</td> \n" + "     <td>3c</td> \n" + "     <td>3d</td> \n" + "    </tr> \n"
        + "   </tbody> \n" + "  </table> \n" + "  <p>Have a header, body, and footer:</p> \n"
        + "  <table> \n" + "   <thead> \n" + "    <tr> \n" + "     <th>a</th> \n"
        + "     <th>b</th> \n" + "     <th>c</th> \n" + "     <th>d</th> \n" + "    </tr> \n"
        + "   </thead> \n" + "   <tbody> \n" + "    <tr> \n" + "     <td>1a</td> \n"
        + "     <td>1b</td> \n" + "     <td>1c</td> \n" + "     <td>1d</td> \n" + "    </tr> \n"
        + "    <tr> \n" + "     <td>2a</td> \n" + "     <td>2b</td> \n" + "     <td>2c</td> \n"
        + "     <td>2d</td> \n" + "    </tr> \n" + "    <tr> \n" + "     <td>3a</td> \n"
        + "     <td>3b</td> \n" + "     <td>3c</td> \n" + "     <td>3d</td> \n" + "    </tr> \n"
        + "   </tbody> \n" + "   <tfoot> \n" + "    <tr> \n" + "     <td>A</td> \n"
        + "     <td>B</td> \n" + "     <td>C</td> \n" + "     <td>D</td> \n" + "    </tr> \n"
        + "   </tfoot> \n" + "  </table> \n" + "  <p>Cells can contain rich HTML:</p> \n"
        + "  <table> \n" + "   <tbody> \n" + "    <tr> \n" + "     <td><h1>Heading1</h1> </td> \n"
        + "     <td><h2>Heading 2</h2> </td> \n" + "     <td><h3>Heading 3</h3> </td> \n"
        + "     <td>etc</td> \n" + "    </tr> \n" + "    <tr> \n" + "     <td> \n" + "      <ol> \n"
        + "       <li>Ordered</li> \n" + "       <li>Lists</li> \n" + "      </ol> </td> \n"
        + "     <td> \n" + "      <ul> \n" + "       <li>Unordered</li> \n"
        + "       <li>lists</li> \n" + "      </ul> </td> \n" + "     <td> \n" + "      <dl> \n"
        + "       <dt>\n" + "         Definition \n" + "       </dt> \n" + "       <dd>\n"
        + "         lists \n" + "       </dd> \n" + "      </dl> </td> \n" + "     <td>etc</td> \n"
        + "    </tr> \n" + "    <tr> \n" + "     <td> \n" + "      <table> \n" + "       <tbody> \n"
        + "        <tr> \n" + "         <td>and</td> \n" + "         <td>even</td> \n"
        + "        </tr> \n" + "        <tr> \n" + "         <td>tables</td> \n"
        + "         <td>(for those so inclined)</td> \n" + "        </tr> \n" + "       </tbody> \n"
        + "      </table> </td> \n" + "     <td>why</td> \n" + "     <td>why</td> \n"
        + "     <td>why?</td> \n" + "    </tr> \n" + "   </tbody> \n" + "  </table> \n"
        + " </section> \n" + "</main>");
  }

}
